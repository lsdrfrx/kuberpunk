package com.kuberpunk.item;

import static com.kuberpunk.Kuberpunk.MOD_ID;
import static com.kuberpunk.Kuberpunk.LOGGER;

import net.minecraft.item.Item;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.FoodComponent;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class ModItems {
    public static final Item EYE_ITEM = registerItem("eye",
            new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item RUBBER_ITEM = registerItem("rubber",
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item POLYMER_ITEM = registerItem("polymer",
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item IMMUNE_BLOCKATOR_ITEM = registerItem("immune_blockator",
            new Item(new FabricItemSettings().maxCount(64)
                    .food(new FoodComponent.Builder().alwaysEdible().hunger(0).build())));

    public static final Item STEEL_ITEM = registerItem("steel_ingot",
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item TITANIUM_ITEM = registerItem("titanium_ingot",
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item VOLFRAM_ITEM = registerItem("volfram_ingot",
            new Item(new FabricItemSettings().maxCount(64)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void register() {
        LOGGER.debug("Registering mod items for " + MOD_ID);
    }

}
