package com.yourname.life_addon; // change to another name or rename it in file explorer to then adjust

import com.yourname.life_addon.init.ModBlocks;
import com.yourname.life_addon.init.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LifeAddonTemplate implements ModInitializer {
	public static final String MOD_ID = "life-addon"; // change to your own mod id
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Fill Below with other files");

		ModItems.init();
		ModBlocks.init();
	}
}