package com.EnderKing.MBlocks;

import java.util.Random;

import com.EnderKing.creativetabs.MCreativeTabs;
import com.EnderKing.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class MBlocks {
	public static void MainRegistry(){
		initialiseBlock();
		registerBlock();
		
	}

	public static Block PorkOre;
	public static Block SteakOre;
	public static Block ChickenOre;
	public static Block StringOre;
	public static Block BoneOre;
	public static Block ObsidianOre;
	public static Block GreenOre;
	public static Block GreenBlock;
	public static Block SlimeOre;
	public static Block GPOre;
	public static Block ROre;
	
	
	public static void initialiseBlock(){		
		PorkOre = new PorkOre(Material.rock).setBlockName("PorkOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":PorkOre");
		SteakOre = new SteakOre(Material.rock).setBlockName("SteakOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":SteakOre");
		ChickenOre = new ChickenOre(Material.rock).setBlockName("ChickenOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":ChickenOre");
		StringOre = new StringOre(Material.rock).setBlockName("StringOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":StringOre");
		BoneOre = new BoneOre(Material.rock).setBlockName("BoneOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":BoneOre");
		ObsidianOre = new ObsidianOre(Material.rock).setBlockName("ObsidianOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":ObsidianOre");
		GreenOre = new GreenOre(Material.rock).setBlockName("GreenOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":GreenOre");
		GreenBlock = new GreenBlock(Material.iron).setBlockName("GreenBlock").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":GreenBlock");
		SlimeOre = new SlimeOre(Material.rock).setBlockName("SlimeOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":SlimeOre");
		GPOre = new GPOre(Material.rock).setBlockName("GPOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":GPOre");
		ROre = new ROre(Material.rock).setBlockName("ROre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":ROre");

	}
	
	public static void registerBlock(){
		GameRegistry.registerBlock(PorkOre, PorkOre.getUnlocalizedName());
		GameRegistry.registerBlock(SteakOre, SteakOre.getUnlocalizedName());
		GameRegistry.registerBlock(ChickenOre, ChickenOre.getUnlocalizedName());
		GameRegistry.registerBlock(BoneOre, BoneOre.getUnlocalizedName());
		GameRegistry.registerBlock(StringOre, StringOre.getUnlocalizedName());
		GameRegistry.registerBlock(ObsidianOre, ObsidianOre.getUnlocalizedName());
		GameRegistry.registerBlock(GreenOre, GreenOre.getUnlocalizedName());
		GameRegistry.registerBlock(GreenBlock, GreenBlock.getUnlocalizedName());
		GameRegistry.registerBlock(SlimeOre, SlimeOre.getUnlocalizedName());
		GameRegistry.registerBlock(GPOre, GPOre.getUnlocalizedName());
		GameRegistry.registerBlock(ROre, ROre.getUnlocalizedName());

	}
	
	
	
	
}
