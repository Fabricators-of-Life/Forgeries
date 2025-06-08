package org.mythic_goose_studios.forgeries; // change to another name or rename it in file explorer to then adjust

import net.fabricmc.api.ModInitializer;

import org.mythic_goose_studios.forgeries.init.ModBlocks;
import org.mythic_goose_studios.forgeries.init.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Forgeries implements ModInitializer {
	public static final String MOD_ID = "forgeries"; // change to your own mod id
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Fill Below with other files");

		ModItems.init();
		ModBlocks.init();
	}
}