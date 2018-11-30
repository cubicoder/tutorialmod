package com.cubicoder.tutorial.item;

import com.cubicoder.tutorial.TutorialMod;

import net.minecraft.item.ItemSword;

public class ItemTutorialSword extends ItemSword {
	
	public ItemTutorialSword(ToolMaterial material, String unlocalizedName, String registryName) {
		super(material);
		
		setTranslationKey(TutorialMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(TutorialMod.TUTORIAL_TAB);
	}

}
