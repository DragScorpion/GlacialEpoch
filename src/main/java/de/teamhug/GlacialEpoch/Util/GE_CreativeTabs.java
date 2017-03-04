package de.teamhug.GlacialEpoch.Util;

import de.teamhug.GlacialEpoch.Registry.GE_Blocks;
import de.teamhug.GlacialEpoch.Registry.GE_Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * GlacialEpoch.git, Created by Henny on 04.03.2017.
 */
public class GE_CreativeTabs
{
    public static final CreativeTabs tabGEItems = new CreativeTabs("GE_tabItems")
    {
        @Override
        public Item getTabIconItem()
        {
            return GE_Items.itemDummyItem1;
        }
    };

    public static final CreativeTabs tabGEBlocks = new CreativeTabs("GE_tabBlocks")
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(GE_Blocks.blockDummyBlock);
        }
    };
}
