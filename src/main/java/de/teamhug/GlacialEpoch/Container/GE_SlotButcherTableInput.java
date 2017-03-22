package de.teamhug.GlacialEpoch.Container;

import de.teamhug.GlacialEpoch.Recipes.GE_ButcherRecipes;
import de.teamhug.GlacialEpoch.Registry.GE_ItemButcherMod;
import de.teamhug.GlacialEpoch.Registry.GE_ItemRegistry;
import de.teamhug.GlacialEpoch.Util.GE_ButcherRecipe;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class GE_SlotButcherTableInput extends Slot {

	public GE_SlotButcherTableInput(IInventory inventory, int slot, int x, int y) {
		super(inventory, slot, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack itemStack) {
		java.util.Iterator<GE_ButcherRecipe> iterator = GE_ButcherRecipes.recipes.iterator();
		while (iterator.hasNext()) {
			GE_ButcherRecipe tempRecipe = iterator.next();
			if (tempRecipe.getInputItem().getItem().equals(itemStack.getItem())) {
				return true;
			}
		}
		return false;
	}

}
