package com.calibermc.terradornmod.item;

import com.calibermc.terradornmod.TerradornMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TERRADORN)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TerradornMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TerradornMod.LOGGER.info("Registering Mod Items for" + TerradornMod.MOD_ID);
    }
}
