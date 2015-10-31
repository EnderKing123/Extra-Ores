package com.EnderKing.creativetabs;

import com.EnderKing.MBlocks.MBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTabOres extends CreativeTabs {

	public CreativeTabOres(String lable) {
		super(lable);
		
	}
	
	@Override
	public Item getTabIconItem() {
		
		return Item.getItemFromBlock(Blocks.diamond_ore);
	}

}
