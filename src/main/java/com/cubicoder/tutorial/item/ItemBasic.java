package com.cubicoder.tutorial.item;

import com.cubicoder.tutorial.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBasic extends Item {

	public ItemBasic(String unlocalizedName, String registryName) {
		setUnlocalizedName(Reference.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.MISC);
	}
	
}
