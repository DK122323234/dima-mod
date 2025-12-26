package com.example.examplemod.blocksEntity;

import com.example.examplemod.blocks.TestBlock;
import net.minecraft.core.BlockPos;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class TestBlockEntity extends BlockEntity {

    public TestBlockEntity(BlockPos pos, BlockState state) {
        super(
                TestBlockEntityRegister.TEST_BLOCK_ENTITY_OBJECT.get(),
                pos,
                state
        );
    }
}
