package com.kuberpunk.item;

import static com.kuberpunk.Kuberpunk.MOD_ID;
import static com.kuberpunk.Kuberpunk.LOGGER;

import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;

public class Items {
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void register() {
        Implants.register();
        MiscItems.register();

        LOGGER.debug("Registering mod items for " + MOD_ID);
    }

}
