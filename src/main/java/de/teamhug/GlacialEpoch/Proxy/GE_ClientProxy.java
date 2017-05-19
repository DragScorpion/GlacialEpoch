package de.teamhug.GlacialEpoch.Proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.teamhug.GlacialEpoch.Registry.GE_RenderRegistry;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_ClientProxy extends GE_CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
    	GE_RenderRegistry.registerRenderer();
        super.preInit(event);
    }

    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
}
