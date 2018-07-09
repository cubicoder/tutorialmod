package com.cubicoder.tutorial.util;

import com.cubicoder.tutorial.init.TutorialBlocks;
import com.cubicoder.tutorial.init.TutorialItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(TutorialItems.BASIC_ITEM);
		registerModel(TutorialItems.TUTORIAL_AXE);
		registerModel(TutorialItems.TUTORIAL_PICKAXE);
		registerModel(TutorialItems.TUTORIAL_HOE);
		registerModel(TutorialItems.TUTORIAL_SHOVEL);
		registerModel(TutorialItems.TUTORIAL_SWORD);
		registerModel(TutorialItems.TUTORIAL_HELMET);
		registerModel(TutorialItems.TUTORIAL_CHESTPLATE);
		registerModel(TutorialItems.TUTORIAL_LEGGINGS);
		registerModel(TutorialItems.TUTORIAL_BOOTS);
		
		registerModel(Item.getItemFromBlock(TutorialBlocks.BASIC_BLOCK));
	}
	
	private static void registerModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
