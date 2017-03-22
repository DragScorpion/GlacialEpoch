package de.teamhug.GlacialEpoch.Container;

import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;

public class GE_SlotFuel extends Slot {

	public GE_SlotFuel(IInventory inventory, int slot, int x, int y) {
		super(inventory, slot, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack item) {
		return TileEntityFurnace.getItemBurnTime(item) > 0;
	}

}
