package de.teamhug.GlacialEpoch;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.teamhug.GlacialEpoch.Proxy.GE_CommonProxy;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
@Mod(modid = GE_Main.MODID, version = GE_Main.VERSION, name = GE_Main.NAME)
public class GE_Main
{
    public static final String MODID = "glacialepochmod";
    public static final String NAME = "GlacialEpochMod";
    public static final String VERSION = "0.0";

    @Mod.Instance(value = MODID)
    public static GE_Main instance;

    @SidedProxy(clientSide = "de.teamhug.GlacialEpoch.Proxy.GE_ClientProxy", serverSide = "de.teamhug.GlacialEpoch.Proxy.GE_ServerProxy")
    public static GE_CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
