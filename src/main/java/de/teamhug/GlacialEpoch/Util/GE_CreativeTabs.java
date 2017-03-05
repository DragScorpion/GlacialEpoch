package de.teamhug.GlacialEpoch.Util;

import de.teamhug.GlacialEpoch.Registry.GE_BlockRegistry;
import de.teamhug.GlacialEpoch.Registry.GE_ItemRegistry;
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
            return GE_ItemRegistry.itemDummyItem1;
        }
    };

    public static final CreativeTabs tabGEBlocks = new CreativeTabs("GE_tabBlocks")
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(GE_BlockRegistry.blockDummyBlock);
        }
    };
}
