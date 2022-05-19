package com.calibermc.terradornmod;

import com.calibermc.terradornmod.block.ModBlocks;
import com.calibermc.terradornmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TerradornMod implements ModInitializer {
	public static final String MOD_ID = "terradornmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
