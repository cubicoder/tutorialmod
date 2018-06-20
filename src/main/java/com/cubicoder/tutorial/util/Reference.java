package com.cubicoder.tutorial.util;

import com.cubicoder.tutorial.tabs.TutorialTab;

import net.minecraft.creativetab.CreativeTabs;

public class Reference {

	public static final String MODID = "tutorialmod";
	public static final String NAME = "Cubicoder's Tutorial Mod";
	public static final String VERSION = "1.0";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final String CLIENT = "com.cubicoder.tutorial.proxy.ClientProxy";
	public static final String SERVER = "com.cubicoder.tutorial.proxy.ServerProxy";
	
	public static final CreativeTabs TUTORIAL_TAB = new TutorialTab();
}
