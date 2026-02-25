package com.unibinary.bot;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.storage.LevelResource;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.nio.file.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * OpenClaw桥接 - 命令行版本
 * 直接通过命令行调用openclaw连接Minecraft和OpenClaw
 */
public class OpenClawBridge {
    private static final Logger LOGGER = LoggerFactory.getLogger("UnibinsBot/OpenClawBridge");
    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(4);
    
    // 命令行配置
    private static final String OPENCLAW_COMMAND = "openclaw";
    private static final boolean IS_WINDOWS = System.getProperty("os.name").toLowerCase().contains("win");
    private static final int COMMAND_TIMEOUT_SECONDS = 60;
    private static final String GAME_DIR = FabricLoader.getInstance().getGameDir().toString();
    
    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            LOGGER.info("注册OpenClaw命令行命令");
            
            // 主聊天命令
            dispatcher.register(
                Commands.literal("botchat")
                    .then(Commands.argument("message", StringArgumentType.greedyString())
                        .executes(context -> {
                            String message = StringArgumentType.getString(context, "message");
                            return processChatRequest(context, message);
                        })
                    )
                    .executes(context -> {
                        context.getSource().sendSuccess(() -> 
                            Component.literal("用法: /botchat <消息>"), 
                            false
                        );
                        return 0;
                    })
            );
            
            // 健康检查命令
            dispatcher.register(
                Commands.literal("openclaw-test")
                    .executes(context -> {
                        CommandSourceStack source = context.getSource();
                        source.sendSuccess(() -> Component.literal("⏳ 检查OpenClaw命令行状态..."), false);
                        
                        CompletableFuture.runAsync(() -> {
                            CommandResult result = checkHealth();
                            source.sendSuccess(() -> 
                                Component.literal(result.success() ? 
                                    "✅ " + result.message() : 
                                    "❌ " + result.message()), 
                                false
                            );
                        }, EXECUTOR);
                        
                        return Command.SINGLE_SUCCESS;
                    })
            );

            LOGGER.info("OpenClaw命令行命令注册完成");
        });
    }
    
    private static int processChatRequest(CommandContext<CommandSourceStack> context, String message) {
        CommandSourceStack source = context.getSource();
        MinecraftServer server = source.getServer();
        try {
            Player player = source.getPlayer();
            if (player == null) {
                source.sendSuccess(() -> Component.literal("❌ 只有玩家可以使用此命令"), false);
                return 0;
            }
            
            source.sendSuccess(() -> Component.literal("⏳ 正在发送消息..."), false);
            
            // 异步发送请求，避免阻塞游戏线程
            CompletableFuture.supplyAsync(() -> {
                Process openclawProcess = null;
                String commandMessage = "";
                try {
                    if (message.equals("/new")) {
                        commandMessage = "通过/new启动了一个新会话。如果配置了人设，请以该人设问候用户。保持自我——使用你定义的声音、举止和情绪。将问候限制在1-3句话，并询问用户想做什么。若运行时模型与系统提示中的默认模型不同，请提及默认模型。切勿提及内部步骤、文件、工具或推理。";
                    } else {
                        // 获取世界信息
                        String worldInfo = getWorldInfo(server, player);
                        
                        // 构建完整的消息，包含玩家上下文和世界路径信息
                        StringBuilder fullMessage = new StringBuilder();
                        fullMessage.append("玩家“").append(player.getName().getString())
                                .append("”在Minecraft中说：").append(message).append("（")
                                .append(worldInfo).append("）");
                        // 获取Python脚本路径
                        String pythonScriptPath = getPythonScriptPath();
                        if (pythonScriptPath != null) {
                            fullMessage.append("用于读取世界区块的Python代码位置（需要mcapy库，如果没有可使用pip安装）：").append(pythonScriptPath).append("，");
                            fullMessage.append("参数列表请查看代码头部的说明字符串。");
                        }
                        // 添加wiki信息
                        String minecraftWikiPath = getWikiPath();
                        if (minecraftWikiPath != null) {
                            fullMessage.append("最新版MinecraftWiki路径：").append(minecraftWikiPath).append("，");
                            fullMessage.append("如果需要获取游戏知识可以查看。");
                        }
                        
                        // 对消息进行适当的转义
                        commandMessage = escapeForCommand(fullMessage.toString());
                    }

                    LOGGER.info("发送到OpenClaw的消息: {}", commandMessage);

                    if (IS_WINDOWS) {
                        String[] command = {"powershell.exe", "-Command", "openclaw", "agent", "--agent", "main", "--message", commandMessage, "--deliver"};
                        openclawProcess = Runtime.getRuntime().exec(command, null, FabricLoader.getInstance().getGameDir().toFile());
                    } else {
                        String[] command = {"openclaw", "agent", "--agent", "main", "--message", commandMessage, "--deliver"};
                        openclawProcess = Runtime.getRuntime().exec(command, null, FabricLoader.getInstance().getGameDir().toFile());
                    }
                    
                    // 读取输出
                    StringBuilder output = new StringBuilder();
                    try (
                        BufferedReader reader = new BufferedReader(
                            new InputStreamReader(openclawProcess.getInputStream(), StandardCharsets.UTF_8))) {
                        String line;
                        long startTime = System.currentTimeMillis();
                        long timeoutMs = COMMAND_TIMEOUT_SECONDS * 1000L;

                        // 读取输出，但设置超时
                        while ((line = reader.readLine()) != null) {
                            output.append(line).append("\n");

                            // 超过总超时时间，就停止等待
                            long elapsed = System.currentTimeMillis() - startTime;
                            if (elapsed > timeoutMs) {
                                LOGGER.warn("命令执行超时，已等待 {} 毫秒", elapsed);
                                break;
                            }
                        }
                    }
                    
                    // 等待进程完成
                    boolean completed = openclawProcess.waitFor(COMMAND_TIMEOUT_SECONDS, TimeUnit.SECONDS);
                    if (!completed) {
                        openclawProcess.destroyForcibly();
                        return new CommandResult(false, "命令执行超时（超过" + COMMAND_TIMEOUT_SECONDS + "秒）");
                    }
                    
                    int exitCode = openclawProcess.exitValue();
                    String responseText = output.toString().trim();
                    LOGGER.info("OpenClaw命令响应 (退出码: {}): {}", exitCode, responseText);
                    
                    // 返回消息
                    if (exitCode == 0) {
                        return new CommandResult(true, responseText);
                    } else {
                        return new CommandResult(false, "OpenClaw返回错误 (退出码: " + exitCode + "): " + responseText);
                    }
                    
                } catch (Exception e) {
                    LOGGER.error("执行OpenClaw命令时出错", e);
                    return new CommandResult(false, "执行错误: " + e.getMessage());
                } finally {
                    // 确保进程被清理
                    if (openclawProcess != null && openclawProcess.isAlive()) {
                        try {
                            openclawProcess.destroyForcibly();
                        } catch (Exception e) {
                            LOGGER.warn("清理进程时出错", e);
                        }
                    }
                }
                
            }, EXECUTOR).thenAccept(result -> {
                // 在主线程中发送响应
                source.getServer().execute(() -> {
                    if (result.success()) {
                        source.sendSuccess(() -> Component.literal("🤖 " + result.message()), false);
                        LOGGER.info("收到OpenClaw响应");
                    } else {
                        source.sendSuccess(() -> Component.literal("❌ 错误: " + result.message()), false);
                        LOGGER.error("OpenClaw错误: " + result.message());
                    }
                });
            });
            
            return Command.SINGLE_SUCCESS;
            
        } catch (Exception e) {
            LOGGER.error("处理请求时出错", e);
            source.sendSuccess(() -> Component.literal("❌ 处理出错: " + e.getMessage()), false);
            return 0;
        }
    }

    /**
     * 获取世界路径信息
     */
    private static String getWorldInfo(MinecraftServer server, Player player) {
        StringBuilder info = new StringBuilder();
        
        try {
            // 检查是否是单人游戏还是多人游戏
            boolean isSingleplayer = server != null && 
                                    server.isSingleplayer();
            
            if (isSingleplayer) {
                info.append("游戏类型：单人游戏，");
                
                // 获取当前世界的存档路径
                String worldPath = server.getWorldPath(LevelResource.ROOT).toAbsolutePath().toString();
                if (worldPath.endsWith("\\.")) {
                    worldPath = worldPath.substring(0, worldPath.length() - 2);
                }
                info.append("存档路径：").append(worldPath).append("，");
                
                // 获取存档名称
                if (server.getWorldData() != null) {
                    String worldName = server.getWorldData().getLevelName();
                    info.append("存档名称：").append(worldName).append("。");
                }
            } else {
                info.append("游戏类型：多人游戏");
                
                // 尝试获取服务器信息
                if (server != null) {
                    String serverName = server.getMotd();
                    info.append("，服务器名称：").append(serverName);
                    
                    // 获取服务器IP（如果可用）
                    if (server.getConnection() != null) {
                        info.append("，在线玩家数：").append(server.getPlayerCount()).append("。");
                    }
                }
            }
            String level = player.level().dimension().toString();
            if (level.contains("overworld")){
                level = "overworld";
            } else if (level.contains("nether")) {
                level = "nether";
            } else {
                level = "the end";
            }
            info.append("当前维度：").append(level).append("，");
            info.append("玩家坐标：").append(String.format("%d, %d, %d", 
                (int)player.getX(), (int)player.getY(), (int)player.getZ()).replace("-", "负")).append("，");
            info.append("游戏时间：").append(player.level().getDayTime()).append("，");
            info.append("游戏难度：").append(player.level().getDifficulty().getKey());
        } catch (Exception e) {
            LOGGER.error("获取世界信息时出错", e);
            info.append("❌ 获取世界信息时出错： ").append(e.getMessage());
        }
        
        return info.toString();
    }
    
    /**
     * 获取Minecraft Wiki路径
     */
    private static String getWikiPath() {
        try {
            Path scriptPath = Paths.get(
                GAME_DIR,
                "minecraft_wiki"
            );
            
            if (Files.exists(scriptPath)) {
                return scriptPath.toAbsolutePath().toString();
            }
            
            return null;
        } catch (Exception e) {
            LOGGER.error("获取minecraft_wiki路径时出错", e);
            return null;
        }
    }
    
    /**
     * 对命令消息进行转义
     */
    private static String escapeForCommand(String message) {
        if (IS_WINDOWS) {
            // Windows PowerShell需要特殊转义
            return "\"" + message + "\"";
        } else {
            // Unix/Linux: 使用单引号包裹
            return "'" + message.replace("'", "'\"'\"'") + "'";
        }
    }
    
    /**
     * 获取Python脚本路径
     */
    private static String getPythonScriptPath() {
        try {
            Path scriptPath = Paths.get(
                GAME_DIR,
                "mcapy_reader.py"
            );
            
            if (Files.exists(scriptPath)) {
                return scriptPath.toAbsolutePath().toString();
            }
            
            return null;
        } catch (Exception e) {
            LOGGER.error("获取Python脚本路径时出错", e);
            return null;
        }
    }
    
    /**
     * 检查OpenClaw命令行状态
     */
    public static CommandResult checkHealth() {
        try {
            // 尝试执行简单的openclaw命令来检查是否可用
            Process process;
            if (IS_WINDOWS) {
                // Windows: 使用PowerShell调用openclaw
                String[] command = {
                    "powershell.exe",
                    "-Command",
                    OPENCLAW_COMMAND,
                    "--version"
                };
                process = Runtime.getRuntime().exec(command, null, FabricLoader.getInstance().getGameDir().toFile());
            } else {
                // Linux/Mac: 直接调用
                String[] command = {
                    OPENCLAW_COMMAND,
                    "--version"
                };
                process = Runtime.getRuntime().exec(command, null, FabricLoader.getInstance().getGameDir().toFile());
            }
            
            // 创建线程读取错误流，避免缓冲区堵塞
            Thread errorReader = new Thread(() -> {
                try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(process.getErrorStream(), StandardCharsets.UTF_8))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        LOGGER.debug("OpenClaw错误输出: {}", line);
                    }
                } catch (Exception e) {
                    LOGGER.debug("读取错误流时出错", e);
                }
            });
            errorReader.setDaemon(true);
            errorReader.start();
            
            StringBuilder output = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    output.append(line).append("\n");
                }
            }
            
            boolean completed = process.waitFor(5, TimeUnit.SECONDS);
            
            if (!completed) {
                process.destroyForcibly();
                return new CommandResult(false, "命令执行超时");
            }
            
            int exitCode = process.exitValue();
            String responseText = output.toString().trim();
            
            if (exitCode == 0) {
                // 成功获取版本信息
                String version = responseText;
                if (version.contains("openclaw")) {
                    version = version.replace("openclaw", "").trim();
                }
                return new CommandResult(true, "OpenClaw命令行可用 - 版本: " + version);
            } else {
                return new CommandResult(false, "OpenClaw命令不可用: " + responseText);
            }
            
        } catch (Exception e) {
            LOGGER.error("检查OpenClaw命令行状态时出错", e);
            return new CommandResult(false, "无法执行OpenClaw命令: " + e.getMessage());
        }
    }

    /**
     * 命令执行结果
     */
    public static record CommandResult(boolean success, String message) {
        @Override
        public String toString() {
            return "CommandResult{success=" + success + ", message='" + message + "'}";
        }
    }
}