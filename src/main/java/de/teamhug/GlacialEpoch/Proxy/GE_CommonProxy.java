package de.teamhug.GlacialEpoch.Proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.teamhug.GlacialEpoch.Recipes.GE_ButcherRecipes;
import de.teamhug.GlacialEpoch.Recipes.GE_ShapedRecipes;
import de.teamhug.GlacialEpoch.Recipes.GE_ShapelessRecipes;
import de.teamhug.GlacialEpoch.Recipes.GE_SmeltingRecipes;
import de.teamhug.GlacialEpoch.Registry.*;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        GE_ItemRegistry.registerItems();
        GE_ItemButcherMod.registerItem();
        GE_BlockRegistry.registerBlocks();
        GE_FuelRegistry.registerFuels();
        GE_TileEntityRegistry.registerTileEntity();

        GE_ShapedRecipes.registerItemRecipes();
        GE_ShapedRecipes.registerBlockRecipes();
        GE_ShapelessRecipes.registerItemRecipes();
        GE_ShapelessRecipes.registerBlockRecipes();
        GE_SmeltingRecipes.registerItemRecipes();
        GE_SmeltingRecipes.registerBlockRecipes();
        
        GE_ButcherRecipes.registerRecipes();
        
        GE_EventRegistry.registerEvents();
    }

    public void init(FMLInitializationEvent event)
    {
        GE_GuiRegistry.registerGUIs();
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
