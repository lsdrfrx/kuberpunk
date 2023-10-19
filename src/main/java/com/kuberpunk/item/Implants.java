package com.kuberpunk.item;

import static com.kuberpunk.Kuberpunk.LOGGER;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class Implants {
    public static final Item IMMUNE_BLOCKATOR_ITEM = Items.registerItem("immune_blockator",
            new Item(new FabricItemSettings().maxCount(64)
                    .food(new FoodComponent.Builder().alwaysEdible().hunger(0).build())));

    public static final Item EYE_ITEM = Items.registerItem("eye",
            new ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static void register() {
        LOGGER.debug("Registering implants");
    }
}
