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
		
		// 客户端启动时提取Python脚本
		ClientLifecycleEvents.CLIENT_STARTED.register(client -> {
			LOGGER.info("Minecraft客户端启动，提取Python脚本");
			OpenClawBridge.register();
			extractPythonScript();
		});
		
		LOGGER.info("客户端初始化完成");
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
				InputStream resourceStream = UnibinsBotClient.class.getResourceAsStream("/assets/unibinsbot/scripts/" + PYTHON_SCRIPT_NAME);
				if (resourceStream != null) {
					Files.copy(resourceStream, targetScript, StandardCopyOption.REPLACE_EXISTING);
					LOGGER.info("从jar资源中提取Python脚本到: {}", targetScript);
					
					// 确保脚本有可执行权限（Unix/Linux）
					if (!IS_WINDOWS) {
						targetScript.toFile().setExecutable(true);
					}
				} else {
					LOGGER.error("在jar资源中找不到Python脚本: /assets/unibinsbot/scripts/{}", PYTHON_SCRIPT_NAME);
				}

			} else {
				LOGGER.info("Python脚本已存在: {}", targetScript);
			}
		} catch (Exception e) {
			LOGGER.error("客户端启动时提取Python脚本失败", e);
		}
	}
}