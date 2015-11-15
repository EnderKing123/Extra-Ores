package com.EnderKing.MBlocks.Ores;

import com.EnderKing.creativetabs.MCreativeTabs;
import com.EnderKing.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ObsidianOre extends Block{

	public ObsidianOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHardness(3.0f);
		this.setHarvestLevel("Pickaxe", 3);
	
	}

}
