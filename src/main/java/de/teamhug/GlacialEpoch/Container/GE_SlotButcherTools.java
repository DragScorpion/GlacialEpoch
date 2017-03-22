package de.teamhug.GlacialEpoch.Container;

import de.teamhug.GlacialEpoch.Registry.GE_ItemButcherMod;
import de.teamhug.GlacialEpoch.Registry.GE_ItemRegistry;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class GE_SlotButcherTools extends Slot {

	public GE_SlotButcherTools(IInventory inventory, int slot, int x, int y) {
		super(inventory, slot, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack item) {
		if (item.getItem().equals(GE_ItemButcherMod.itemHidesCutter))
			return true;
		if (item.getItem().equals(GE_ItemButcherMod.itemCuttingKnife))
			return true;
		if (item.getItem().equals(GE_ItemButcherMod.itemSlaughteringAx))
			return true;
		if (item.getItem().equals(GE_ItemButcherMod.itemButchersKnife))
			return true;
		if (item.getItem().equals(Items.water_bucket))
			return true;
		return false;
	}

}
