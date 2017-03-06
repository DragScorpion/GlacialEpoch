package de.teamhug.GlacialEpoch.Util;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;

public class GE_ButcherRecipe {
	
	private ItemStack inputItem;
	private ArrayList<ItemStack> toolItems = new ArrayList<ItemStack>();
	private ArrayList<ItemStack> outputItems = new ArrayList<ItemStack>();
	
	
	public GE_ButcherRecipe() {
	}
	public GE_ButcherRecipe(ItemStack input) {
		this.inputItem = input;
	}
	public GE_ButcherRecipe(ItemStack input, ItemStack tool) {
		this.inputItem = input;
		this.toolItems.add(tool);
	}
	public GE_ButcherRecipe(ItemStack input, ArrayList<ItemStack> outputs) {
		this.inputItem = input;
		this.outputItems = outputs;
	}
	public GE_ButcherRecipe(ItemStack input, ItemStack tool, ItemStack output) {
		this.inputItem = input;
		this.toolItems.add(tool);
		this.outputItems.add(output);
	}
	public GE_ButcherRecipe(ItemStack input, ArrayList<ItemStack> tools, ArrayList<ItemStack> outputs) {
		this.inputItem = input;
		this.toolItems = tools;
		this.outputItems = outputs;
	}
	
	public GE_ButcherRecipe addTool(ItemStack tool) {
		this.toolItems.add(tool);
		return this;
	}
	
	public GE_ButcherRecipe addOutput(ItemStack output) {
		this.outputItems.add(output);
		return this;
	}
	
	public GE_ButcherRecipe setInput(ItemStack input) {
		this.inputItem = input;
		return this;
	}
	public GE_ButcherRecipe setTools(ArrayList<ItemStack> tools) {
		this.toolItems = tools;
		return this;
	}
	
	public GE_ButcherRecipe setOutputs(ArrayList<ItemStack> outputs) {
		this.outputItems = outputs;
		return this;
	}
	
	public ItemStack getInputItem() {
		return this.inputItem;
	}
	
	public ArrayList<ItemStack> getToolItems() {
		return this.toolItems;
	}
	
	public ArrayList<ItemStack> getOutputItems() {
		return this.outputItems;
	}
	
	public boolean hasToolItem(ItemStack tool) {
		return toolItems.indexOf(tool) == -1 ? false : true;
	}
	
	public boolean hasOutputItem(ItemStack output) {
		return outputItems.indexOf(output) == -1 ? false : true;
	}
}
