package de.teamhug.GlacialEpoch.Proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.teamhug.GlacialEpoch.GE_Main;

/**
 * GlacialEpoch.git, Created by Henny on 04.03.2017.
 */
public class GE_ServerProxy extends GE_CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        GE_Main.registerer.preInitServer();
    }

    public void init(FMLInitializationEvent event)
    {
        super.init(event);
        GE_Main.registerer.initServer();
    }

    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
        GE_Main.registerer.postInitServer();
    }
}
