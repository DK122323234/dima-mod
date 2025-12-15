package com.example.examplemod.Item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.blocks.DimaBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class DimaBlockItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);
    public static final RegistryObject<Item> DIMA_BLOCK_ITEM = ITEMS.register("dima_block_item", () -> new BlockItem(DimaBlock.DIMA_BLOCK.get(), new Item.Properties()));
}
