package com.cubicoder.tutorial.item;

import com.cubicoder.tutorial.TutorialMod;

import net.minecraft.item.Item;

public class ItemBasic extends Item {

	public ItemBasic(String unlocalizedName, String registryName) {
		setUnlocalizedName(TutorialMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}
	
}
