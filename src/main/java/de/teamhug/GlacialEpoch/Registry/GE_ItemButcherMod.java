package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import de.teamhug.GlacialEpoch.Items.GE_Item;
import de.teamhug.GlacialEpoch.Util.GE_CreativeTabs;
import net.minecraft.item.Item;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_ItemButcherMod {

	//Butcher
		//Cow
	
		public static Item itemCadaverCow;		//Kuhkörper
		public static Item itemBovine_half; 	//Rinderhälfte
		public static Item itemBovine_skin; 	//Rinderhaut
		public static Item itemCowHead; 		//Kuhkopf
		
		//Sheep
		
		public static Item itemCadaverSheep;    //SchafKörper
		public static Item itemSheepSkin;     	//Schafhaut
		public static Item itemSheepHead;		//Schafkopf
		public static Item itemSheepHalf;		//Schafhälfte
		
		//Pig
		
		public static Item itemCadaverPig;
		public static Item itemPigSkin;
		public static Item itemPigHead;
		public static Item itemPigHalf;
		
		//Chicken
		
		public static Item itemCadaverCkicken;
		public static Item itemCkickenHead;

		//ButcherTools
		
		public static Item itemHidesCutter;		//Häutemesser
		public static Item itemCuttingKnife;	//Stechmesser
		public static Item itemSlaughteringAx; 	//Schlachterbeil
		public static Item itemButchersKnife;	//Schlachtermesser
		
		public static void registerItem()
		{
			//Cow
			
	        itemCadaverCow = new GE_Item("GE_itemCadaverCow");
	        itemCadaverCow.setMaxStackSize(64);
	        itemCadaverCow.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemCadaverCow, "GE_itemCadaverCow");
	        
	        itemBovine_half = new GE_Item("GE_itemBovine_half");
	        itemBovine_half.setMaxStackSize(64);
	        itemBovine_half.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemBovine_half, "itemBovine_half");
	        
	        itemBovine_skin = new GE_Item("GE_itemBovine_skin");
	        itemBovine_skin.setMaxStackSize(64);
	        itemBovine_skin.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemBovine_skin, "itemBovine_skin");
	        
	        itemCowHead = new GE_Item("GE_itemCowHead");
	        itemCowHead.setMaxStackSize(64);
	        itemCowHead.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemCowHead, "itemCowHead");
	        
	        //Sheep
	        
	        itemCadaverSheep = new GE_Item("GE_itemCadaverSheep");
	        itemCadaverSheep.setMaxStackSize(64);
	        itemCadaverSheep.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemCadaverSheep, "GE_itemCadaverSheep");
	        
	        itemSheepHead = new GE_Item("GE_itemSheepHead");
	        itemSheepHead.setMaxStackSize(64);
	        itemSheepHead.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemSheepHead, "GE_itemSheepHead");
	        
	        itemSheepHalf = new GE_Item("GE_itemSheepHalf");
	        itemSheepHalf.setMaxStackSize(64);
	        itemSheepHalf.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemSheepHalf, "GE_itemSheepHalf");
	        
	        itemSheepSkin = new GE_Item("GE_itemSheepSkin");
	        itemSheepSkin.setMaxStackSize(64);
	        itemSheepSkin.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemSheepSkin, "GE_itemSheepSkin");
	        
	        //Pig
	        
	        itemCadaverPig = new GE_Item("GE_itemCadaverPig");
	        itemCadaverPig.setMaxStackSize(64);
	        itemCadaverPig.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemCadaverPig, "GE_itemCadaverPig");
	        
	        itemPigSkin = new GE_Item("GE_itemPigSkin");
	        itemPigSkin.setMaxStackSize(64);
	        itemPigSkin.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemPigSkin, "GE_itemPigSkin");
	        
	        itemPigHead = new GE_Item("GE_itemPigHead");
	        itemPigHead.setMaxStackSize(64);
	        itemPigHead.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemPigHead, "GE_itemPigHead");
	        
	        itemPigHalf = new GE_Item("GE_itemPigHalf");
	        itemPigHalf.setMaxStackSize(64);
	        itemPigHalf.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemPigHalf, "GE_itemPigHalf");
	        
	        //Chicken
	        
	        itemCadaverCkicken = new GE_Item("GE_itemCadaverCkicken");
	        itemCadaverCkicken.setMaxStackSize(64);
	        itemCadaverCkicken.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemCadaverCkicken, "GE_itemCadaverCkicken");
	        
	        itemCkickenHead = new GE_Item("GE_itemCkickenHead");
	        itemCkickenHead.setMaxStackSize(64);
	        itemCkickenHead.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemCkickenHead, "GE_itemCkickenHead");
	        
	        
	        //ButcherTools
	        
	        itemHidesCutter = new GE_Item("GE_itemHidesCutter");
	        itemHidesCutter.setMaxStackSize(1);
	        itemHidesCutter.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemHidesCutter, "GE_itemHidesCutter");
	        
	        itemCuttingKnife = new GE_Item("GE_itemCuttingKnife");
	        itemCuttingKnife.setMaxStackSize(1);
	        itemCuttingKnife.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemCuttingKnife, "GE_itemCuttingKnife");
	        
	        itemSlaughteringAx = new GE_Item("GE_itemSlaughteringAx");
	        itemSlaughteringAx.setMaxStackSize(1);
	        itemSlaughteringAx.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemSlaughteringAx, "GE_itemSlaughteringAx");
	        
	        itemButchersKnife = new GE_Item("GE_itemButchersKnife");
	        itemButchersKnife.setMaxStackSize(1);
	        itemButchersKnife.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemButchersKnife, "GE_itemButchersKnife");
		}
}
