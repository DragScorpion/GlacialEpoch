package de.teamhug.GlacialEpoch.Proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.teamhug.GlacialEpoch.Registry.GE_Blocks_Registry;
import de.teamhug.GlacialEpoch.Registry.GE_Items_Registry;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        GE_Items_Registry.registerItems();
        GE_Blocks_Registry.registerBlocks();
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
