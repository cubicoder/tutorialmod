package com.cubicoder.tutorial.util;

import com.cubicoder.tutorial.block.BlockBasic;
import com.cubicoder.tutorial.init.TutorialBlocks;
import com.cubicoder.tutorial.item.ItemBasic;
import com.cubicoder.tutorial.item.ItemTutorialArmor;
import com.cubicoder.tutorial.item.ItemTutorialAxe;
import com.cubicoder.tutorial.item.ItemTutorialHoe;
import com.cubicoder.tutorial.item.ItemTutorialPickaxe;
import com.cubicoder.tutorial.item.ItemTutorialShovel;
import com.cubicoder.tutorial.item.ItemTutorialSword;
import com.cubicoder.tutorial.materials.TutorialMaterials;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				new BlockBasic(Material.ROCK, "blockBasic", "basic_block")
		};
		
		event.getRegistry().registerAll(blocks);
	}
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				new ItemBasic("itemBasic", "basic_item"),
				new ItemTutorialAxe(TutorialMaterials.TUTORIAL_TOOL, "axeTutorial", "tutorial_axe"),
				new ItemTutorialPickaxe(TutorialMaterials.TUTORIAL_TOOL, "pickaxeTutorial", "tutorial_pickaxe"),
				new ItemTutorialHoe(TutorialMaterials.TUTORIAL_TOOL, "hoeTutorial", "tutorial_hoe"),
				new ItemTutorialShovel(TutorialMaterials.TUTORIAL_TOOL, "shovelTutorial", "tutorial_shovel"),
				new ItemTutorialSword(TutorialMaterials.TUTORIAL_TOOL, "swordTutorial", "tutorial_sword"),
				new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.HEAD, "helmetTutorial", "tutorial_helmet"),
				new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.CHEST, "chestplateTutorial", "tutorial_chestplate"),
				new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.LEGS, "leggingsTutorial", "tutorial_leggings"),
				new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.FEET, "bootsTutorial", "tutorial_boots")
		};
		
		final Item[] itemBlocks = {
				new ItemBlock(TutorialBlocks.BASIC_BLOCK).setRegistryName(TutorialBlocks.BASIC_BLOCK.getRegistryName())
		};
		
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}
	
}
