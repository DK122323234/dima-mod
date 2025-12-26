package com.example.examplemod.blocksEntity;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.blocks.TestBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TestBlockEntityRegister {
    public static final DeferredRegister<BlockEntityType<?>> TEST_BLOCK_ENTITY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ExampleMod.MODID);
    public static final RegistryObject<BlockEntityType<TestBlockEntity>> TEST_BLOCK_ENTITY_OBJECT = TEST_BLOCK_ENTITY.register("test_block_entity", () ->  BlockEntityType.Builder.of((TestBlockEntity::new,   TestBlock.TEST_BLOCK_FRAGILE.get()
    ) ));
}
