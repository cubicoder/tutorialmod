package com.cubicoder.tutorial.item;

import com.cubicoder.tutorial.TutorialMod;

import net.minecraft.item.ItemAxe;

public class ItemTutorialAxe extends ItemAxe {
	
	public ItemTutorialAxe(ToolMaterial material, float damage, float speed, String unlocalizedName, String registryName) {
		super(material, damage, speed);
		
		setUnlocalizedName(TutorialMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}

	public ItemTutorialAxe(ToolMaterial material, String unlocalizedName, String registryName) {
		this(material, 8.0F, -3.1F, unlocalizedName, registryName);
	}
	
}
