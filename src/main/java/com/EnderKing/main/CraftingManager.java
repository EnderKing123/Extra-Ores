package com.EnderKing.main;

import com.EnderKing.Items.MItems;
import com.EnderKing.MBlocks.MBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {
	public static void MainRegistry(){
		addSmeltingRec();
		addCraftingRec();
	}
	public static void addCraftingRec(){
		//Items
		GameRegistry.addRecipe(new ItemStack(MItems.OIngot, 9), new Object[]{"X", 'X', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(MItems.GIngot, 9), new Object[]{"X", 'X', MBlocks.GreenBlock});
		GameRegistry.addRecipe(new ItemStack(MItems.OStick, 4), new Object[]{"X","X", 'X', MItems.OIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.GStick, 4), new Object[]{"X","X", 'X', MItems.GIngot});
		//Blocks
		GameRegistry.addRecipe(new ItemStack(MBlocks.GreenBlock, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.GIngot});
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.OIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.OPick, 1), new Object[]{"XXX"," Y "," Y ", 'X', MItems.OIngot, 'Y', MItems.OStick});
		GameRegistry.addRecipe(new ItemStack(MItems.GPick, 1), new Object[]{"XXX"," Y "," Y ", 'X', MItems.GIngot, 'Y', MItems.GStick});
		GameRegistry.addRecipe(new ItemStack(MItems.OAxe, 1), new Object[]{"XX ","XY "," Y ", 'X', MItems.OIngot, 'Y', MItems.OStick});
		GameRegistry.addRecipe(new ItemStack(MItems.GAxe, 1), new Object[]{"XX ","XY "," Y ", 'X', MItems.GIngot, 'Y', MItems.GStick});
		GameRegistry.addRecipe(new ItemStack(MItems.OSword, 1), new Object[]{"X","X","Y", 'X', MItems.OIngot, 'Y', MItems.OStick});
		GameRegistry.addRecipe(new ItemStack(MItems.GSword, 1), new Object[]{"X","X","Y", 'X', MItems.GIngot, 'Y', MItems.GStick});
		GameRegistry.addRecipe(new ItemStack(MItems.OShovel, 1), new Object[]{"X","Y","Y", 'X', MItems.OIngot, 'Y', MItems.OStick});
		GameRegistry.addRecipe(new ItemStack(MItems.GShovel, 1), new Object[]{"X","Y","Y", 'X', MItems.GIngot, 'Y', MItems.GStick});
		GameRegistry.addRecipe(new ItemStack(MItems.OHoe, 1), new Object[]{"XX "," Y "," Y ", 'X', MItems.OIngot, 'Y', MItems.OStick});
		GameRegistry.addRecipe(new ItemStack(MItems.GHoe, 1), new Object[]{"XX "," Y "," Y ", 'X', MItems.GIngot, 'Y', MItems.GStick});
		//Armor
		GameRegistry.addRecipe(new ItemStack(MItems.GHelmet, 1), new Object[]{"XXX", "X X", 'X', MItems.GIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.GChest, 1), new Object[]{"X X", "XXX", "XXX",'X', MItems.GIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.GPants, 1), new Object[]{"XXX", "X X", "X X",'X', MItems.GIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.GBoots, 1), new Object[]{"X X", "X X", 'X', MItems.GIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.OHelmet, 1), new Object[]{"XXX", "X X", 'X', MItems.OIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.OChest, 1), new Object[]{"X X", "XXX", "XXX",'X', MItems.OIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.OPants, 1), new Object[]{"XXX", "X X", "X X",'X', MItems.OIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.OBoots, 1), new Object[]{"X X", "X X", 'X', MItems.OIngot});

	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting(MBlocks.ChickenOre, new ItemStack(Items.cooked_chicken, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.SteakOre, new ItemStack(Items.cooked_beef, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.PorkOre, new ItemStack(Items.cooked_porkchop, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.GreenOre, new ItemStack(MItems.GIngot, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.ObsidianOre, new ItemStack(MItems.OIngot, 1), 20.0f);

	}
}
