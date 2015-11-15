package com.EnderKing.Items.Greentanium;

import com.EnderKing.Items.MItems;
import com.EnderKing.lib.RefStrings;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class GArmor extends ItemArmor{

	public GArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
		if(stack.getItem().equals(MItems.GHelmet)|| stack.getItem().equals(MItems.GChest)|| stack.getItem().equals(MItems.GBoots)){
			return "extraores:textures/armor/GArmor1.png";
		}
		
		if(stack.getItem().equals(MItems.GPants)){
			return "extraores:textures/armor/GArmor2.png";
		}
		
		else return null;
	}

}
