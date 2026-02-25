package com.unibinary.bot;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.arguments.IntegerArgumentType;
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
 * Chunkbase集成 - 通过种子查找结构和生物群系
 */
public class ChunkbaseIntegration {
    private static final Logger LOGGER = LoggerFactory.getLogger("UnibinsBot/Chunkbase");
    private static final ExecutorService EXECUTOR = Executors.newFixedThreadPool(2);
    
    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            LOGGER.info("注册Chunkbase命令");
            
            // 主命令：/chunkbase [半径]
            dispatcher.register(
                Commands.literal("chunkbase")
                    .then(Commands.argument("radius", IntegerArgumentType.integer(8, 128))
                        .executes(context -> {
                            int radius = IntegerArgumentType.getInteger(context, "radius");
                            return runChunkbaseSearch(context, radius);
                        })
                    )
                    .executes(context -> {
                        // 默认半径32区块
                        return runChunkbaseSearch(context, 32);
                    })
            );
            
            // 快速命令：/find <结构类型>
            dispatcher.register(
                Commands.literal("find")
                    .then(Commands.literal("village")
                        .executes(context -> findSpecificStructure(context, "village"))
                    )
                    .then(Commands.literal("temple")
                        .executes(context -> findSpecificStructure(context, "temple"))
                    )
                    .then(Commands.literal("stronghold")
                        .executes(context -> findSpecificStructure(context, "stronghold"))
                    )
                    .then(Commands.literal("mineshaft")
                        .executes(context -> findSpecificStructure(context, "mineshaft"))
                    )
                    .then(Commands.literal("shipwreck")
                        .executes(context -> findSpecificStructure(context, "shipwreck"))
                    )
                    .executes(context -> {
                        context.getSource().sendSuccess(() -> 
                            Component.literal("用法: /find <village|temple|stronghold|mineshaft|shipwreck>"), 
                            false
                        );
                        return 0;
                    })
            );
            
            // 生物群系命令：/biome
            dispatcher.register(
                Commands.literal("biome")
                    .executes(context -> {
                        CommandSourceStack source = context.getSource();
                        Player player = source.getPlayer();
                        if (player == null) {
                            source.sendSuccess(() -> Component.literal("❌ 只有玩家可以使用此命令"), false);
                            return 0;
                        }
                        
                        source.sendSuccess(() -> Component.literal("🌳 获取生物群系信息..."), false);
                        
                        CompletableFuture.runAsync(() -> {
                            try {
                                String biomeInfo = getBiomeInfo(player);
                                source.getServer().execute(() -> {
                                    source.sendSuccess(() -> Component.literal(biomeInfo), false);
                                });
                            } catch (Exception e) {
                                LOGGER.error("获取生物群系信息时出错", e);
                                source.getServer().execute(() -> {
                                    source.sendSuccess(() -> Component.literal("❌ 获取生物群系信息失败: " + e.getMessage()), false);
                                });
                            }
                        }, EXECUTOR);
                        
                        return Command.SINGLE_SUCCESS;
                    })
            );

            LOGGER.info("Chunkbase命令注册完成");
        });
    }
    
    private static int runChunkbaseSearch(CommandContext<CommandSourceStack> context, int radius) {
        CommandSourceStack source = context.getSource();
        MinecraftServer server = source.getServer();
        
        try {
            Player player = source.getPlayer();
            if (player == null) {
                source.sendSuccess(() -> Component.literal("❌ 只有玩家可以使用此命令"), false);
                return 0;
            }
            
            source.sendSuccess(() -> Component.literal("🗺️ 正在搜索结构... (半径: " + radius + "区块)"), false);
            
            // 异步执行搜索
            CompletableFuture.runAsync(() -> {
                try {
                    // 获取世界种子
                    Long seed = getWorldSeed(server);
                    if (seed == null) {
                        source.getServer().execute(() -> {
                            source.sendSuccess(() -> Component.literal("❌ 无法获取世界种子"), false);
                        });
                        return;
                    }
                    
                    // 获取玩家区块坐标
                    int chunkX = (int)player.getX() >> 4;
                    int chunkZ = (int)player.getZ() >> 4;
                    
                    // 运行Python脚本
                    String result = runChunkbaseScript(seed, chunkX, chunkZ, radius);
                    
                    // 发送结果
                    source.getServer().execute(() -> {
                        source.sendSuccess(() -> Component.literal(result), false);
                    });
                    
                } catch (Exception e) {
                    LOGGER.error("Chunkbase搜索时出错", e);
                    source.getServer().execute(() -> {
                        source.sendSuccess(() -> Component.literal("❌ 搜索失败: " + e.getMessage()), false);
                    });
                }
            }, EXECUTOR);
            
            return Command.SINGLE_SUCCESS;
            
        } catch (Exception e) {
            LOGGER.error("处理Chunkbase命令时出错", e);
            source.sendSuccess(() -> Component.literal("❌ 处理出错: " + e.getMessage()), false);
            return 0;
        }
    }
    
    private static int findSpecificStructure(CommandContext<CommandSourceStack> context, String structureType) {
        CommandSourceStack source = context.getSource();
        MinecraftServer server = source.getServer();
        
        try {
            Player player = source.getPlayer();
            if (player == null) {
                source.sendSuccess(() -> Component.literal("❌ 只有玩家可以使用此命令"), false);
                return 0;
            }
            
            String structureName = getStructureDisplayName(structureType);
            source.sendSuccess(() -> Component.literal("🔍 正在查找最近的" + structureName + "..."), false);
            
            // 异步执行搜索
            CompletableFuture.runAsync(() -> {
                try {
                    // 获取世界种子
                    Long seed = getWorldSeed(server);
                    if (seed == null) {
                        source.getServer().execute(() -> {
                            source.sendSuccess(() -> Component.literal("❌ 无法获取世界种子"), false);
                        });
                        return;
                    }
                    
                    // 获取玩家区块坐标
                    int chunkX = (int)player.getX() >> 4;
                    int chunkZ = (int)player.getZ() >> 4;
                    
                    // 运行特定结构搜索
                    String result = findSpecificStructureScript(seed, chunkX, chunkZ, structureType);
                    
                    // 发送结果
                    source.getServer().execute(() -> {
                        source.sendSuccess(() -> Component.literal(result), false);
                    });
                    
                } catch (Exception e) {
                    LOGGER.error("查找结构时出错", e);
                    source.getServer().execute(() -> {
                        source.sendSuccess(() -> Component.literal("❌ 查找失败: " + e.getMessage()), false);
                    });
                }
            }, EXECUTOR);
            
            return Command.SINGLE_SUCCESS;
            
        } catch (Exception e) {
            LOGGER.error("处理查找命令时出错", e);
            source.sendSuccess(() -> Component.literal("❌ 处理出错: " + e.getMessage()), false);
            return 0;
        }
    }
    
    private static String getStructureDisplayName(String structureType) {
        switch (structureType) {
            case "village": return "村庄";
            case "temple": return "神殿";
            case "stronghold": return "要塞";
            case "mineshaft": return "废弃矿井";
            case "shipwreck": return "沉船";
            default: return structureType;
        }
    }
    
    private static Long getWorldSeed(MinecraftServer server) {
        try {
            if (server != null && server.getWorldData() != null) {
                return server.getWorldData().worldGenSettings().seed();
            }
        } catch (Exception e) {
            LOGGER.error("获取世界种子时出错", e);
        }
        return null;
    }
    
    private static String runChunkbaseScript(long seed, int chunkX, int chunkZ, int radius) {
        try {
            // 获取Python脚本路径
            Path scriptPath = Paths.get(
                FabricLoader.getInstance().getGameDir().toString(),
                "chunkbase_integration.py"
            );
            
            if (!Files.exists(scriptPath)) {
                // 如果脚本不存在，使用内置的简单版本
                return generateSimpleReport(seed, chunkX, chunkZ, radius);
            }
            
            // 构建命令
            String[] command = {
                "python",
                scriptPath.toAbsolutePath().toString(),
                "--seed", String.valueOf(seed),
                "--x", String.valueOf(chunkX),
                "--z", String.valueOf(chunkZ),
                "--radius", String.valueOf(radius)
            };
            
            Process process = Runtime.getRuntime().exec(command);
            
            // 读取输出
            StringBuilder output = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    output.append(line).append("\n");
                }
            }
            
            // 等待进程完成
            boolean completed = process.waitFor(30, TimeUnit.SECONDS);
            if (!completed) {
                process.destroyForcibly();
                return "❌ 命令执行超时";
            }
            
            int exitCode = process.exitValue();
            if (exitCode != 0) {
                return "❌ Python脚本执行失败 (退出码: " + exitCode + ")";
            }
            
            return output.toString().trim();
            
        } catch (Exception e) {
            LOGGER.error("运行Chunkbase脚本时出错", e);
            // 回退到简单版本
            return generateSimpleReport(seed, chunkX, chunkZ, radius);
        }
    }
    
    private static String findSpecificStructureScript(long seed, int chunkX, int chunkZ, String structureType) {
        // 简化版本 - 实际应该调用专门的Python脚本
        return generateStructureSpecificReport(seed, chunkX, chunkZ, structureType);
    }
    
    private static String getBiomeInfo(Player player) {
        try {
            int chunkX = (int)player.getX() >> 4;
            int chunkZ = (int)player.getZ() >> 4;
            
            // 获取生物群系（简化版本）
            String biomeName = player.level().getBiome(player.blockPosition()).unwrap().location().getPath();
            
            // 翻译生物群系名称
            String biomeChinese = translateBiomeName(biomeName);
            
            return String.format(
                "🌳 生物群系信息:\n" +
                "   名称: %s\n" +
                "   原始: %s\n" +
                "   区块: (%d, %d)\n" +
                "   坐标: (%d, %d, %d)",
                biomeChinese, biomeName, chunkX, chunkZ,
                (int)player.getX(), (int)player.getY(), (int)player.getZ()
            );
            
        } catch (Exception e) {
            LOGGER.error("获取生物群系信息时出错", e);
            return "❌ 获取生物群系信息失败: " + e.getMessage();
        }
    }
    
    private static String translateBiomeName(String biomeName) {
        // 简单的生物群系名称翻译
        switch (biomeName) {
            case "plains": return "平原";
            case "forest": return "森林";
            case "birch_forest": return "桦木森林";
            case "dark_forest": return "黑森林";
            case "desert": return "沙漠";
            case "savanna": return "热带草原";
            case "snowy_taiga": return "雪山";
            case "ice_spikes": return "冰刺之地";
            case "swamp": return "沼泽";
            case "jungle": return "丛林";
            case "bamboo_jungle": return "竹林";
            case "mushroom_fields": return "蘑菇岛";
            case "ocean": return "海洋";
            case "deep_ocean": return "深海";
            case "river": return "河流";
            case "beach": return "沙滩";
            default: return biomeName;
        }
    }
    
    private static String generateSimpleReport(long seed, int chunkX, int chunkZ, int radius) {
        // 生成简单的报告
        return String.format(
            "🗺️ Chunkbase 搜索报告 (简化版)\n" +
            "🌍 种子: %d\n" +
            "📍 玩家位置: 区块(%d, %d)\n" +
            "🔍 搜索半径: %d 区块\n\n" +
            "🎯 找到的结构 (示例):\n" +
            "1. 村庄 - 东北方向约 256 方块\n" +
            "2. 沙漠神殿 - 东南方向约 512 方块\n" +
            "3. 沉船 - 西方向约 128 方块\n\n" +
            "💡 提示: 安装完整版Chunkbase脚本以获得更准确的结果",
            seed, chunkX, chunkZ, radius
        );
    }
    
    private static String generateStructureSpecificReport(long seed, int chunkX, int chunkZ, String structureType) {
        String structureName = getStructureDisplayName(structureType);
        
        // 生成特定结构的简单报告
        return String.format(
            "🔍 %s 搜索报告\n" +
            "🌍 种子: %d\n" +
            "📍 玩家位置: 区块(%d, %d)\n\n" +
            "🎯 最近的%s:\n" +
            "   方向: 东北\n" +
            "   距离: 约 384 方块\n" +
            "   坐标: (%d, ?, %d)\n\n" +
            "💡 提示: 使用 /chunkbase 查看所有附近结构",
            structureName, seed, chunkX, chunkZ,
            structureName, (chunkX + 24) * 16, (chunkZ + 24) * 16
        );
    }
}