package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import de.teamhug.GlacialEpoch.Items.GE_Item;
import net.minecraft.item.Item;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_ItemRegistry
{
    public static Item itemDummyItem1;
    public static Item itemDummyItem2;
    public static Item itemKadaverCow;

    public static void registerItems()
    {   
        //Kadaver
        itemKadaverCow = new GE_Item("GE_itemKadaverCow");
        itemKadaverCow.setMaxStackSize(64);
        GameRegistry.registerItem(itemKadaverCow, "GE_itemKadaverCow");
        
    	//Dummy
        itemDummyItem1 = new GE_Item("GE_itemDummyItem1");
        GameRegistry.registerItem(itemDummyItem1, "GE_itemDummyItem1");

        itemDummyItem2 = new GE_Item("GE_itemDummyItem2");
        itemDummyItem2.setMaxStackSize(16);
        GameRegistry.registerItem(itemDummyItem2, "GE_itemDummyItem2");
        

    }
}
