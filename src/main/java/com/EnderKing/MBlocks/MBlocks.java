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
import net.minecraftforge.oredict.OreDictionary;

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
	public static Block NPorkOre;
	public static Block NSteakOre;
	public static Block NChickenOre;
	public static Block NStringOre;
	public static Block NBoneOre;
	public static Block NObsidianOre;
	public static Block NGreenOre;
	public static Block NSlimeOre;
	public static Block NGPOre;
	public static Block NROre;
	public static Block NPOre;
	public static Block NCoOre;
	public static Block NTOre;
	public static Block NSOre;
	public static Block NLOre;
	public static Block NAOre;
	public static Block NFOre;
	public static Block NArrowOre;
	public static Block NFeatherOre;
	

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
		GSOre = new com.EnderKing.MBlocks.NOres.GSOre(Material.rock).setBlockName("GSOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":GSOre");
		MCOre = new com.EnderKing.MBlocks.NOres.MCOre(Material.rock).setBlockName("MCOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":MCOre");
		GTOre = new com.EnderKing.MBlocks.NOres.GTOre(Material.rock).setBlockName("GTOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":GTOre");
		NPorkOre = new com.EnderKing.MBlocks.NOres.NPorkOre(Material.rock).setBlockName("NPorkOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NPorkOre");
		NSteakOre = new com.EnderKing.MBlocks.NOres.NSteakOre(Material.rock).setBlockName("NSteakOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NSteakOre");
		NChickenOre = new com.EnderKing.MBlocks.NOres.NChickenOre(Material.rock).setBlockName("NChickenOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NChickenOre");
		NStringOre = new com.EnderKing.MBlocks.NOres.NStringOre(Material.rock).setBlockName("NStringOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NStringOre");
		NBoneOre = new com.EnderKing.MBlocks.NOres.NBoneOre(Material.rock).setBlockName("NBoneOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NBoneOre");
		NObsidianOre = new com.EnderKing.MBlocks.NOres.NObsidianOre(Material.rock).setBlockName("NObsidianOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NObsidianOre");
		NGreenOre = new com.EnderKing.MBlocks.NOres.NGreenOre(Material.rock).setBlockName("NGreenOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NGreenOre");
		NSlimeOre = new com.EnderKing.MBlocks.NOres.NSlimeOre(Material.rock).setBlockName("NSlimeOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NSlimeOre");
		NGPOre = new com.EnderKing.MBlocks.NOres.NGPOre(Material.rock).setBlockName("NGPOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NGPOre");
		NROre = new com.EnderKing.MBlocks.NOres.NROre(Material.rock).setBlockName("NROre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NROre");
		NPOre = new com.EnderKing.MBlocks.NOres.NPOre(Material.rock).setBlockName("NPOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NPOre");
		NCoOre = new com.EnderKing.MBlocks.NOres.NCoOre(Material.rock).setBlockName("NCoOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NCoOre");
		NTOre = new com.EnderKing.MBlocks.NOres.NTOre(Material.rock).setBlockName("NTOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NTOre");
		NAOre = new com.EnderKing.MBlocks.NOres.NAOre(Material.rock).setBlockName("NAOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NAOre");
		NLOre = new com.EnderKing.MBlocks.NOres.NLOre(Material.rock).setBlockName("NLOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NLOre");
		NSOre = new com.EnderKing.MBlocks.NOres.NSOre(Material.rock).setBlockName("NSOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NSOre");
		NFOre = new com.EnderKing.MBlocks.NOres.NFOre(Material.rock).setBlockName("NFOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NFOre");
		NArrowOre = new com.EnderKing.MBlocks.NOres.NArrowOre(Material.rock).setBlockName("NArrowOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NArrowOre");
		NFeatherOre = new com.EnderKing.MBlocks.NOres.NFeatherOre(Material.rock).setBlockName("NFeatherOre").setCreativeTab(MCreativeTabs.TabNBlocks).setBlockTextureName(RefStrings.MODID + ":NFeatherOre");

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
		GameRegistry.registerBlock(NPorkOre, NPorkOre.getUnlocalizedName());
		GameRegistry.registerBlock(NSteakOre, NSteakOre.getUnlocalizedName());
		GameRegistry.registerBlock(NChickenOre, NChickenOre.getUnlocalizedName());
		GameRegistry.registerBlock(NBoneOre, NBoneOre.getUnlocalizedName());
		GameRegistry.registerBlock(NStringOre, NStringOre.getUnlocalizedName());
		GameRegistry.registerBlock(NObsidianOre, NObsidianOre.getUnlocalizedName());
		GameRegistry.registerBlock(NGreenOre, NGreenOre.getUnlocalizedName());
		GameRegistry.registerBlock(NSlimeOre, NSlimeOre.getUnlocalizedName());
		GameRegistry.registerBlock(NGPOre, NGPOre.getUnlocalizedName());
		GameRegistry.registerBlock(NROre, NROre.getUnlocalizedName());
		GameRegistry.registerBlock(NPOre, NPOre.getUnlocalizedName());
		GameRegistry.registerBlock(NCoOre, NCoOre.getUnlocalizedName());
		GameRegistry.registerBlock(NTOre, NTOre.getUnlocalizedName());
		GameRegistry.registerBlock(NAOre, NAOre.getUnlocalizedName());
		GameRegistry.registerBlock(NLOre, NLOre.getUnlocalizedName());
		GameRegistry.registerBlock(NSOre, NSOre.getUnlocalizedName());
		GameRegistry.registerBlock(NFOre, NFOre.getUnlocalizedName());
		GameRegistry.registerBlock(NArrowOre, NArrowOre.getUnlocalizedName());
		GameRegistry.registerBlock(NFeatherOre, NFeatherOre.getUnlocalizedName());
		
		OreDictionary.registerOre("oreCopper", CoOre);
		OreDictionary.registerOre("oreTin", TOre);
		OreDictionary.registerOre("oreAluminum", AOre);
		OreDictionary.registerOre("oreAluminium", AOre);
		OreDictionary.registerOre("oreLead", LOre);
		OreDictionary.registerOre("oreSilver", SOre);
		OreDictionary.registerOre("orePlatinum", POre);
		OreDictionary.registerOre("orePlatinum", POre);
		
		OreDictionary.registerOre("oreNetherCopper", NCoOre);
		OreDictionary.registerOre("oreNetherTin", NTOre);
		OreDictionary.registerOre("oreNetherAluminum", NAOre);
		OreDictionary.registerOre("oreNetherAluminium", NAOre);
		OreDictionary.registerOre("oreNetherLead", NLOre);
		OreDictionary.registerOre("oreNetherSilver", NSOre);
		OreDictionary.registerOre("oreNetherPlatinum", NPOre);
		OreDictionary.registerOre("oreNetherPlatinum", NPOre);
	}
	
	
	
	
}
