package de.teamhug.GlacialEpoch.Items;

import de.teamhug.GlacialEpoch.GE_Main;
import de.teamhug.GlacialEpoch.Util.GE_CreativeTabs;
import net.minecraft.item.Item;

public class GE_Item_PistonHead extends Item {
	
	protected GE_Item_PistonHead(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(GE_Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(GE_CreativeTabs.tabGEItems);
		this.setMaxStackSize(64);
		
	}
	
}
