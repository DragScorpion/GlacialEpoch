package de.teamhug.GlacialEpoch.Proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.teamhug.GlacialEpoch.Registry.GE_Blocks;
import de.teamhug.GlacialEpoch.Registry.GE_Items;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        GE_Items.registerItems();
        GE_Blocks.registerBlocks();
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
