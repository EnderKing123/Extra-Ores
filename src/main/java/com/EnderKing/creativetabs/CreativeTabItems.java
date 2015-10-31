package com.EnderKing.creativetabs;

import com.EnderKing.Items.MItems;
import com.EnderKing.MBlocks.MBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabItems extends CreativeTabs {

	
	public CreativeTabItems(String lable) {
		super(lable);
		
	}
	
	@Override
	public Item getTabIconItem() {
		
		return MItems.OIngot;
	}
}
