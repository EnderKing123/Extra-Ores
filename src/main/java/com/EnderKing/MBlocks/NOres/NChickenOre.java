package com.EnderKing.MBlocks.NOres;

import java.util.Random;

import com.EnderKing.creativetabs.MCreativeTabs;
import com.EnderKing.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class NChickenOre extends Block{

	public NChickenOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setHardness(2.0f);
		this.setHarvestLevel("Pickaxe", 1);
	
	}

	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return Items.chicken;
	}
	
	@Override
	public int quantityDropped(Random rand){
		return 1 + rand.nextInt(3);
	}


}
