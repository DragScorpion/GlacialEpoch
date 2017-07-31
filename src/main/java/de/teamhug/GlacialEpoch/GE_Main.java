package de.teamhug.GlacialEpoch;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.henny022.HennyLib.HennyLib;
import de.henny022.HennyLib.api.HennyLibRegistry;
import de.henny022.HennyLib.api.IMod;
import de.henny022.HennyLib.api.ModRegisterer;
import de.teamhug.GlacialEpoch.Blocks.GE_Block;
import de.teamhug.GlacialEpoch.Items.GE_Item;
import de.teamhug.GlacialEpoch.Proxy.GE_CommonProxy;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
@Mod(modid = GE_Main.MODID, version = GE_Main.VERSION, name = GE_Main.NAME, dependencies = "required-after:hennylib@[0.1-13,);")
@HennyLibRegistry(namePrefix = "GE_")
@HennyLibRegistry.BlockRegistry(creativeTab = "tabGEBlocks", blockClass = GE_Block.class)
@HennyLibRegistry.ItemRegistry(creativeTab = "tabGEItems", itemClass = GE_Item.class)
public class GE_Main implements IMod
{
    public static final String MODID = "glacialepoch";
    public static final String NAME = "GlacialEpoch";
    public static final String VERSION = "0.0.0";

    @Mod.Instance(value = MODID)
    public static GE_Main instance;

    @SidedProxy(clientSide = "de.teamhug.GlacialEpoch.Proxy.GE_ClientProxy", serverSide = "de.teamhug.GlacialEpoch.Proxy.GE_ServerProxy")
    public static GE_CommonProxy proxy;

    public static ModRegisterer registerer;

    public GE_Main()
    {
        registerer = HennyLib.registerMod(this.getClass());
    }

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
