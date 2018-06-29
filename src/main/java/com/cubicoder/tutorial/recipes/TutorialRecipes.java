package com.cubicoder.tutorial.recipes;

import com.cubicoder.tutorial.init.TutorialItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TutorialRecipes {

	public static void initSmelting() {
		GameRegistry.addSmelting(Items.DIAMOND, new ItemStack(TutorialItems.BASIC_ITEM), 10.0F);
	}
	
}
