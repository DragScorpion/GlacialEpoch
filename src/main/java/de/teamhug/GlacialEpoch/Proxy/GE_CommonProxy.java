package de.teamhug.GlacialEpoch.Proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import de.teamhug.GlacialEpoch.GE_Main;
import de.teamhug.GlacialEpoch.Guis.GE_GUIHandler;
import de.teamhug.GlacialEpoch.Registry.GE_BlockRegistry;
import de.teamhug.GlacialEpoch.Registry.GE_FuelRegistry;
import de.teamhug.GlacialEpoch.Registry.GE_ItemRegistry;
import de.teamhug.GlacialEpoch.Registry.GE_TileentityRegistry;
import de.teamhug.GlacialEpoch.Util.GE_MobDropsHandler;
import net.minecraftforge.common.MinecraftForge;

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
        GE_TileentityRegistry.registerTileEntity();
        MinecraftForge.EVENT_BUS.register(new GE_MobDropsHandler());
    }

    public void init(FMLInitializationEvent event)
    {
    	NetworkRegistry.INSTANCE.registerGuiHandler(GE_Main.instance, new GE_GUIHandler());
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
