package com.EnderKing.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class MCreativeTabs {
	
	public static CreativeTabs TabBlocks;
	public static CreativeTabs TabItems;
	public static CreativeTabs TabTools;
	public static CreativeTabs TabArmor;
	public static CreativeTabs TabNBlocks;
	
	public static void inititialiseTabs(){
		TabBlocks = new CreativeTabOres("TabBlocks");
		TabNBlocks = new CreativeTabNOres("TabNBlocks");
		TabItems = new CreativeTabItems("TabItems");
		TabTools = new CreativeTabTools("TabTools");
		TabArmor = new CreativeTabArmor("TabArmor");


	}
}
