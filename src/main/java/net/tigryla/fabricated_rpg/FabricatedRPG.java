package net.tigryla.fabricated_rpg;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.tigryla.fabricated_rpg.block.ModBlocks;
import net.tigryla.fabricated_rpg.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricatedRPG implements ModInitializer {
	public static final String MOD_ID = "fabricated_rpg";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
					new Identifier("fabricated_rpg", "general"))
			.icon(() -> new ItemStack(ModItems.ABYSS_SOUL))
			.build();

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlock();

	}
}
