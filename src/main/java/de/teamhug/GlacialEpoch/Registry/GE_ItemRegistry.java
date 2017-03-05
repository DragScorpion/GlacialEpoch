package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import de.teamhug.GlacialEpoch.Items.GE_Item;
import net.minecraft.item.Item;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_ItemRegistry
{
    //Cadaver
	public static Item itemCadaverCow;
	
	//CastingForms
	public static Item itemCastingFormArrowHead;
	public static Item itemCastingFormAxeHead;
	public static Item itemCastingFormBoard;
	public static Item itemCastingFormBroadaxeHead;
	public static Item itemCastingFormChiselHead;
	public static Item itemCastingFormCrossbar;
	public static Item itemCastingFormExcavator;
	public static Item itemCastingFormFullGuard;
	public static Item itemCastingFormHammerHead;
	public static Item itemCastingFormIngot;
	public static Item itemCastingFormKnifeBlade;
	public static Item itemCastingFormLargeBlade;
	public static Item itemCastingFormNugget;
	public static Item itemCastingFormPan;
	public static Item itemCastingFormPickaxeHead;
	public static Item itemCastingFormPlate;
	public static Item itemCastingFormRod;
	public static Item itemCastingFormScytheHead;
	public static Item itemCastingFormShovelHead;
	public static Item itemCastingFormSwordBlade;
	public static Item itemCastingFormToolBinding;
	public static Item itemCastingFormToughBinding;
	
	//Dummy
	public static Item itemDummyItem1;
    public static Item itemDummyItem2;
    
    public static void registerItems()
    {   
        //Cadaver
        itemCadaverCow = new GE_Item("GE_itemCadaverCow");
        itemCadaverCow.setMaxStackSize(64);
        GameRegistry.registerItem(itemCadaverCow, "GE_itemCadaverCow");
        
        //CastingForms
    	itemCastingFormArrowHead = new GE_Item("GE_itemCastingFormArrowHead");
        GameRegistry.registerItem(itemCastingFormArrowHead, "GE_itemCastingFormArrowHead");
        
        itemCastingFormAxeHead = new GE_Item("GE_itemCastingFormAxeHead");
        GameRegistry.registerItem(itemCastingFormAxeHead, "GE_itemCastingFormAxeHead");
        
        itemCastingFormBoard = new GE_Item("GE_itemCastingFormBoard");
        GameRegistry.registerItem(itemCastingFormBoard, "GE_itemCastingFormBoard");
        
        itemCastingFormBroadaxeHead = new GE_Item("GE_itemCastingFormBroadaxeHead");
        GameRegistry.registerItem(itemCastingFormBroadaxeHead, "GE_itemCastingFormBroadaxeHead");
        
        itemCastingFormChiselHead = new GE_Item("GE_itemCastingFormChiselHead");
        GameRegistry.registerItem(itemCastingFormChiselHead, "GE_itemCastingFormChiselHead");
        
        itemCastingFormCrossbar = new GE_Item("GE_itemCastingFormCrossbar");
        GameRegistry.registerItem(itemCastingFormCrossbar, "GE_itemCastingFormCrossbar");
        
        itemCastingFormExcavator = new GE_Item("GE_itemCastingFormExcavator");
        GameRegistry.registerItem(itemCastingFormExcavator, "GE_itemCastingFormExcavator");
        
        itemCastingFormFullGuard = new GE_Item("GE_itemCastingFormFullGuard");
        GameRegistry.registerItem(itemCastingFormFullGuard, "GE_itemCastingFormFullGuard");
        
        itemCastingFormHammerHead = new GE_Item("GE_itemCastingFormHammerHead");
        GameRegistry.registerItem(itemCastingFormHammerHead, "GE_itemCastingFormHammerHead");
        
        itemCastingFormIngot = new GE_Item("GE_itemCastingFormIngot");
        GameRegistry.registerItem(itemCastingFormIngot, "GE_itemCastingFormIngot");
        
        itemCastingFormKnifeBlade = new GE_Item("GE_itemCastingFormKnifeBlade");
        GameRegistry.registerItem(itemCastingFormKnifeBlade, "GE_itemCastingFormKnifeBlade");
        
        itemCastingFormLargeBlade = new GE_Item("GE_itemCastingFormLargeBlade");
        GameRegistry.registerItem(itemCastingFormLargeBlade, "GE_itemCastingFormLargeBlade");
        
        itemCastingFormNugget = new GE_Item("GE_itemCastingFormNugget");
        GameRegistry.registerItem(itemCastingFormNugget, "GE_itemCastingFormNugget");
        
        itemCastingFormPan = new GE_Item("GE_itemCastingFormPan");
        GameRegistry.registerItem(itemCastingFormPan, "GE_itemCastingFormPan");
        
        itemCastingFormPickaxeHead = new GE_Item("GE_itemCastingFormPickaxeHead");
        GameRegistry.registerItem(itemCastingFormPickaxeHead, "GE_itemCastingFormPickaxeHead");
        
        itemCastingFormPlate = new GE_Item("GE_itemCastingFormPlate");
        GameRegistry.registerItem(itemCastingFormPlate, "GE_itemCastingFormPlate");
        
        itemCastingFormRod = new GE_Item("GE_itemCastingFormRod");
        GameRegistry.registerItem(itemCastingFormRod, "GE_itemCastingFormRod");
        
        itemCastingFormScytheHead = new GE_Item("GE_itemCastingFormScytheHead");
        GameRegistry.registerItem(itemCastingFormScytheHead, "GE_itemCastingFormScytheHead");
        
        itemCastingFormShovelHead = new GE_Item("GE_itemCastingFormShovelHead");
        GameRegistry.registerItem(itemCastingFormShovelHead, "GE_itemCastingFormShovelHead");
        
        itemCastingFormSwordBlade = new GE_Item("GE_itemCastingFormSwordBlade");
        GameRegistry.registerItem(itemCastingFormSwordBlade, "GE_itemCastingFormSwordBlade");
        
        itemCastingFormToolBinding = new GE_Item("GE_itemCastingFormToolBinding");
        GameRegistry.registerItem(itemCastingFormToolBinding, "GE_itemCastingFormToolBinding");
        
        itemCastingFormToughBinding = new GE_Item("GE_itemCastingFormToughBinding");
        GameRegistry.registerItem(itemCastingFormToughBinding, "GE_itemCastingFormToughBinding");
        
        
    	//Dummy
        itemDummyItem1 = new GE_Item("GE_itemDummyItem1");
        GameRegistry.registerItem(itemDummyItem1, "GE_itemDummyItem1");

        itemDummyItem2 = new GE_Item("GE_itemDummyItem2");
        itemDummyItem2.setMaxStackSize(16);
        GameRegistry.registerItem(itemDummyItem2, "GE_itemDummyItem2");
        
    }
}
