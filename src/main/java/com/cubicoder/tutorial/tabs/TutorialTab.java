package com.cubicoder.tutorial.tabs;

import com.cubicoder.tutorial.TutorialMod;
import com.cubicoder.tutorial.init.TutorialItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TutorialTab extends CreativeTabs {

	public TutorialTab(String name) {
		super(TutorialMod.MODID + "." + name);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(TutorialItems.BASIC_ITEM);
	}

}
