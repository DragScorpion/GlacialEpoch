package de.teamhug.GlacialEpoch;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.teamhug.GlacialEpoch.Proxy.GE_Common_Proxy;
import de.teamhug.GlacialEpoch.Registry.GE_Blocks;
import de.teamhug.GlacialEpoch.Registry.GE_Items;

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

    @SidedProxy(clientSide = "de.teamhug.GlacialEpoch.Proxy.GE_Client_Proxy", serverSide = "de.teamhug.GlacialEpoch.Proxy.GE_Common_Proxy")
    public static GE_Common_Proxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        GE_Items.registerItems();
        GE_Blocks.registerBlocks();
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
