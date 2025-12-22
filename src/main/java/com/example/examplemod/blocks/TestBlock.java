package com.example.examplemod.blocks;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.level.block.Block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class TestBlock {
        public static final DeferredRegister<Block> TEST_BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);
        public static final RegistryObject<Block> TEST_BLOCK_FRAGILE = TEST_BLOCK.register("test_block1", () -> new TestBlock2(BlockBehaviour.Properties.of().strength(2.0f)));
        public static final RegistryObject<Block> TEST_BLOCK_SOLID = TEST_BLOCK.register("test_block2", () -> new TestBlock2(BlockBehaviour.Properties.of().strength(10.0f).requiresCorrectToolForDrops()));

}
