package com.example.examplemod.Item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.blocks.TestBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TestBlockItem {
   public static final DeferredRegister<Item> TEST_BLOCK_ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);
  public static final  RegistryObject<Item> TEST_BLOCK_ITEM_FRAGILE_REGISTER = TEST_BLOCK_ITEM.register("test_block", () -> new BlockItem(TestBlock.TEST_BLOCK_FRAGILE.get(), new Item.Properties()));
  public static final  RegistryObject<Item> TEST_BLOCK_ITEM_SOLID_REGISTER = TEST_BLOCK_ITEM.register("test_block2", () -> new BlockItem(TestBlock.TEST_BLOCK_SOLID.get(),new Item.Properties()));
}
