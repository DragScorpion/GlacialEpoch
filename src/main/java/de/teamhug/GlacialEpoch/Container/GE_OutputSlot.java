package de.teamhug.GlacialEpoch.Container;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class GE_OutputSlot extends Slot {

	public GE_OutputSlot(IInventory inventory, int slot, int x, int y) {
		super(inventory, slot, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack item) {
		return false;
	}

}
