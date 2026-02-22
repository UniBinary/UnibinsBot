package com.unibinary.bot;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnibinsBot implements ModInitializer {
	public static final String MOD_ID = "unibinsbot";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("UnibinsBot模组初始化");
		
		// 注册命令
		OpenClawBridge.register();
		
		LOGGER.info("模组初始化完成，等待命令注册");
	}
}