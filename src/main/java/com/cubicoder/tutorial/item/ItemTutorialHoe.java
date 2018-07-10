package com.cubicoder.tutorial.item;

import com.cubicoder.tutorial.TutorialMod;

import net.minecraft.item.ItemHoe;

public class ItemTutorialHoe extends ItemHoe {
	
	public ItemTutorialHoe(ToolMaterial material, String unlocalizedName, String registryName) {
		super(material);
		
		setUnlocalizedName(TutorialMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}

}
