package com.unibinary.bot;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    private static final Gson GSON = new GsonBuilder().create();
    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(4);
    
    // 命令行配置
    private static final String OPENCLAW_COMMAND = "openclaw";
    private static final boolean IS_WINDOWS = System.getProperty("os.name").toLowerCase().contains("win");
    private static final int COMMAND_TIMEOUT_SECONDS = 30;
    
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
        
        try {
            Player player = source.getPlayer();
            if (player == null) {
                source.sendSuccess(() -> Component.literal("❌ 只有玩家可以使用此命令"), false);
                return 0;
            }
            
            source.sendSuccess(() -> Component.literal("⏳ 正在联系OpenClaw..."), false);
            
            // 异步发送请求，避免阻塞游戏线程
            CompletableFuture.runAsync(() -> {
                CommandResult result = sendMessage(player, message);
                
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
            }, EXECUTOR);
            
            return Command.SINGLE_SUCCESS;
            
        } catch (Exception e) {
            LOGGER.error("处理请求时出错", e);
            source.sendSuccess(() -> Component.literal("❌ 处理出错: " + e.getMessage()), false);
            return 0;
        }
    }

    /**
     * 发送消息到OpenClaw命令行
     */
    public static CommandResult sendMessage(Player player, String message) {
        Process process = null;
        try {
            // 构建完整的消息，包含玩家上下文
            StringBuilder fullMessage = new StringBuilder();
            fullMessage.append("玩家 ").append(player.getName().getString())
                      .append(" 在Minecraft中说: ").append(message)
                      .append(" (位置: ")
                      .append(String.format("%.1f, %.1f, %.1f", player.getX(), player.getY(), player.getZ()))
                      .append(", 世界: ").append(player.level().dimension().toString())
                      .append(")");
            
            String commandMessage = fullMessage.toString();
            commandMessage = "'" + commandMessage + "'";
            LOGGER.info("发送到OpenClaw: {}", commandMessage);
            // 构建命令行参数 - 使用system event命令，它会立即返回
            // 在Windows上，openclaw是PowerShell脚本，需要特殊处理
            ProcessBuilder processBuilder;
            if (IS_WINDOWS) {
                // Windows: 使用PowerShell调用openclaw
                processBuilder = new ProcessBuilder(
                    "powershell.exe",
                    "-Command",
                    OPENCLAW_COMMAND, "agent",
                    "--agent", "main",
                    "--message", commandMessage
                );
            } else {
                // Linux/Mac: 直接调用
                processBuilder = new ProcessBuilder(
                    OPENCLAW_COMMAND, "agent",
                    "--agent", "main",
                    "--message"
                );
            }
            
            // 设置工作目录（可选，使用系统默认）
            processBuilder.redirectErrorStream(true);
            
            // 执行命令
            process = processBuilder.start();
            
            // 读取输出
            StringBuilder output = new StringBuilder();
            try (
                BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8))) {
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
            // 尝试正常终止进程
            process.destroy();
            
            String responseText = output.toString().trim();
            LOGGER.info("OpenClaw命令响应: {}", responseText);
            
            // 返回消息
            return new CommandResult(true, responseText);
            
        } catch (Exception e) {
            LOGGER.error("执行OpenClaw命令时出错", e);
            return new CommandResult(false, "执行错误: " + e.getMessage());
        } finally {
            // 确保进程被清理
            if (process != null && process.isAlive()) {
                try {
                    process.destroyForcibly();
                } catch (Exception e) {
                    LOGGER.warn("清理进程时出错", e);
                }
            }
        }
    }
    
    /**
     * 检查OpenClaw命令行状态
     */
    public static CommandResult checkHealth() {
        try {
            // 尝试执行简单的openclaw命令来检查是否可用
            ProcessBuilder processBuilder;
            if (IS_WINDOWS) {
                // Windows: 使用PowerShell调用openclaw
                processBuilder = new ProcessBuilder(
                    "powershell.exe",
                    "-Command",
                    OPENCLAW_COMMAND,
                    "--version"
                );
            } else {
                // Linux/Mac: 直接调用
                processBuilder = new ProcessBuilder(
                    OPENCLAW_COMMAND,
                    "--version"
                );
            }
            
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            
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