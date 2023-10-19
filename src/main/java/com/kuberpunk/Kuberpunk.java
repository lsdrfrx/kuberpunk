package com.kuberpunk;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kuberpunk.block.ModBlocks;
import com.kuberpunk.item.Items;

public class Kuberpunk implements ModInitializer {
    public static final String MOD_ID = "kuberpunk";
    public static final Logger LOGGER = LoggerFactory.getLogger("kuberpunk");

    @Override
    public void onInitialize() {
        Items.register();
        ModBlocks.register();
        KuberpunkGroup.register();

        LOGGER.info("Hello Fabric world!");
    }
}