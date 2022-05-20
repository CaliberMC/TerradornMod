package com.calibermc.terradornmod.item;

import com.calibermc.terradornmod.TerradornMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class ModItemGroup {

    public static final ItemGroup TERRADORN = FabricItemGroupBuilder.build(new Identifier(TerradornMod.MOD_ID, "terradorn"),
            () -> new ItemStack(ModItems.SILVER_INGOT));

}
