package de.teamhug.GlacialEpoch.Container;

import java.util.Iterator;

import de.teamhug.GlacialEpoch.Recipes.GE_ButcherRecipes;
import de.teamhug.GlacialEpoch.Registry.GE_ItemButcherMod;
import de.teamhug.GlacialEpoch.Registry.GE_ItemRegistry;
import de.teamhug.GlacialEpoch.Util.GE_ButcherRecipe;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class GE_SlotButcherTools extends Slot {

	public GE_SlotButcherTools(IInventory inventory, int slot, int x, int y) {
		super(inventory, slot, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack itemStack) {
		java.util.Iterator<GE_ButcherRecipe> iteratorRecipe = GE_ButcherRecipes.recipes.iterator();
		while (iteratorRecipe.hasNext()) {
			GE_ButcherRecipe tempRecipe = iteratorRecipe.next();
			Iterator<ItemStack> iteratorTool = tempRecipe.getToolItems().iterator();
			while (iteratorTool.hasNext()) {
				ItemStack tool = iteratorTool.next();
				if (tool.getItem().equals(itemStack.getItem())) {
					return true;
				}
			}
		}
		return false;
	}

}
