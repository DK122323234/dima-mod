package com.example.examplemod.blocks;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Properties;

public class AutoTreePlanterBlockRegister {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);
    public static final RegistryObject<Block> TREE_PLANTER = BLOCKS.register("auto_tree_planter_block" , ()-> new AutoTreePlanterBlock(BlockBehaviour.Properties.of()));

}
