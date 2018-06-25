package com.cubicoder.tutorial.materials;

import com.cubicoder.tutorial.TutorialMod;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TutorialMaterials {

	public static final ToolMaterial TUTORIAL_TOOL = EnumHelper.addToolMaterial(TutorialMod.MODID + ":" + "tutorial_tool", 2, 625, 7.0F, 2.5F, 10);
	
}
