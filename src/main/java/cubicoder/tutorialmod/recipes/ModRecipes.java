package cubicoder.tutorialmod.recipes;

import cubicoder.tutorialmod.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void initSmelting() {
		GameRegistry.addSmelting(Items.DIAMOND, new ItemStack(ModItems.FIRST_ITEM), 10.0F);
	}
	
}
