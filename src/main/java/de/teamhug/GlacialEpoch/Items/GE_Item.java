package de.teamhug.GlacialEpoch.Items;

import de.teamhug.GlacialEpoch.GE_Main;
import de.teamhug.GlacialEpoch.Util.GE_CreativeTabs;
import net.minecraft.item.Item;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_Item extends Item
{
    public GE_Item(String unlocalizedName)
    {
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(GE_Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(GE_CreativeTabs.tabGEItems);
        this.setMaxStackSize(64);
    }
}
