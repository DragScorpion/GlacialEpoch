package de.teamhug.GlacialEpoch.Proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.teamhug.GlacialEpoch.Registry.GE_BlockRegistry;
import de.teamhug.GlacialEpoch.Registry.GE_FuelRegistry;
import de.teamhug.GlacialEpoch.Registry.GE_ItemRegistry;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        GE_ItemRegistry.registerItems();
        GE_BlockRegistry.registerBlocks();
        GE_FuelRegistry.registerFuels();
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
