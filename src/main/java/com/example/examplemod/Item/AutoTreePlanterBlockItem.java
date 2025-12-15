package com.example.examplemod.Item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.blocks.AutoTreePlanterBlockRegister;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AutoTreePlanterBlockItem {
   public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);
  public static final   RegistryObject<Item> TREE_PLANTER = ITEM.register("tree_planter", ()-> new BlockItem(AutoTreePlanterBlockRegister.TREE_PLANTER.get(), new Item.Properties()));
}
