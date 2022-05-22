package net.tigryla.fabricated_rpg.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.tigryla.fabricated_rpg.FabricatedRPG;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ABYSS_CHUNK = registerItem("abyss_chunk",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ABYSS_DUST = registerItem("abyss_dust",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ABYSS_FRAGMENTS = registerItem("abyss_fragments",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ABYSS_GEM = registerItem("abyss_gem",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ABYSS_HEART = registerItem("abyss_heart",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item ABYSS_SOUL = registerItem("abyss_soul",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item RAW_FELIRON = registerItem("raw_feliron",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));




    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FabricatedRPG.MOD_ID, name), item);
    }

    public static void registerModItems(){
        FabricatedRPG.LOGGER.info("Registering Mod Items for " + FabricatedRPG.MOD_ID);
    }

}
