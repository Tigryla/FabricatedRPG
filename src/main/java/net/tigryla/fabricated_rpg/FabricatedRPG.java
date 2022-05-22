package net.tigryla.fabricated_rpg;

import net.fabricmc.api.ModInitializer;
import net.tigryla.fabricated_rpg.block.ModBlocks;
import net.tigryla.fabricated_rpg.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricatedRPG implements ModInitializer {
	public static final String MOD_ID = "fabricated_rpg";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlock();

	}
}
