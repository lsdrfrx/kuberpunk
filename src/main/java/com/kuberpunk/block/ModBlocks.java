package com.kuberpunk.block;

import static com.kuberpunk.Kuberpunk.MOD_ID;
import static com.kuberpunk.Kuberpunk.LOGGER;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;

public class ModBlocks {
    public static final Block PRINTER = registerBlock("printer",
            new Printer(FabricBlockSettings.copy(Blocks.IRON_ORE)));

    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new Block(FabricBlockSettings.copy(Blocks.IRON_ORE)));

    public static final Block VOLFRAM_ORE = registerBlock("volfram_ore",
            new Block(FabricBlockSettings.copy(Blocks.IRON_ORE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MOD_ID, name), block);
    }

    private static BlockItem registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void register() {
        LOGGER.debug("Registering blocks for " + MOD_ID);
    }
}
