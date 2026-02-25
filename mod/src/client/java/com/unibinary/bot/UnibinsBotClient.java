package com.unibinary.bot;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class UnibinsBotClient implements ClientModInitializer {
	private static final Logger LOGGER = LoggerFactory.getLogger("UnibinsBot/Client");
	private static final boolean IS_WINDOWS = System.getProperty("os.name").toLowerCase().contains("win");
	// Python脚本配置
	private static final String PYTHON_SCRIPT_NAME = "mcapy_reader.py";

	@Override
	public void onInitializeClient() {
		LOGGER.info("UnibinsBot客户端初始化");
		
		// 客户端启动时提取Python脚本和Wiki文件
		ClientLifecycleEvents.CLIENT_STARTED.register(client -> {
			LOGGER.info("Minecraft客户端启动，提取Python脚本和Wiki文件");
			OpenClawBridge.register();
			ChunkbaseIntegration.register();
			extractPythonScript();
			extractWikiFiles();
			extractChunkbaseScript();
		});
		
		LOGGER.info("客户端初始化完成");
	}
	
	/**
	 * 在客户端启动时提取Chunkbase脚本
	 */
	private void extractChunkbaseScript() {
		try {
			String gameDir = net.fabricmc.loader.api.FabricLoader.getInstance().getGameDir().toString();
			Path targetScript = Paths.get(gameDir, "chunkbase_integration.py");
			
			if (!Files.exists(targetScript)) {
				LOGGER.info("尝试提取Chunkbase脚本到: {}", targetScript);
				
				// 从资源中提取脚本
				InputStream resourceStream = UnibinsBotClient.class.getResourceAsStream("/scripts/chunkbase_integration.py");
				if (resourceStream != null) {
					Files.copy(resourceStream, targetScript, StandardCopyOption.REPLACE_EXISTING);
					LOGGER.info("从jar资源中提取Chunkbase脚本到: {}", targetScript);
				} else {
					// 如果资源中没有，创建默认脚本
					createDefaultChunkbaseScript(targetScript);
				}
			} else {
				LOGGER.info("Chunkbase脚本已存在: {}", targetScript);
			}
		} catch (Exception e) {
			LOGGER.error("提取Chunkbase脚本时出错", e);
		}
	}
	
	/**
	 * 创建默认的Chunkbase脚本
	 */
	private void createDefaultChunkbaseScript(Path targetPath) {
		try {
			String defaultScript = 
				"#!/usr/bin/env python3\n" +
				"\"\"\"\n" +
				"Chunkbase集成 - 默认脚本\n" +
				"请安装完整版: pip install minecraft-seed-tools\n" +
				"\"\"\"\n" +
				"\n" +
				"import sys\n" +
				"import json\n" +
				"\n" +
				"def main():\n" +
				"    print(\"⚠️  请安装完整版Chunkbase功能\")\n" +
				"    print(\"   运行: pip install minecraft-seed-tools\")\n" +
				"    \n" +
				"    # 简单回退\n" +
				"    if len(sys.argv) > 1:\n" +
				"        seed = sys.argv[2] if len(sys.argv) > 2 else \"未知\"\n" +
				"        x = sys.argv[4] if len(sys.argv) > 4 else \"0\"\n" +
				"        z = sys.argv[6] if len(sys.argv) > 6 else \"0\"\n" +
				"        \n" +
				"        print(f\"\\n🌍 种子: {seed}\")\n" +
				"        print(f\"📍 位置: ({x}, {z})\")\n" +
				"        print(\"\\n💡 提示: 安装完整版后重启Minecraft\")\n" +
				"\n" +
				"if __name__ == \"__main__\":\n" +
				"    main()\n";
			
			Files.writeString(targetPath, defaultScript);
			LOGGER.info("创建默认Chunkbase脚本: {}", targetPath);
		} catch (Exception e) {
			LOGGER.error("创建默认Chunkbase脚本时出错", e);
		}
	}
	
	/**
	 * 在客户端启动时提取Python脚本
	 */
	private void extractPythonScript() {
		try {
			// 获取游戏目录
			String gameDir = net.fabricmc.loader.api.FabricLoader.getInstance().getGameDir().toString();
			Path targetScript = Paths.get(gameDir, PYTHON_SCRIPT_NAME);
			
			// 如果脚本不存在，尝试从资源中提取
			if (!Files.exists(targetScript)) {
				LOGGER.info("尝试提取Python脚本到: {}", targetScript);

				// 尝试从类路径读取脚本（在jar包中的路径）
				InputStream resourceStream = UnibinsBotClient.class.getResourceAsStream("/scripts/" + PYTHON_SCRIPT_NAME);
				if (resourceStream != null) {
					Files.copy(resourceStream, targetScript, StandardCopyOption.REPLACE_EXISTING);
					LOGGER.info("从jar资源中提取Python脚本到: {}", targetScript);
					
					// 确保脚本有可执行权限（Unix/Linux）
					if (!IS_WINDOWS) {
						targetScript.toFile().setExecutable(true);
					}
				} else {
					LOGGER.error("在jar资源中找不到Python脚本: /scripts/{}", PYTHON_SCRIPT_NAME);
				}

			} else {
				LOGGER.info("Python脚本已存在: {}", targetScript);
			}
		} catch (Exception e) {
			LOGGER.error("客户端启动时提取Python脚本失败", e);
		}
	}
	
	/**
	 * 在客户端启动时提取Minecraft Wiki文件
	 */
	private void extractWikiFiles() {
		try {
			// 获取游戏目录
			String gameDir = net.fabricmc.loader.api.FabricLoader.getInstance().getGameDir().toString();
			Path wikiDir = Paths.get(gameDir, "minecraft_wiki");
			
			// 如果wiki目录不存在，尝试从资源中提取
			if (!Files.exists(wikiDir)) {
				LOGGER.info("尝试提取Minecraft Wiki文件到: {}", wikiDir);
				Files.createDirectories(wikiDir);
				
				// 尝试从jar包中提取wiki文件
				extractWikiDirectory("/minecraft_wiki", wikiDir);
				
				LOGGER.info("从jar资源中提取Minecraft Wiki文件完成，共提取文件到: {}", wikiDir);
			} else {
				LOGGER.info("Minecraft Wiki目录已存在: {}", wikiDir);
			}
		} catch (Exception e) {
			LOGGER.error("客户端启动时提取Minecraft Wiki文件失败", e);
		}
	}
	
	/**
	 * 递归提取wiki目录
	 */
	private void extractWikiDirectory(String resourcePath, Path targetDir) {
		try {
			// 获取资源目录下的所有文件
			java.net.URL resourceUrl = UnibinsBotClient.class.getResource(resourcePath);
			if (resourceUrl != null && resourceUrl.getProtocol().equals("jar")) {
				// 在jar包中
				java.util.jar.JarFile jarFile = new java.util.jar.JarFile(
					net.fabricmc.loader.api.FabricLoader.getInstance().getModContainer("unibinsbot").get().getRootPath().toFile()
				);
				
				java.util.Enumeration<java.util.jar.JarEntry> entries = jarFile.entries();
				while (entries.hasMoreElements()) {
					java.util.jar.JarEntry entry = entries.nextElement();
					String entryName = entry.getName();
					
					// 检查是否是wiki目录下的文件
					if (entryName.startsWith(resourcePath.substring(1)) && !entry.isDirectory()) {
						String relativePath = entryName.substring(resourcePath.length());
						Path targetFile = targetDir.resolve(relativePath);
						
						// 确保父目录存在
						Files.createDirectories(targetFile.getParent());
						
						// 复制文件
						try (InputStream inputStream = jarFile.getInputStream(entry)) {
							Files.copy(inputStream, targetFile, StandardCopyOption.REPLACE_EXISTING);
							LOGGER.debug("提取wiki文件: {}", targetFile);
						}
					}
				}
				jarFile.close();
			} else {
				// 在开发环境中（非jar包）
				java.io.File resourceDir = new java.io.File(UnibinsBotClient.class.getResource(resourcePath).toURI());
				if (resourceDir.exists() && resourceDir.isDirectory()) {
					java.io.File[] files = resourceDir.listFiles();
					if (files != null) {
						for (java.io.File file : files) {
							Path targetFile = targetDir.resolve(file.getName());
							if (file.isDirectory()) {
								extractWikiDirectory(resourcePath + "/" + file.getName(), targetFile);
							} else {
								Files.copy(file.toPath(), targetFile, StandardCopyOption.REPLACE_EXISTING);
								LOGGER.debug("提取wiki文件: {}", targetFile);
							}
						}
					}
				}
			}
		} catch (Exception e) {
			LOGGER.error("提取wiki目录失败: {}", resourcePath, e);
		}
	}
}