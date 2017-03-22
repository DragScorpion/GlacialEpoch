package de.teamhug.GlacialEpoch.Container;

import de.teamhug.GlacialEpoch.Registry.GE_ItemButcherMod;
import de.teamhug.GlacialEpoch.Registry.GE_ItemRegistry;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class GE_SlotButcherTableInput extends Slot {

	public GE_SlotButcherTableInput(IInventory inventory, int slot, int x, int y) {
		super(inventory, slot, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack item) {
		if (item.getItem().equals(GE_ItemButcherMod.itemCadaverCow))
			return true;
		if (item.getItem().equals(GE_ItemButcherMod.itemBovine_half))
			return true;
		return false;
	}

}
