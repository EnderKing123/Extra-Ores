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
		GameRegistry.addRecipe(new ItemStack(MItems.RStick, 4), new Object[]{"X","X", 'X', MItems.Ruby});
		GameRegistry.addRecipe(new ItemStack(MItems.Ruby, 9), new Object[]{"X", 'X', MBlocks.RBlock});
		GameRegistry.addRecipe(new ItemStack(MItems.AIngot, 9), new Object[]{"X", 'X', MBlocks.ABlock});
		GameRegistry.addRecipe(new ItemStack(MItems.LIngot, 9), new Object[]{"X", 'X', MBlocks.LBlock});
		GameRegistry.addRecipe(new ItemStack(MItems.SiIngot, 9), new Object[]{"X", 'X', MBlocks.SBlock});
		GameRegistry.addRecipe(new ItemStack(MItems.CoIngot, 9), new Object[]{"X", 'X', MBlocks.CoBlock});
		GameRegistry.addRecipe(new ItemStack(MItems.TIngot, 9), new Object[]{"X", 'X', MBlocks.TBlock});
		GameRegistry.addRecipe(new ItemStack(MItems.PIngot, 9), new Object[]{"X", 'X', MBlocks.PBlock});
		GameRegistry.addRecipe(new ItemStack(Items.flint, 9), new Object[]{"X", 'X', MBlocks.FBlock});

		//Blocks
		GameRegistry.addRecipe(new ItemStack(MBlocks.RBlock, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.Ruby});
		GameRegistry.addRecipe(new ItemStack(MBlocks.GreenBlock, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.GIngot});
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.OIngot});
		GameRegistry.addRecipe(new ItemStack(MBlocks.ABlock, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.AIngot});
		GameRegistry.addRecipe(new ItemStack(MBlocks.LBlock, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.LIngot});
		GameRegistry.addRecipe(new ItemStack(MBlocks.SBlock, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.SiIngot});
		GameRegistry.addRecipe(new ItemStack(MBlocks.CoBlock, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.CoIngot});
		GameRegistry.addRecipe(new ItemStack(MBlocks.TBlock, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.TIngot});
		GameRegistry.addRecipe(new ItemStack(MBlocks.PBlock, 1), new Object[]{"XXX","XXX","XXX", 'X', MItems.PIngot});
		GameRegistry.addRecipe(new ItemStack(MBlocks.FBlock, 1), new Object[]{"XXX","XXX","XXX", 'X', Items.flint});

		
		//Tools
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
		GameRegistry.addRecipe(new ItemStack(MItems.RHoe, 1), new Object[]{"XX "," Y "," Y ", 'X', MItems.Ruby, 'Y', MItems.RStick});
		GameRegistry.addRecipe(new ItemStack(MItems.RShovel, 1), new Object[]{"X","Y","Y", 'X', MItems.Ruby, 'Y', MItems.RStick});
		GameRegistry.addRecipe(new ItemStack(MItems.RSword, 1), new Object[]{"X","X","Y", 'X', MItems.Ruby, 'Y', MItems.RStick});
		GameRegistry.addRecipe(new ItemStack(MItems.RAxe, 1), new Object[]{"XX ","XY "," Y ", 'X', MItems.Ruby, 'Y', MItems.RStick});
		GameRegistry.addRecipe(new ItemStack(MItems.RPick, 1), new Object[]{"XXX"," Y "," Y ", 'X', MItems.Ruby, 'Y', MItems.RStick});
		GameRegistry.addRecipe(new ItemStack(MItems.LHoe, 1), new Object[]{"XX "," Y "," Y ", 'X', MItems.LIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.LShovel, 1), new Object[]{"X","Y","Y", 'X', MItems.LIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.LSword, 1), new Object[]{"X","X","Y", 'X', MItems.LIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.LAxe, 1), new Object[]{"XX ","XY "," Y ", 'X', MItems.LIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.LPick, 1), new Object[]{"XXX"," Y "," Y ", 'X', MItems.LIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.PHoe, 1), new Object[]{"XX "," Y "," Y ", 'X', MItems.PIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.PShovel, 1), new Object[]{"X","Y","Y", 'X', MItems.PIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.PSword, 1), new Object[]{"X","X","Y", 'X', MItems.PIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.PAxe, 1), new Object[]{"XX ","XY "," Y ", 'X', MItems.PIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.PPick, 1), new Object[]{"XXX"," Y "," Y ", 'X', MItems.PIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.SHoe, 1), new Object[]{"XX "," Y "," Y ", 'X', MItems.SiIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.SShovel, 1), new Object[]{"X","Y","Y", 'X', MItems.SiIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.SSword, 1), new Object[]{"X","X","Y", 'X', MItems.SiIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.SAxe, 1), new Object[]{"XX ","XY "," Y ", 'X', MItems.SiIngot, 'Y', Items.stick});
		GameRegistry.addRecipe(new ItemStack(MItems.SPick, 1), new Object[]{"XXX"," Y "," Y ", 'X', MItems.SiIngot, 'Y', Items.stick});

		//Armor
		GameRegistry.addRecipe(new ItemStack(MItems.GHelmet, 1), new Object[]{"XXX", "X X", 'X', MItems.GIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.GChest, 1), new Object[]{"X X", "XXX", "XXX",'X', MItems.GIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.GPants, 1), new Object[]{"XXX", "X X", "X X",'X', MItems.GIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.GBoots, 1), new Object[]{"X X", "X X", 'X', MItems.GIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.OHelmet, 1), new Object[]{"XXX", "X X", 'X', MItems.OIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.OChest, 1), new Object[]{"X X", "XXX", "XXX",'X', MItems.OIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.OPants, 1), new Object[]{"XXX", "X X", "X X",'X', MItems.OIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.OBoots, 1), new Object[]{"X X", "X X", 'X', MItems.OIngot});
		GameRegistry.addRecipe(new ItemStack(MItems.RHelmet, 1), new Object[]{"XXX", "X X", 'X', MItems.Ruby});
		GameRegistry.addRecipe(new ItemStack(MItems.RChest, 1), new Object[]{"X X", "XXX", "XXX",'X', MItems.Ruby});
		GameRegistry.addRecipe(new ItemStack(MItems.RPants, 1), new Object[]{"XXX", "X X", "X X",'X', MItems.Ruby});
		GameRegistry.addRecipe(new ItemStack(MItems.RBoots, 1), new Object[]{"X X", "X X", 'X', MItems.Ruby});
	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting(MBlocks.ChickenOre, new ItemStack(Items.cooked_chicken, 4), 20.0f);
		GameRegistry.addSmelting(MBlocks.SteakOre, new ItemStack(Items.cooked_beef, 4), 20.0f);
		GameRegistry.addSmelting(MBlocks.PorkOre, new ItemStack(Items.cooked_porkchop, 4), 20.0f);
		GameRegistry.addSmelting(MBlocks.GreenOre, new ItemStack(MItems.GIngot, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.ObsidianOre, new ItemStack(MItems.OIngot, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.POre, new ItemStack(MItems.PIngot, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.CoOre, new ItemStack(MItems.CoIngot, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.TOre, new ItemStack(MItems.TIngot, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.AOre, new ItemStack(MItems.AIngot, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.LOre, new ItemStack(MItems.LIngot, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.SOre, new ItemStack(MItems.SiIngot, 1), 20.0f);
		GameRegistry.addSmelting(MBlocks.NChickenOre, new ItemStack(Items.cooked_chicken, 6), 20.0f);
		GameRegistry.addSmelting(MBlocks.NSteakOre, new ItemStack(Items.cooked_beef, 6), 20.0f);
		GameRegistry.addSmelting(MBlocks.NPorkOre, new ItemStack(Items.cooked_porkchop, 6), 20.0f);
		GameRegistry.addSmelting(MBlocks.NGreenOre, new ItemStack(MItems.GIngot, 3), 20.0f);
		GameRegistry.addSmelting(MBlocks.NObsidianOre, new ItemStack(MItems.OIngot, 3), 20.0f);
		GameRegistry.addSmelting(MBlocks.NPOre, new ItemStack(MItems.PIngot, 3), 20.0f);
		GameRegistry.addSmelting(MBlocks.NCoOre, new ItemStack(MItems.CoIngot, 3), 20.0f);
		GameRegistry.addSmelting(MBlocks.NTOre, new ItemStack(MItems.TIngot, 3), 20.0f);
		GameRegistry.addSmelting(MBlocks.NAOre, new ItemStack(MItems.AIngot, 3), 20.0f);
		GameRegistry.addSmelting(MBlocks.NLOre, new ItemStack(MItems.LIngot, 3), 20.0f);
		GameRegistry.addSmelting(MBlocks.NSOre, new ItemStack(MItems.SiIngot, 3), 20.0f);
		
	}
}
