package com.example.examplemod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class AutoTreePlanterBlockEntity extends BlockEntity {

    public AutoTreePlanterBlockEntity(BlockPos pos, BlockState state) {
        super(
                AutoTreePlanterBlockEntityRegister.AUTO_TREE_PLANTER_BE.get(),
                pos,
                state
        );
    }
}
