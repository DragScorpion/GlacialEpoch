package de.teamhug.GlacialEpoch.Proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.henny022.HennyLib.api.IProxy;
import de.teamhug.GlacialEpoch.GE_Main;
import de.teamhug.GlacialEpoch.Recipes.GE_ButcherRecipes;
import de.teamhug.GlacialEpoch.Recipes.GE_ShapedRecipes;
import de.teamhug.GlacialEpoch.Recipes.GE_ShapelessRecipes;
import de.teamhug.GlacialEpoch.Recipes.GE_SmeltingRecipes;
import de.teamhug.GlacialEpoch.Registry.GE_GuiRegistry;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_CommonProxy implements IProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        GE_Main.registerer.preInitCommon();

        GE_ShapedRecipes.registerItemRecipes();
        GE_ShapedRecipes.registerBlockRecipes();
        GE_ShapelessRecipes.registerItemRecipes();
        GE_ShapelessRecipes.registerBlockRecipes();
        GE_SmeltingRecipes.registerItemRecipes();
        GE_SmeltingRecipes.registerBlockRecipes();

        GE_ButcherRecipes.registerRecipes();

    }

    public void init(FMLInitializationEvent event)
    {
        GE_GuiRegistry.registerGUIs();
        GE_Main.registerer.initCommon();
    }

    public void postInit(FMLPostInitializationEvent event)
    {
        GE_Main.registerer.postInitCommon();
    }
}
