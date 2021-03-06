package com.calibermc.terradornmod.block;

import com.calibermc.terradornmod.TerradornMod;
import com.calibermc.terradornmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    //METALS
    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.TERRADORN);

    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.TERRADORN);

    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.TERRADORN);

    public static final Block NETHERRACK_SILVER_ORE = registerBlock("nether_silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.TERRADORN);

    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.TERRADORN);

    //GEMS
    public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().hardness(1.5f).resistance(1.5f)), ModItemGroup.TERRADORN);
    public static final Block BUDDING_CITRINE_BLOCK = registerBlock("budding_citrine_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().hardness(1.5f).resistance(1.5f)), ModItemGroup.TERRADORN);
    public static final Block CITRINE_CLUSTER_BLOCK = registerBlock("citrine_cluster_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().hardness(1.5f).resistance(1.5f)), ModItemGroup.TERRADORN);

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().hardness(5f).resistance(6f)), ModItemGroup.TERRADORN);
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().hardness(3f).resistance(3f)), ModItemGroup.TERRADORN);
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(4.5f).resistance(4.5f)), ModItemGroup.TERRADORN);

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().hardness(5f).resistance(6f)), ModItemGroup.TERRADORN);
    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().hardness(3f).resistance(3f)), ModItemGroup.TERRADORN);
    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(4.5f).resistance(4.5f)), ModItemGroup.TERRADORN);

    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().hardness(5f).resistance(6f)), ModItemGroup.TERRADORN);
    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().hardness(3f).resistance(3f)), ModItemGroup.TERRADORN);
    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().hardness(4.5f).resistance(4.5f)), ModItemGroup.TERRADORN);







    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TerradornMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register (Registry.ITEM, new Identifier(TerradornMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        TerradornMod.LOGGER.info("Registering ModBlocks for " + TerradornMod.MOD_ID);
    }
}
