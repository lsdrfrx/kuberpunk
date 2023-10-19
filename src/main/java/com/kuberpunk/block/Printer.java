package com.kuberpunk.block;

import static com.kuberpunk.Kuberpunk.LOGGER;

import com.kuberpunk.gui.PrinterGui;
import com.kuberpunk.gui.PrinterScreen;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Printer extends Block {
    public Printer(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand,
            BlockHitResult hit) {
        // MinecraftClient.getInstance().setScreenAndRender(new PrinterScreen(new PrinterGui()));

        return super.onUse(state, world, pos, player, hand, hit);
    }
}
