package com.example.examplemod.Item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.blocks.TestBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DimaItem {
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);
    public static final RegistryObject<Item> ITEM_TUT = ITEM.register("dima_item", ()-> new BlockItem(TestBlock.TEST_BLOCK_FRAGILE.get(), new Item.Properties()));
}
