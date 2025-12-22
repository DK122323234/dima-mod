package com.example.examplemod.blocks;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AutoTreePlanterBlockEntityRegister {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ExampleMod.MODID);
    public static final RegistryObject<BlockEntityType<AutoTreePlanterBlockEntity>>
            AUTO_TREE_PLANTER_BE =
            BLOCK_ENTITY.register("auto_tree_planter_be",
                    () -> BlockEntityType.Builder.of(
                            (pos, state) -> new AutoTreePlanterBlockEntity(pos, state),
                            new Block[] { AutoTreePlanterBlockRegister.TREE_PLANTER.get() }
                    ).build(null)
            );

}
