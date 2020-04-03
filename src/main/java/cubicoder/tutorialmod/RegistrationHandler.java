package cubicoder.tutorialmod;

import cubicoder.tutorialmod.init.ModBlocks;
import cubicoder.tutorialmod.item.ItemTutorialArmor;
import cubicoder.tutorialmod.item.ItemTutorialAxe;
import cubicoder.tutorialmod.item.ItemTutorialHoe;
import cubicoder.tutorialmod.item.ItemTutorialPickaxe;
import cubicoder.tutorialmod.item.ItemTutorialShovel;
import cubicoder.tutorialmod.item.ItemTutorialSword;
import cubicoder.tutorialmod.materials.TutorialMaterials;
import cubicoder.tutorialmod.util.RegistryUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = TutorialMod.MODID)
public class RegistrationHandler {

	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				RegistryUtil.setItemName(new Item(), "first_item").setCreativeTab(TutorialMod.TUTORIAL_TAB),
				
				RegistryUtil.setItemName(new ItemTutorialAxe(TutorialMaterials.TUTORIAL_TOOL, 8.0F, -3.1F), "tutorial_axe").setCreativeTab(TutorialMod.TUTORIAL_TAB),
				RegistryUtil.setItemName(new ItemTutorialHoe(TutorialMaterials.TUTORIAL_TOOL), "tutorial_hoe").setCreativeTab(TutorialMod.TUTORIAL_TAB),
				RegistryUtil.setItemName(new ItemTutorialPickaxe(TutorialMaterials.TUTORIAL_TOOL), "tutorial_pickaxe").setCreativeTab(TutorialMod.TUTORIAL_TAB),
				RegistryUtil.setItemName(new ItemTutorialShovel(TutorialMaterials.TUTORIAL_TOOL), "tutorial_shovel").setCreativeTab(TutorialMod.TUTORIAL_TAB),
				RegistryUtil.setItemName(new ItemTutorialSword(TutorialMaterials.TUTORIAL_TOOL), "tutorial_sword").setCreativeTab(TutorialMod.TUTORIAL_TAB),
				
				RegistryUtil.setItemName(new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.HEAD), "tutorial_helmet").setCreativeTab(TutorialMod.TUTORIAL_TAB),
				RegistryUtil.setItemName(new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.CHEST), "tutorial_chestplate").setCreativeTab(TutorialMod.TUTORIAL_TAB),
				RegistryUtil.setItemName(new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.LEGS), "tutorial_leggings").setCreativeTab(TutorialMod.TUTORIAL_TAB),
				RegistryUtil.setItemName(new ItemTutorialArmor(TutorialMaterials.TUTORIAL_ARMOR, EntityEquipmentSlot.FEET), "tutorial_boots").setCreativeTab(TutorialMod.TUTORIAL_TAB)
		};

		final Item[] itemBlocks = {
				new ItemBlock(ModBlocks.FIRST_BLOCK).setRegistryName(ModBlocks.FIRST_BLOCK.getRegistryName())
		};

		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}

	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				RegistryUtil.setBlockName(new Block(Material.ROCK), "first_block").setCreativeTab(TutorialMod.TUTORIAL_TAB)
		};

		event.getRegistry().registerAll(blocks);
	}

}