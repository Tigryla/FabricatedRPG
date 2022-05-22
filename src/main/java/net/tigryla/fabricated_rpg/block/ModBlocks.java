package net.tigryla.fabricated_rpg.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.TorchBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.tigryla.fabricated_rpg.FabricatedRPG;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block FELIRON_ORE = registerBlock("feliron_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.MISC);
    public static final Block AQUA_TORCH = registerBlock("aqua_torch",
            new Block(FabricBlockSettings.of(Material.DECORATION).noCollision().luminance(14).sounds(BlockSoundGroup.WOOD).breakInstantly()), ItemGroup.MISC);




    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(FabricatedRPG.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(FabricatedRPG.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void  registerModBlock() {
        FabricatedRPG.LOGGER.info("Registering ModBlock for " + FabricatedRPG.MOD_ID);
    }


}
