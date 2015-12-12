package com.EnderKing.Items;

import com.EnderKing.Items.Greentanium.GArmor;
import com.EnderKing.Items.Greentanium.GAxe;
import com.EnderKing.Items.Greentanium.GHoe;
import com.EnderKing.Items.Greentanium.GPick;
import com.EnderKing.Items.Greentanium.GShovel;
import com.EnderKing.Items.Greentanium.GSword;
import com.EnderKing.creativetabs.MCreativeTabs;
import com.EnderKing.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MItems {

	public static void MainRegistry(){
		initialiseItem();
		registerItem();
		
	}
	
	//Tool Materials
	public static ToolMaterial OTool = EnumHelper.addToolMaterial("Obsidian Tool", 3, 1000, 7.0f, 3.5f, 10);
	public static ToolMaterial MTool = EnumHelper.addToolMaterial("Metal Tool", 2, 1000, 7.0f, 3.0f, 10);
	public static ToolMaterial SMTool = EnumHelper.addToolMaterial("Strengthened Metal Tool", 3, 2500, 9.0f, 4.5f, 10);
	public static ToolMaterial RTool = EnumHelper.addToolMaterial("Ruby Tool", 2, 2000, 9.0f, 4.0f, 10);
	public static ToolMaterial GTool = EnumHelper.addToolMaterial("Greentanium Tool", 4, 5000, 12.0f, 5.0f, 10);
	
	//ArmorMaterials
	public static ArmorMaterial OArmor = EnumHelper.addArmorMaterial("Obsidian Armor", 15, new int []{3, 7, 3, 3}, 10);
	public static ArmorMaterial GArmor = EnumHelper.addArmorMaterial("Greentanium Armor", 40, new int []{4, 8, 4, 4}, 10);
	public static ArmorMaterial RArmor = EnumHelper.addArmorMaterial("Ruby Armor", 20, new int[]{2, 6, 5, 2}, 10);
	
	
	//Items
	public static Item GIngot;
	public static Item OIngot;
	public static Item OPick;
	public static Item OAxe;
	public static Item OSword;
	public static Item OShovel;
	public static Item OHoe;
	public static Item GPick;
	public static Item GAxe;
	public static Item GSword;
	public static Item GShovel;
	public static Item GHoe;
	public static Item OStick;
	public static Item GStick;
	public static Item OHelmet;
	public static Item OChest;
	public static Item OPants;
	public static Item OBoots;
	public static Item GHelmet;
	public static Item GChest;
	public static Item GPants;
	public static Item GBoots;
	public static Item Ruby;
	public static Item RPick;	
	public static Item RShovel;	
	public static Item RAxe	;
	public static Item RSword;	
	public static Item RHoe;
	public static Item RStick;
	public static Item RHelmet;
	public static Item RChest;
	public static Item RPants;
	public static Item RBoots;
	public static Item CoIngot;
	public static Item PIngot;
	public static Item TIngot;
	public static Item AIngot;
	public static Item SiIngot;
	public static Item LIngot;
	public static Item LPick;
	public static Item LShovel;
	public static Item LSword;
	public static Item LAxe;
	public static Item LHoe;
	public static Item SPick;
	public static Item SShovel;
	public static Item SSword;
	public static Item SAxe;
	public static Item SHoe;
	public static Item PPick;
	public static Item PShovel;
	public static Item PSword;
	public static Item PAxe;
	public static Item PHoe;
	

	public static void initialiseItem(){
		//Items
		OIngot = new Item().setUnlocalizedName("OIngot").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":OIngot");
		GIngot = new Item().setUnlocalizedName("GIngot").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":GIngot");
		Ruby = new Item().setUnlocalizedName("Ruby").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":Ruby");
		OStick = new Item().setUnlocalizedName("OStick").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":OStick");
		GStick = new Item().setUnlocalizedName("GStick").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":GStick");
		RStick = new Item().setUnlocalizedName("RStick").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":RStick");
		CoIngot = new Item().setUnlocalizedName("CoIngot").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":CoIngot");
		PIngot = new Item().setUnlocalizedName("PIngot").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":PIngot");
		TIngot = new Item().setUnlocalizedName("TIngot").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":TIngot");
		AIngot = new Item().setUnlocalizedName("AIngot").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":AIngot");
		SiIngot = new Item().setUnlocalizedName("SiIngot").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":SiIngot");
		LIngot = new Item().setUnlocalizedName("LIngot").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":LIngot");

		//Tools		
		OPick = new com.EnderKing.Items.Obsidian.OPick(OTool).setUnlocalizedName("OPick").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":OPick");
		OAxe = new com.EnderKing.Items.Obsidian.OAxe(OTool).setUnlocalizedName("OAxe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":OAxe");
		OSword = new com.EnderKing.Items.Obsidian.OSword(OTool).setUnlocalizedName("OSword").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":OSword");
		OShovel = new com.EnderKing.Items.Obsidian.OShovel(OTool).setUnlocalizedName("OShovel").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":OShovel");
		OHoe = new com.EnderKing.Items.Obsidian.OAxe(OTool).setUnlocalizedName("OHoe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":OHoe");
		GPick = new com.EnderKing.Items.Greentanium.GPick(GTool).setUnlocalizedName("GPick").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":GPick");
		GAxe = new com.EnderKing.Items.Greentanium.GAxe(GTool).setUnlocalizedName("GAxe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":GAxe");
		GSword = new com.EnderKing.Items.Greentanium.GSword(GTool).setUnlocalizedName("GSword").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":GSword");
		GShovel = new com.EnderKing.Items.Greentanium.GShovel(GTool).setUnlocalizedName("GShovel").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":GShovel");
		GHoe = new com.EnderKing.Items.Greentanium.GHoe(GTool).setUnlocalizedName("GHoe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":GHoe");
		RPick = new com.EnderKing.Items.Ruby.RPick(RTool).setUnlocalizedName("RPick").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":RPick");
		RAxe = new com.EnderKing.Items.Ruby.RAxe(RTool).setUnlocalizedName("RAxe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":RAxe");
		RSword = new com.EnderKing.Items.Ruby.RSword(RTool).setUnlocalizedName("RSword").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":RSword");
		RShovel = new com.EnderKing.Items.Ruby.RShovel(RTool).setUnlocalizedName("RShovel").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":RShovel");
		RHoe = new com.EnderKing.Items.Ruby.RHoe(RTool).setUnlocalizedName("RHoe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":RHoe");
		LPick = new com.EnderKing.Items.Lead.LPick(MTool).setUnlocalizedName("LPick").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":LPick");
		LAxe = new com.EnderKing.Items.Lead.LAxe(MTool).setUnlocalizedName("LAxe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":LAxe");
		LSword = new com.EnderKing.Items.Lead.LSword(MTool).setUnlocalizedName("LSword").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":LSword");
		LShovel = new com.EnderKing.Items.Lead.LShovel(MTool).setUnlocalizedName("LShovel").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":LShovel");
		LHoe = new com.EnderKing.Items.Lead.LHoe(MTool).setUnlocalizedName("LHoe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":LHoe");
		SPick = new com.EnderKing.Items.Silver.SPick(MTool).setUnlocalizedName("SPick").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":SPick");
		SAxe = new com.EnderKing.Items.Silver.SAxe(MTool).setUnlocalizedName("SAxe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":SAxe");
		SSword = new com.EnderKing.Items.Silver.SSword(MTool).setUnlocalizedName("SSword").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":SSword");
		SShovel = new com.EnderKing.Items.Silver.SShovel(MTool).setUnlocalizedName("SShovel").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":SShovel");
		SHoe = new com.EnderKing.Items.Silver.SHoe(MTool).setUnlocalizedName("SHoe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":SHoe");
		PPick = new com.EnderKing.Items.Platinum.PPick(SMTool).setUnlocalizedName("PPick").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":PPick");
		PAxe = new com.EnderKing.Items.Platinum.PAxe(SMTool).setUnlocalizedName("PAxe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":PAxe");
		PSword = new com.EnderKing.Items.Platinum.PSword(SMTool).setUnlocalizedName("PSword").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":PSword");
		PShovel = new com.EnderKing.Items.Platinum.PShovel(SMTool).setUnlocalizedName("PShovel").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":PShovel");
		PHoe = new com.EnderKing.Items.Platinum.PHoe(SMTool).setUnlocalizedName("PHoe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":PHoe");

		//Armor
		OHelmet = new com.EnderKing.Items.Obsidian.OArmor(OArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("OArmor"), 0).setUnlocalizedName("OHelmet").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":OHelmet");
		OChest = new com.EnderKing.Items.Obsidian.OArmor(OArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("OArmor"), 1).setUnlocalizedName("OChest").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":OChest");
		OPants = new com.EnderKing.Items.Obsidian.OArmor(OArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("OArmor"), 2).setUnlocalizedName("OPants").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":OPants");
		OBoots = new com.EnderKing.Items.Obsidian.OArmor(OArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("OArmor"), 3).setUnlocalizedName("OBoots").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":OBoots");
		GHelmet = new com.EnderKing.Items.Greentanium.GArmor(GArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("GArmor"), 0).setUnlocalizedName("GHelmet").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":GHelmet");
		GChest = new com.EnderKing.Items.Greentanium.GArmor(GArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("GArmor"), 1).setUnlocalizedName("GChest").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":GChest");
		GPants = new com.EnderKing.Items.Greentanium.GArmor(GArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("GArmor"), 2).setUnlocalizedName("GPants").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":GPants");
		GBoots = new com.EnderKing.Items.Greentanium.GArmor(GArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("GArmor"), 3).setUnlocalizedName("GBoots").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":GBoots");
		RHelmet = new com.EnderKing.Items.Ruby.RArmor(RArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("RArmor"), 0).setUnlocalizedName("RHelmet").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":RHelmet");
		RChest = new com.EnderKing.Items.Ruby.RArmor(RArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("RArmor"), 1).setUnlocalizedName("RChest").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":RChest");
		RPants = new com.EnderKing.Items.Ruby.RArmor(RArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("RArmor"), 2).setUnlocalizedName("RPants").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":RPants");
		RBoots = new com.EnderKing.Items.Ruby.RArmor(RArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("RArmor"), 3).setUnlocalizedName("RBoots").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":RBoots");

	}
	
	public static void registerItem(){
		GameRegistry.registerItem(OIngot, OIngot.getUnlocalizedName());
		GameRegistry.registerItem(GIngot, GIngot.getUnlocalizedName());
		GameRegistry.registerItem(GPick, GPick.getUnlocalizedName());
		GameRegistry.registerItem(GAxe, GAxe.getUnlocalizedName());
		GameRegistry.registerItem(GSword, GSword.getUnlocalizedName());
		GameRegistry.registerItem(GShovel, GShovel.getUnlocalizedName());
		GameRegistry.registerItem(GHoe, GHoe.getUnlocalizedName());
		GameRegistry.registerItem(OPick, OPick.getUnlocalizedName());
		GameRegistry.registerItem(OAxe, OAxe.getUnlocalizedName());
		GameRegistry.registerItem(OSword, OSword.getUnlocalizedName());
		GameRegistry.registerItem(OShovel, OShovel.getUnlocalizedName());
		GameRegistry.registerItem(OHoe, OHoe.getUnlocalizedName());
		GameRegistry.registerItem(OStick, OStick.getUnlocalizedName());
		GameRegistry.registerItem(GStick, GStick.getUnlocalizedName());
		GameRegistry.registerItem(OHelmet, OHelmet.getUnlocalizedName());
		GameRegistry.registerItem(OChest, OChest.getUnlocalizedName());
		GameRegistry.registerItem(OPants, OPants.getUnlocalizedName());
		GameRegistry.registerItem(OBoots, OBoots.getUnlocalizedName());
		GameRegistry.registerItem(GHelmet, GHelmet.getUnlocalizedName());
		GameRegistry.registerItem(GChest, GChest.getUnlocalizedName());
		GameRegistry.registerItem(GPants, GPants.getUnlocalizedName());
		GameRegistry.registerItem(GBoots, GBoots.getUnlocalizedName());
		GameRegistry.registerItem(Ruby, Ruby.getUnlocalizedName());
		GameRegistry.registerItem(RPick, RPick.getUnlocalizedName());
		GameRegistry.registerItem(RAxe, RAxe.getUnlocalizedName());
		GameRegistry.registerItem(RSword, RSword.getUnlocalizedName());
		GameRegistry.registerItem(RShovel, RShovel.getUnlocalizedName());
		GameRegistry.registerItem(RHoe, RHoe.getUnlocalizedName());
		GameRegistry.registerItem(RStick, RStick.getUnlocalizedName());
		GameRegistry.registerItem(RHelmet, RHelmet.getUnlocalizedName());
		GameRegistry.registerItem(RChest, RChest.getUnlocalizedName());
		GameRegistry.registerItem(RPants, RPants.getUnlocalizedName());
		GameRegistry.registerItem(RBoots, RBoots.getUnlocalizedName());
		GameRegistry.registerItem(CoIngot, CoIngot.getUnlocalizedName());
		GameRegistry.registerItem(PIngot, PIngot.getUnlocalizedName());
		GameRegistry.registerItem(TIngot, TIngot.getUnlocalizedName());
		GameRegistry.registerItem(AIngot, AIngot.getUnlocalizedName());
		GameRegistry.registerItem(SiIngot, SiIngot.getUnlocalizedName());
		GameRegistry.registerItem(LIngot, LIngot.getUnlocalizedName());
		GameRegistry.registerItem(LPick, LPick.getUnlocalizedName());
		GameRegistry.registerItem(LAxe, LAxe.getUnlocalizedName());
		GameRegistry.registerItem(LSword, LSword.getUnlocalizedName());
		GameRegistry.registerItem(LShovel, LShovel.getUnlocalizedName());
		GameRegistry.registerItem(LHoe, LHoe.getUnlocalizedName());
		GameRegistry.registerItem(SPick, SPick.getUnlocalizedName());
		GameRegistry.registerItem(SAxe, SAxe.getUnlocalizedName());
		GameRegistry.registerItem(SSword, SSword.getUnlocalizedName());
		GameRegistry.registerItem(SShovel, SShovel.getUnlocalizedName());
		GameRegistry.registerItem(SHoe, SHoe.getUnlocalizedName());
		GameRegistry.registerItem(PPick, PPick.getUnlocalizedName());
		GameRegistry.registerItem(PAxe, PAxe.getUnlocalizedName());
		GameRegistry.registerItem(PSword, PSword.getUnlocalizedName());
		GameRegistry.registerItem(PShovel, PShovel.getUnlocalizedName());
		GameRegistry.registerItem(PHoe, PHoe.getUnlocalizedName());
		
	}
}
