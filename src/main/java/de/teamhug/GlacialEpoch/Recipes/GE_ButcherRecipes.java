package de.teamhug.GlacialEpoch.Recipes;

import java.util.ArrayList;

import de.teamhug.GlacialEpoch.Registry.GE_ItemRegistry;
import de.teamhug.GlacialEpoch.Util.GE_ButcherRecipe;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import scala.tools.ant.sabbus.Use;

public class GE_ButcherRecipes {
	
	public static ArrayList<GE_ButcherRecipe> recipes = new ArrayList<GE_ButcherRecipe>();
	
	public static ArrayList<ItemStack> tools = new ArrayList<ItemStack>();
	public static ArrayList<ItemStack> water = new ArrayList<ItemStack>();
	
	public static void registerRecipes() {
		
		tools.add(new ItemStack(GE_ItemRegistry.itemHidesCutter));
		tools.add(new ItemStack(GE_ItemRegistry.itemCuttingKnife));
		water.add(new ItemStack(Items.water_bucket, 1, 1));
		
		addRecipe(new GE_ButcherRecipe()
				.setInput(new ItemStack(GE_ItemRegistry.itemCadaverCow))
				.setTools(tools)
				.addOutput(new ItemStack(GE_ItemRegistry.itemBovine_half, 2, 1))
				.addOutput(new ItemStack(GE_ItemRegistry.itemBovine_skin, 1, 1))
				.addOutput(new ItemStack(GE_ItemRegistry.itemCowHead, 1, 1))
				.addOutput(new ItemStack(Items.bucket, 1, 1))); 
	}
	
	public static void addRecipe(GE_ButcherRecipe recipe) {
		recipes.add(recipe);
	}
}
