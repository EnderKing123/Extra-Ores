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
	public static Block RBlock;
	public static Block GreenBlock;
	public static Block SlimeOre;
	public static Block GPOre;
	public static Block ROre;
	public static Block POre;
	public static Block CoOre;
	public static Block TOre;
	public static Block SOre;
	public static Block LOre;
	public static Block AOre;
	public static Block ABlock;
	public static Block LBlock;
	public static Block SBlock;
	public static Block TBlock;
	public static Block CoBlock;
	public static Block PBlock;
	public static Block FOre;
	public static Block FBlock;
	public static Block ArrowOre;
	public static Block FeatherOre;
	public static Block EPOre;
	public static Block FishOre;
	public static Block GSOre;
	public static Block MCOre;
	public static Block GTOre;

	public static void initialiseBlock(){		
		PorkOre = new com.EnderKing.MBlocks.Ores.PorkOre(Material.rock).setBlockName("PorkOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":PorkOre");
		SteakOre = new com.EnderKing.MBlocks.Ores.SteakOre(Material.rock).setBlockName("SteakOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":SteakOre");
		ChickenOre = new com.EnderKing.MBlocks.Ores.ChickenOre(Material.rock).setBlockName("ChickenOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":ChickenOre");
		StringOre = new com.EnderKing.MBlocks.Ores.StringOre(Material.rock).setBlockName("StringOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":StringOre");
		BoneOre = new com.EnderKing.MBlocks.Ores.BoneOre(Material.rock).setBlockName("BoneOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":BoneOre");
		ObsidianOre = new com.EnderKing.MBlocks.Ores.ObsidianOre(Material.rock).setBlockName("ObsidianOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":ObsidianOre");
		GreenOre = new com.EnderKing.MBlocks.Ores.GreenOre(Material.rock).setBlockName("GreenOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":GreenOre");
		GreenBlock = new com.EnderKing.MBlocks.Storage.GreenBlock(Material.iron).setBlockName("GreenBlock").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":GreenBlock");
		SlimeOre = new com.EnderKing.MBlocks.Ores.SlimeOre(Material.rock).setBlockName("SlimeOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":SlimeOre");
		GPOre = new com.EnderKing.MBlocks.Ores.GPOre(Material.rock).setBlockName("GPOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":GPOre");
		ROre = new com.EnderKing.MBlocks.Ores.ROre(Material.rock).setBlockName("ROre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":ROre");
		RBlock = new com.EnderKing.MBlocks.Storage.RBlock(Material.iron).setBlockName("ROre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":ROre");
		POre = new com.EnderKing.MBlocks.Ores.POre(Material.rock).setBlockName("POre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":POre");
		CoOre = new com.EnderKing.MBlocks.Ores.CoOre(Material.rock).setBlockName("CoOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":CoOre");
		TOre = new com.EnderKing.MBlocks.Ores.TOre(Material.rock).setBlockName("TOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":TOre");
		AOre = new com.EnderKing.MBlocks.Ores.AOre(Material.rock).setBlockName("AOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":AOre");
		LOre = new com.EnderKing.MBlocks.Ores.LOre(Material.rock).setBlockName("LOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":LOre");
		SOre = new com.EnderKing.MBlocks.Ores.SOre(Material.rock).setBlockName("SOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":SOre");
		PBlock = new com.EnderKing.MBlocks.Storage.PBlock(Material.iron).setBlockName("PBlock").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":PBlock");
		CoBlock = new com.EnderKing.MBlocks.Storage.CoBlock(Material.iron).setBlockName("CoBlock").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":CoBlock");
		TBlock = new com.EnderKing.MBlocks.Storage.TBlock(Material.iron).setBlockName("TBlock").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":TBlock");
		ABlock = new com.EnderKing.MBlocks.Storage.ABlock(Material.iron).setBlockName("ABlock").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":ABlock");
		LBlock = new com.EnderKing.MBlocks.Storage.LBlock(Material.iron).setBlockName("LBlock").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":LBlock");
		SBlock = new com.EnderKing.MBlocks.Storage.SBlock(Material.iron).setBlockName("SBlock").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":SBlock");
		FOre = new com.EnderKing.MBlocks.Ores.FOre(Material.rock).setBlockName("FOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":FOre");
		FBlock = new com.EnderKing.MBlocks.Storage.FBlock(Material.rock).setBlockName("FBlock").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":FBlock");
		ArrowOre = new com.EnderKing.MBlocks.Ores.ArrowOre(Material.rock).setBlockName("ArrowOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":ArrowOre");
		FeatherOre = new com.EnderKing.MBlocks.Ores.FeatherOre(Material.rock).setBlockName("FeatherOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":FeatherOre");
		EPOre = new com.EnderKing.MBlocks.Ores.EPOre(Material.rock).setBlockName("EPOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":EPOre");
		FishOre = new com.EnderKing.MBlocks.Ores.FishOre(Material.sand).setBlockName("FishOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":FishOre");
		GSOre = new com.EnderKing.MBlocks.Ores.GSOre(Material.rock).setBlockName("GSOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":GSOre");
		MCOre = new com.EnderKing.MBlocks.Ores.MCOre(Material.rock).setBlockName("MCOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":MCOre");
		GTOre = new com.EnderKing.MBlocks.Ores.GTOre(Material.rock).setBlockName("GTOre").setCreativeTab(MCreativeTabs.TabBlocks).setBlockTextureName(RefStrings.MODID + ":GTOre");

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
		GameRegistry.registerBlock(POre, POre.getUnlocalizedName());
		GameRegistry.registerBlock(CoOre, CoOre.getUnlocalizedName());
		GameRegistry.registerBlock(TOre, TOre.getUnlocalizedName());
		GameRegistry.registerBlock(AOre, AOre.getUnlocalizedName());
		GameRegistry.registerBlock(LOre, LOre.getUnlocalizedName());
		GameRegistry.registerBlock(SOre, SOre.getUnlocalizedName());
		GameRegistry.registerBlock(PBlock, PBlock.getUnlocalizedName());
		GameRegistry.registerBlock(CoBlock, CoBlock.getUnlocalizedName());
		GameRegistry.registerBlock(TBlock, TBlock.getUnlocalizedName());
		GameRegistry.registerBlock(ABlock, ABlock.getUnlocalizedName());
		GameRegistry.registerBlock(LBlock, LBlock.getUnlocalizedName());
		GameRegistry.registerBlock(SBlock, SBlock.getUnlocalizedName());
		GameRegistry.registerBlock(FOre, FOre.getUnlocalizedName());
		GameRegistry.registerBlock(FBlock, FBlock.getUnlocalizedName());
		GameRegistry.registerBlock(ArrowOre, ArrowOre.getUnlocalizedName());
		GameRegistry.registerBlock(FeatherOre, FeatherOre.getUnlocalizedName());
		GameRegistry.registerBlock(FishOre, FishOre.getUnlocalizedName());
		GameRegistry.registerBlock(EPOre, EPOre.getUnlocalizedName());
		GameRegistry.registerBlock(MCOre, MCOre.getUnlocalizedName());
		GameRegistry.registerBlock(GSOre, GSOre.getUnlocalizedName());
		GameRegistry.registerBlock(GTOre, GTOre.getUnlocalizedName());

	}
	
	
	
	
}
