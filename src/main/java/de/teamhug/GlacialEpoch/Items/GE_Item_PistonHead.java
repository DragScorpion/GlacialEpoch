package de.TeamHUG.GlacialEpoch.Items;

import de.TeamHUG.GlacialEpoch.Main;
import de.TeamHUG.GlacialEpoch.Utilities.MainUtilities;
import net.minecraft.item.Item;

public class GE_Item_PistonHead extends Item {
	
	protected GE_Item_PistonHead(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(MainUtilities.tabGlacialEpoch);
		this.setMaxStackSize(64);
		
	}
	
}
