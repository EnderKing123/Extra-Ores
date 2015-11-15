package com.EnderKing.MBlocks.Storage;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RBlock extends Block{

	public RBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHardness(3.0f);
		this.setHarvestLevel("Pickaxe", 2);
	}

}
