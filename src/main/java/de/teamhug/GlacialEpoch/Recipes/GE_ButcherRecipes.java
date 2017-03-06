package de.teamhug.GlacialEpoch.Recipes;

import java.util.ArrayList;

import de.teamhug.GlacialEpoch.Registry.GE_ItemRegistry;
import de.teamhug.GlacialEpoch.Util.GE_ButcherRecipe;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GE_ButcherRecipes {
	
	public static ArrayList<GE_ButcherRecipe> recipes = new ArrayList<GE_ButcherRecipe>();
	
	public static ArrayList<ItemStack> tools = new ArrayList<ItemStack>();
	
	public static void registerRecipes() {
		
		tools.add(new ItemStack(GE_ItemRegistry.itemHidesCutter));
		tools.add(new ItemStack(GE_ItemRegistry.itemCuttingKnife));
		
		addRecipe(new GE_ButcherRecipe()
				.setInput(new ItemStack(GE_ItemRegistry.itemCadaverCow))
				.setTools(tools)
				.addOutput(new ItemStack(Items.leather, 1, 1))
				.addOutput(new ItemStack(Items.beef, 6, 1)));
	}
	
	public static void addRecipe(GE_ButcherRecipe recipe) {
		recipes.add(recipe);
	}
}
