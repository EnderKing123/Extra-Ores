package com.EnderKing.Items;

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
	
	public static ToolMaterial OTool = EnumHelper.addToolMaterial("Obsidian Tool", 2, 1000, 7.0f, 3.0f, 10);
	public static ToolMaterial RTool = EnumHelper.addToolMaterial("Ruby Tool", 3, 2000, 9.0f, 4.0f, 10);
	public static ToolMaterial GTool = EnumHelper.addToolMaterial("Greentanium Tool", 4, 5000, 12.0f, 4.5f, 10);
	public static ArmorMaterial OArmor = EnumHelper.addArmorMaterial("Obsidian Armor", 20, new int []{4, 8, 4, 4}, 10);
	public static ArmorMaterial GArmor = EnumHelper.addArmorMaterial("Greentanium Armor", 40, new int []{4, 8, 4, 4}, 10);
	public static ArmorMaterial RArmor = EnumHelper.addArmorMaterial("Ruby Armor", 30, new int []{4, 8, 4, 4}, 10);

	
	
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
	
	public static void initialiseItem(){
		//Items
		OIngot = new Item().setUnlocalizedName("OIngot").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":OIngot");
		GIngot = new Item().setUnlocalizedName("GIngot").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":GIngot");
		OStick = new Item().setUnlocalizedName("OStick").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":OStick");
		GStick = new Item().setUnlocalizedName("GStick").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":GStick");
		Ruby = new Item().setUnlocalizedName("Ruby").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":Ruby");
		RStick = new Item().setUnlocalizedName("RStick").setCreativeTab(MCreativeTabs.TabItems).setTextureName(RefStrings.MODID + ":RStick");
		//Tools		
		OPick = new OPick(OTool).setUnlocalizedName("OPick").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":OPick");
		OAxe = new OAxe(OTool).setUnlocalizedName("OAxe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":OAxe");
		OSword = new OSword(OTool).setUnlocalizedName("OSword").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":OSword");
		OShovel = new OShovel(OTool).setUnlocalizedName("OShovel").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":OShovel");
		OHoe = new OHoe(OTool).setUnlocalizedName("OHoe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":OHoe");
		GPick = new GPick(GTool).setUnlocalizedName("GPick").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":GPick");
		GAxe = new GAxe(GTool).setUnlocalizedName("GAxe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":GAxe");
		GSword = new GSword(GTool).setUnlocalizedName("GSword").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":GSword");
		GShovel = new GShovel(GTool).setUnlocalizedName("GShovel").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":GShovel");
		GHoe = new GHoe(GTool).setUnlocalizedName("GHoe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":GHoe");
		RPick = new RPick(RTool).setUnlocalizedName("RPick").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":RPick");
		RAxe = new RAxe(RTool).setUnlocalizedName("RAxe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":RAxe");
		RSword = new RSword(RTool).setUnlocalizedName("RSword").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":RSword");
		RShovel = new RShovel(RTool).setUnlocalizedName("RShovel").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":RShovel");
		RHoe = new RHoe(RTool).setUnlocalizedName("RHoe").setCreativeTab(MCreativeTabs.TabTools).setTextureName(RefStrings.MODID + ":RHoe");
		//Armor
		OHelmet = new OArmor(OArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("OArmor"), 0).setUnlocalizedName("OHelmet").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":OHelmet");
		OChest = new OArmor(OArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("OArmor"), 1).setUnlocalizedName("OChest").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":OChest");
		OPants = new OArmor(OArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("OArmor"), 2).setUnlocalizedName("OPants").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":OPants");
		OBoots = new OArmor(OArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("OArmor"), 3).setUnlocalizedName("OBoots").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":OBoots");
		GHelmet = new GArmor(GArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("GArmor"), 0).setUnlocalizedName("GHelmet").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":GHelmet");
		GChest = new GArmor(GArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("GArmor"), 1).setUnlocalizedName("GChest").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":GChest");
		GPants = new GArmor(GArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("GArmor"), 2).setUnlocalizedName("GPants").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":GPants");
		GBoots = new GArmor(GArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("GArmor"), 3).setUnlocalizedName("GBoots").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":GBoots");
		RHelmet = new RArmor(RArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("RArmor"), 0).setUnlocalizedName("RHelmet").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":RHelmet");
		RChest = new RArmor(RArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("RArmor"), 1).setUnlocalizedName("RChest").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":RChest");
		RPants = new RArmor(RArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("RArmor"), 2).setUnlocalizedName("RPants").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":RPants");
		RBoots = new RArmor(RArmor, com.EnderKing.main.MainRegistry.proxy.addArmor("RArmor"), 3).setUnlocalizedName("RBoots").setCreativeTab(MCreativeTabs.TabArmor).setTextureName(RefStrings.MODID + ":RBoots");

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

	}
}
