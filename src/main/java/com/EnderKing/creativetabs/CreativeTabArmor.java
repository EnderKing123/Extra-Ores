package com.EnderKing.creativetabs;

import com.EnderKing.Items.MItems;
import com.EnderKing.MBlocks.MBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabArmor extends CreativeTabs {

	public CreativeTabArmor(String label) {
		super(label);
	
	}
	@Override
	public Item getTabIconItem() {
		
		return MItems.OHelmet;
	}
	

	
	
}
