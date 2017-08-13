package de.teamhug.GlacialEpoch.Proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.henny022.HennyLib.api.HennyLibRegistry;
import de.teamhug.GlacialEpoch.GE_Main;

/**
 * GlacialEpoch.git, Created by Henny on 04.03.2017.
 */
@HennyLibRegistry.ServerProxy(modid = GE_Main.MODID)
public class GE_ServerProxy extends GE_CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
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
