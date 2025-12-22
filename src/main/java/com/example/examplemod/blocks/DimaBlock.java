package com.example.examplemod.blocks;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DimaBlock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);
    public static final RegistryObject<Block> DIMA_BLOCK = BLOCKS.register("dima_block", ()-> new Block(BlockBehaviour.Properties.of().strength(2.0f)));
}
