package com.EnderKing.MBlocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class GPOre extends Block{

	protected GPOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHardness(2.0f);
	}
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return Items.gunpowder;
		
	}
	
	@Override
	public int quantityDropped(Random rand){
		return 1 + rand.nextInt(4);
	}
}
