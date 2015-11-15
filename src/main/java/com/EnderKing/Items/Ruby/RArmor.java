package com.EnderKing.Items.Ruby;

import com.EnderKing.Items.MItems;
import com.EnderKing.lib.RefStrings;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class RArmor extends ItemArmor{

	public RArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
		if(stack.getItem().equals(MItems.RHelmet)|| stack.getItem().equals(MItems.RChest)|| stack.getItem().equals(MItems.RBoots)){
			return "extraores:textures/armor/RArmor1.png";
		}
		
		if(stack.getItem().equals(MItems.RPants)){
			return "extraores:textures/armor/RArmor2.png";
		}
		
		else return null;
	}

}
