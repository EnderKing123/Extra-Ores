package com.EnderKing.Items.Obsidian;

import com.EnderKing.Items.MItems;
import com.EnderKing.lib.RefStrings;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class OArmor extends ItemArmor{

	
	public OArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
		if(stack.getItem().equals(MItems.OHelmet)|| stack.getItem().equals(MItems.OChest)|| stack.getItem().equals(MItems.OBoots)){
			return "extraores:textures/armor/OArmor1.png";
		}
		
		if(stack.getItem().equals(MItems.OPants)){
			return "extraores:textures/armor/OArmor2.png";
		}
		
		else return null;
	}


}
