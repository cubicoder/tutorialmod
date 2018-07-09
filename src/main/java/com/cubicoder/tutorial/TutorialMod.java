package com.cubicoder.tutorial;

import org.apache.logging.log4j.Logger;

import com.cubicoder.tutorial.proxy.IProxy;
import com.cubicoder.tutorial.recipes.TutorialRecipes;
import com.cubicoder.tutorial.tabs.TutorialTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TutorialMod.MODID, name = TutorialMod.NAME, version = TutorialMod.VERSION, acceptedMinecraftVersions = TutorialMod.MC_VERSION)
public class TutorialMod {
	
	public static final String MODID = "tutorialmod";
	public static final String NAME = "Cubicoder's Tutorial Mod";
	public static final String VERSION = "1.0";
	public static final String MC_VERSION = "[1.12.2]";
	
	public static final String CLIENT = "com.cubicoder.tutorial.proxy.ClientProxy";
	public static final String SERVER = "com.cubicoder.tutorial.proxy.ServerProxy";
	
	public static final CreativeTabs TUTORIAL_TAB = new TutorialTab("tabTutorialMod");
	
	@SidedProxy(clientSide = TutorialMod.CLIENT, serverSide = TutorialMod.SERVER)
	public static IProxy proxy;
	
	public static Logger logger;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		TutorialRecipes.initSmelting();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
}
