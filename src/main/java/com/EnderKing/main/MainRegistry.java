package com.EnderKing.main;

import com.EnderKing.Items.GArmor;
import com.EnderKing.Items.MItems;
import com.EnderKing.Items.OArmor;
import com.EnderKing.MBlocks.MBlocks;
import com.EnderKing.creativetabs.MCreativeTabs;
import com.EnderKing.lib.RefStrings;
import com.EnderKing.ores.OreGeneration;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID, name =RefStrings.NAME )
public class MainRegistry {

	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		proxy.registerRenderInfo();
		MCreativeTabs.inititialiseTabs();
		OreGeneration.MainRegistry();
		MBlocks.MainRegistry();
		MItems.MainRegistry();
		CraftingManager.MainRegistry();
		
	}
	@EventHandler
	public static void Load(FMLInitializationEvent Event){
		
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
}
