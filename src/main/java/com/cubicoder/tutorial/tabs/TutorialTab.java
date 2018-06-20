package com.cubicoder.tutorial.tabs;

import com.cubicoder.tutorial.init.TutorialItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TutorialTab extends CreativeTabs {

	public TutorialTab() {
		super("tabTutorialMod");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(TutorialItems.BASIC_ITEM);
	}

}
