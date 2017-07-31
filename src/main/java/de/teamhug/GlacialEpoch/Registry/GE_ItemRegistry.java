package de.teamhug.GlacialEpoch.Registry;

import de.henny022.HennyLib.api.HennyLibRegistry;
import de.teamhug.GlacialEpoch.Items.GE_ItemStrawBed;
import de.teamhug.GlacialEpoch.Items.Tools.GE_PrimitiveTool;
import net.minecraft.item.Item;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_ItemRegistry
{
	//Tools
    @HennyLibRegistry.Item(itemClass = GE_PrimitiveTool.class)
	public static Item itemPrimitiveTool;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemPrimitiveHammerHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemPrimitiveHammer;

    @HennyLibRegistry.Item
	public static Item itemPistonHead;

	//material
    @HennyLibRegistry.Item
	public static Item itemFlintPlate;

	
	//BurnedForms
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormArrowHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormAxeHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormBoard;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormBroadaxeHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormChiselHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormCrossbar;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormExcavatorHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormFullGuard;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormHammerHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormIngot;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormKnifeBlade;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormLargeBlade;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormNugget;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormPan;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormPickaxeHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormPlate;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormRod;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormScytheHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormShovelHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormSwordBlade;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormToolBinding;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormToughBinding;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormWideGuard;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormHandGuard;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormToughRod;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormGem;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemBurnedFormCasing;
	
	
	//Forms
    @HennyLibRegistry.Item
	public static Item itemFormableClay;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormArrowHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormAxeHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormBoard;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormBroadaxeHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormChiselHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormCrossbar;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormExcavator;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormFullGuard;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormHammerHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormIngot;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormKnifeBlade;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormLargeBlade;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormNugget;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormPan;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormPickaxeHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormPlate;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormRod;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormScytheHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormShovelHead;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormSwordBlade;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormToolBinding;
    @HennyLibRegistry.Item(stacksize = 1)
	public static Item itemFormToughBinding;

	@HennyLibRegistry.Item(creativeTab = "tabGEBlocks", itemClass = GE_ItemStrawBed.class)
	public static Item itemStrawBed;
	
	//Dummy
    @HennyLibRegistry.Item
	public static Item itemDummyItem1;
    @HennyLibRegistry.Item(stacksize = 16)
	@HennyLibRegistry.Fuel(burnTime = 1600)
    public static Item itemDummyItem2;
}
