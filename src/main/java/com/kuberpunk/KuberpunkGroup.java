package com.kuberpunk;

import static com.kuberpunk.Kuberpunk.MOD_ID;

import com.kuberpunk.block.ModBlocks;
import com.kuberpunk.item.ModItems;

import static com.kuberpunk.Kuberpunk.LOGGER;

import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class KuberpunkGroup {
    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.RUBBER_ITEM))
            .displayName(Text.translatable("itemGroup.kuberpunk.kuberpunk"))
            .entries((context, entries) -> {
                entries.add(ModItems.RUBBER_ITEM);
                entries.add(ModItems.IMMUNE_BLOCKATOR_ITEM);
                entries.add(ModItems.POLYMER_ITEM);
                entries.add(ModItems.STEEL_ITEM);
                entries.add(ModItems.VOLFRAM_ITEM);
                entries.add(ModItems.TITANIUM_ITEM);

                entries.add(ModBlocks.PRINTER);
                entries.add(ModBlocks.TITANIUM_ORE);
                entries.add(ModBlocks.VOLFRAM_ORE);
            }).build();

    public static void register() {
        LOGGER.debug("Registering item group for " + MOD_ID);
        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "kuberpunk"), ITEM_GROUP);
    };
}
