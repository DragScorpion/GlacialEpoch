package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import de.teamhug.GlacialEpoch.Items.GE_Item;
import de.teamhug.GlacialEpoch.Util.GE_CreativeTabs;
import net.minecraft.item.Item;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_ItemRegistry
{
	//Tools
	public static Item itemPrimitiveTool;

	
	//BurnedForms
	public static Item itemBurnedFormArrowHead;
	public static Item itemBurnedFormAxeHead;
	public static Item itemBurnedFormBoard;
	public static Item itemBurnedFormBroadaxeHead;
	public static Item itemBurnedFormChiselHead;
	public static Item itemBurnedFormCrossbar;
	public static Item itemBurnedFormExcavatorHead;
	public static Item itemBurnedFormFullGuard;
	public static Item itemBurnedFormHammerHead;
	public static Item itemBurnedFormIngot;
	public static Item itemBurnedFormKnifeBlade;
	public static Item itemBurnedFormLargeBlade;
	public static Item itemBurnedFormNugget;
	public static Item itemBurnedFormPan;
	public static Item itemBurnedFormPickaxeHead;
	public static Item itemBurnedFormPlate;
	public static Item itemBurnedFormRod;
	public static Item itemBurnedFormScytheHead;
	public static Item itemBurnedFormShovelHead;
	public static Item itemBurnedFormSwordBlade;
	public static Item itemBurnedFormToolBinding;
	public static Item itemBurnedFormToughBinding;	
	public static Item itemBurnedFormWideGuard;
	public static Item itemBurnedFormHandGuard;
	public static Item itemBurnedFormToughRod;
	public static Item itemBurnedFormGem;
	public static Item itemBurnedFormCasing;
	
	
	//Forms
	public static Item itemFormableClay;
	public static Item itemFormArrowHead;
	public static Item itemFormAxeHead;
	public static Item itemFormBoard;
	public static Item itemFormBroadaxeHead;
	public static Item itemFormChiselHead;
	public static Item itemFormCrossbar;
	public static Item itemFormExcavator;
	public static Item itemFormFullGuard;
	public static Item itemFormHammerHead;
	public static Item itemFormIngot;
	public static Item itemFormKnifeBlade;
	public static Item itemFormLargeBlade;
	public static Item itemFormNugget;
	public static Item itemFormPan;
	public static Item itemFormPickaxeHead;
	public static Item itemFormPlate;
	public static Item itemFormRod;
	public static Item itemFormScytheHead;
	public static Item itemFormShovelHead;
	public static Item itemFormSwordBlade;
	public static Item itemFormToolBinding;
	public static Item itemFormToughBinding;
	
	
	//Dummy
	public static Item itemDummyItem1;
    public static Item itemDummyItem2;
    
    public static void registerItems()
    {   
        
        //Tools
        
        itemPrimitiveTool = new GE_Item("GE_itemPrimitiveTool");
        itemPrimitiveTool.setMaxStackSize(1);
        GameRegistry.registerItem(itemPrimitiveTool, "GE_itemPrimitiveTool");

        
        //BurnedForms
    	itemBurnedFormArrowHead = new GE_Item("GE_itemBurnedFormArrowHead");
    	itemBurnedFormArrowHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormArrowHead, "GE_itemBurnedFormArrowHead");
        
        itemBurnedFormAxeHead = new GE_Item("GE_itemBurnedFormAxeHead");
        itemBurnedFormAxeHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormAxeHead, "GE_itemBurnedFormAxeHead");
        
        itemBurnedFormBoard = new GE_Item("GE_itemBurnedFormBoard");
        itemBurnedFormBoard.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormBoard, "GE_itemBurnedFormBoard");
        
        itemBurnedFormBroadaxeHead = new GE_Item("GE_itemBurnedFormBroadaxeHead");
        itemBurnedFormBroadaxeHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormBroadaxeHead, "GE_itemBurnedFormBroadaxeHead");
        
        itemBurnedFormChiselHead = new GE_Item("GE_itemBurnedFormChiselHead");
        itemBurnedFormChiselHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormChiselHead, "GE_itemBurnedFormChiselHead");
        
        itemBurnedFormCrossbar = new GE_Item("GE_itemBurnedFormCrossbar");
        itemBurnedFormCrossbar.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormCrossbar, "GE_itemBurnedFormCrossbar");
        
        itemBurnedFormExcavatorHead = new GE_Item("GE_itemBurnedFormExcavatorHead");
        itemBurnedFormExcavatorHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormExcavatorHead, "GE_itemBurnedFormExcavatorHead");
        
        itemBurnedFormFullGuard = new GE_Item("GE_itemBurnedFormFullGuard");
        itemBurnedFormFullGuard.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormFullGuard, "GE_itemBurnedFormFullGuard");
        
        itemBurnedFormHammerHead = new GE_Item("GE_itemBurnedFormHammerHead");
        itemBurnedFormHammerHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormHammerHead, "GE_itemBurnedFormHammerHead");
        
        itemBurnedFormIngot = new GE_Item("GE_itemBurnedFormIngot");
        itemBurnedFormIngot.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormIngot, "GE_itemBurnedFormIngot");
        
        itemBurnedFormKnifeBlade = new GE_Item("GE_itemBurnedFormKnifeBlade");
        itemBurnedFormKnifeBlade.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormKnifeBlade, "GE_itemBurnedFormKnifeBlade");
        
        itemBurnedFormLargeBlade = new GE_Item("GE_itemBurnedFormLargeBlade");
        itemBurnedFormLargeBlade.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormLargeBlade, "GE_itemBurnedFormLargeBlade");
        
        itemBurnedFormNugget = new GE_Item("GE_itemBurnedFormNugget");
        itemBurnedFormNugget.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormNugget, "GE_itemBurnedFormNugget");
        
        itemBurnedFormPan = new GE_Item("GE_itemBurnedFormPan");
        itemBurnedFormPan.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormPan, "GE_itemBurnedFormPan");
        
        itemBurnedFormPickaxeHead = new GE_Item("GE_itemBurnedFormPickaxeHead");
        itemBurnedFormPickaxeHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormPickaxeHead, "GE_itemBurnedFormPickaxeHead");
        
        itemBurnedFormPlate = new GE_Item("GE_itemBurnedFormPlate");
        itemBurnedFormPlate.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormPlate, "GE_itemBurnedFormPlate");
        
        itemBurnedFormRod = new GE_Item("GE_itemBurnedFormRod");
        itemBurnedFormRod.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormRod, "GE_itemBurnedFormRod");
        
        itemBurnedFormScytheHead = new GE_Item("GE_itemBurnedFormScytheHead");
        itemBurnedFormScytheHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormScytheHead, "GE_itemBurnedFormScytheHead");
        
        itemBurnedFormShovelHead = new GE_Item("GE_itemBurnedFormShovelHead");
        itemBurnedFormShovelHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormShovelHead, "GE_itemBurnedFormShovelHead");
        
        itemBurnedFormSwordBlade = new GE_Item("GE_itemBurnedFormSwordBlade");
        itemBurnedFormSwordBlade.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormSwordBlade, "GE_itemBurnedFormSwordBlade");
        
        itemBurnedFormToolBinding = new GE_Item("GE_itemBurnedFormToolBinding");
        itemBurnedFormToolBinding.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormToolBinding, "GE_itemBurnedFormToolBinding");
        
        itemBurnedFormToughBinding = new GE_Item("GE_itemBurnedFormToughBinding");
        itemBurnedFormToughBinding.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormToughBinding, "GE_itemBurnedFormToughBinding");
        
        itemBurnedFormWideGuard = new GE_Item("GE_itemBurnedFormWideGuard");
		itemBurnedFormWideGuard.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormWideGuard, "GE_itemBurnedFormWideGuard");
        
        itemBurnedFormHandGuard = new GE_Item("GE_itemBurnedFormHandGuard");
		itemBurnedFormHandGuard.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormHandGuard, "GE_itemBurnedFormHandGuard");
        
        itemBurnedFormToughRod = new GE_Item("GE_itemBurnedFormToughRod");
		itemBurnedFormToughRod.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormToughRod, "GE_itemBurnedFormToughRod");
        
        itemBurnedFormGem = new GE_Item("GE_itemBurnedFormGem");
		itemBurnedFormGem.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormGem, "GE_itemBurnedFormGem");
        
        itemBurnedFormCasing = new GE_Item("GE_itemCastingFormCasing");
		itemBurnedFormCasing.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormCasing, "GE_itemCastingFormCasing");

        
        //Forms
    	itemFormableClay = new GE_Item("GE_itemFormableClay");
        GameRegistry.registerItem(itemFormableClay, "GE_itemFormableClay");
        
    	itemFormArrowHead = new GE_Item("GE_itemFormArrowHead");
    	itemFormArrowHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormArrowHead, "GE_itemFormArrowHead");
        
        itemFormAxeHead = new GE_Item("GE_itemFormAxeHead");
        itemFormAxeHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormAxeHead, "GE_itemFormAxeHead");
        
        itemFormBoard = new GE_Item("GE_itemFormBoard");
        itemFormBoard.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormBoard, "GE_itemFormBoard");
        
        itemFormBroadaxeHead = new GE_Item("GE_itemFormBroadaxeHead");
        itemFormBroadaxeHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormBroadaxeHead, "GE_itemFormBroadaxeHead");
        
        itemFormChiselHead = new GE_Item("GE_itemFormChiselHead");
        itemFormChiselHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormChiselHead, "GE_itemFormChiselHead");
        
        itemFormCrossbar = new GE_Item("GE_itemFormCrossbar");
        itemFormCrossbar.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormCrossbar, "GE_itemFormCrossbar");
        
        itemFormExcavator = new GE_Item("GE_itemFormExcavator");
        itemFormExcavator.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormExcavator, "GE_itemFormExcavator");
        
        itemFormFullGuard = new GE_Item("GE_itemFormFullGuard");
        itemFormFullGuard.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormFullGuard, "GE_itemFormFullGuard");
        
        itemFormHammerHead = new GE_Item("GE_itemFormHammerHead");
        itemFormHammerHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormHammerHead, "GE_itemFormHammerHead");
        
        itemFormIngot = new GE_Item("GE_itemFormIngot");
        itemFormIngot.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormIngot, "GE_itemFormIngot");
        
        itemFormKnifeBlade = new GE_Item("GE_itemFormKnifeBlade");
        itemFormKnifeBlade.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormKnifeBlade, "GE_itemFormKnifeBlade");
        
        itemFormLargeBlade = new GE_Item("GE_itemFormLargeBlade");
        itemFormLargeBlade.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormLargeBlade, "GE_itemFormLargeBlade");
        
        itemFormNugget = new GE_Item("GE_itemFormNugget");
        itemFormNugget.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormNugget, "GE_itemFormNugget");
        
        itemFormPan = new GE_Item("GE_itemFormPan");
        itemFormPan.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormPan, "GE_itemFormPan");
        
        itemFormPickaxeHead = new GE_Item("GE_itemFormPickaxeHead");
        itemFormPickaxeHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormPickaxeHead, "GE_itemFormPickaxeHead");
        
        itemFormPlate = new GE_Item("GE_itemFormPlate");
        itemFormPlate.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormPlate, "GE_itemFormPlate");
        
        itemFormRod = new GE_Item("GE_itemFormRod");
        itemFormRod.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormRod, "GE_itemFormRod");
        
        itemFormScytheHead = new GE_Item("GE_itemFormScytheHead");
        itemFormScytheHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormScytheHead, "GE_itemFormScytheHead");
        
        itemFormShovelHead = new GE_Item("GE_itemFormShovelHead");
        itemFormShovelHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormShovelHead, "GE_itemFormShovelHead");
        
        itemFormSwordBlade = new GE_Item("GE_itemFormSwordBlade");
        itemFormSwordBlade.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormSwordBlade, "GE_itemFormSwordBlade");
        
        itemFormToolBinding = new GE_Item("GE_itemFormToolBinding");
        itemFormToolBinding.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormToolBinding, "GE_itemFormToolBinding");
        
        itemFormToughBinding = new GE_Item("GE_itemFormToughBinding");
        itemFormToughBinding.setMaxStackSize(1);
        GameRegistry.registerItem(itemFormToughBinding, "GE_itemFormToughBinding");
        
        
    	//Dummy
        itemDummyItem1 = new GE_Item("GE_itemDummyItem1");
        GameRegistry.registerItem(itemDummyItem1, "GE_itemDummyItem1");

        itemDummyItem2 = new GE_Item("GE_itemDummyItem2");
        itemDummyItem2.setMaxStackSize(16);
        GameRegistry.registerItem(itemDummyItem2, "GE_itemDummyItem2");
        
    }
}
