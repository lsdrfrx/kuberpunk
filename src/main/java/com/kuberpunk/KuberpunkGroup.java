package com.kuberpunk;

import static com.kuberpunk.Kuberpunk.MOD_ID;

import com.kuberpunk.block.ModBlocks;
import com.kuberpunk.item.Implants;
import com.kuberpunk.item.MiscItems;

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
            .icon(() -> new ItemStack(Implants.EYE_ITEM))
            .displayName(Text.translatable("itemGroup.kuberpunk.kuberpunk"))
            .entries((context, entries) -> {
                // Implants
                entries.add(Implants.EYE_ITEM);
                entries.add(Implants.IMMUNE_BLOCKATOR_ITEM);

                // Misc items
                entries.add(MiscItems.RUBBER_ITEM);
                entries.add(MiscItems.POLYMER_ITEM);
                entries.add(MiscItems.STEEL_INGOT_ITEM);
                entries.add(MiscItems.VOLFRAM_INGOT_ITEM);
                entries.add(MiscItems.TITANIUM_INGOT_ITEM);

                // Blocks
                entries.add(ModBlocks.PRINTER);
                entries.add(ModBlocks.TITANIUM_ORE);
                entries.add(ModBlocks.VOLFRAM_ORE);
            }).build();

    public static void register() {
        LOGGER.debug("Registering item group for " + MOD_ID);
        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "kuberpunk"), ITEM_GROUP);
    };
}
