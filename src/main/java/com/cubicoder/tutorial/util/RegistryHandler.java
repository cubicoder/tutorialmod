package com.cubicoder.tutorial.util;

import java.util.ArrayList;
import java.util.List;

import com.cubicoder.tutorial.TutorialMod;
import com.cubicoder.tutorial.block.BlockBasic;
import com.cubicoder.tutorial.item.ItemBasic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

	public static final List<Block> BLOCK_CACHE = new ArrayList<>();
	public static final List<Item> ITEM_CACHE = new ArrayList<>();
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		BLOCK_CACHE.add(new BlockBasic(Material.ROCK, "blockBasic", "basic_block"));
		
		BLOCK_CACHE.forEach(block -> ITEM_CACHE.add(new ItemBlock(block).setRegistryName(block.getRegistryName())));
		
		event.getRegistry().registerAll(BLOCK_CACHE.toArray(new Block[BLOCK_CACHE.size()]));
	}
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		ITEM_CACHE.add(new ItemBasic("itemBasic", "basic_item"));
		
		event.getRegistry().registerAll(ITEM_CACHE.toArray(new Item[ITEM_CACHE.size()]));
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		ITEM_CACHE.forEach(item -> TutorialMod.proxy.registerItemRenderer(item, 0, "inventory"));
		BLOCK_CACHE.clear();
		ITEM_CACHE.clear();
	}
	
}
