package com.kuberpunk.item;

import static com.kuberpunk.Kuberpunk.LOGGER;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;

public class MiscItems {
    public static final Item RUBBER_ITEM = Items.registerItem("rubber",
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item POLYMER_ITEM = Items.registerItem("polymer",
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item STEEL_INGOT_ITEM = Items.registerItem("steel_ingot",
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item TITANIUM_INGOT_ITEM = Items.registerItem("titanium_ingot",
            new Item(new FabricItemSettings().maxCount(64)));

    public static final Item VOLFRAM_INGOT_ITEM = Items.registerItem("volfram_ingot",
            new Item(new FabricItemSettings().maxCount(64)));

    public static void register() {
        LOGGER.debug("Registering misc items");
    }
}
