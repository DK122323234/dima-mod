package com.example.examplemod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class AutoTreePlanterBlockEntity {
    private static final int RADIUS = 5;
    private static final int INTERVAL = 2400;
    private int tickCounter = 0;

    public AutoTreePlanterBlockEntity(BlockPos pos, BlockState state) {
    }
}
