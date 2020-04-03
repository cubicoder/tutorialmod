package cubicoder.tutorialmod.util;

import cubicoder.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegistryUtil {

	public static Item setItemName(final Item item, final String name) {
		item.setRegistryName(TutorialMod.MODID, name).setTranslationKey(TutorialMod.MODID + "." + name);
		return item;
	}
	
	public static Block setBlockName(final Block block, final String name) {
		block.setRegistryName(TutorialMod.MODID, name).setTranslationKey(TutorialMod.MODID + "." + name);
		return block;
	}
	
}
