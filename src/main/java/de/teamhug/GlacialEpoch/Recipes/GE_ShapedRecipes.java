package de.teamhug.GlacialEpoch.Recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import de.teamhug.GlacialEpoch.Registry.GE_ItemButcherMod;
import de.teamhug.GlacialEpoch.Registry.GE_ItemRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class GE_ShapedRecipes
{

    public static void registerItemRecipes()
    {
        GameRegistry.addRecipe(new ItemStack(GE_ItemButcherMod.itemHidesCutter),
            /*Recipe*/
                "  F",
                "BF ",
                "SB ",
            /*Material*/
                'F', Items.flint, 'B', Items.string, 'S', Items.stick);

        GameRegistry.addRecipe(new ItemStack(GE_ItemButcherMod.itemCuttingKnife),
             /*Recipe*/
                "D  ",
                " DB",
                "  S",
             /*Material*/
                'D', Items.flint, 'B', Items.string, 'S', Items.stick);

        GameRegistry.addRecipe(new ItemStack(Items.leather),
             /*Recipe*/
                "DK ",
                "   ",
                "   ",
             /*Material*/
                'D', GE_ItemButcherMod.itemCadaverCow, 'K', GE_ItemButcherMod.itemHidesCutter);

        GameRegistry.addRecipe(new ItemStack(GE_ItemRegistry.itemPrimitiveTool),
            /*Recipe*/
                "F ",
                " S",
            /*Material*/
                'F', Items.flint, 'S', Items.stick);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(GE_ItemRegistry.itemStrawBed),
            /*Recipe*/
                "SSS",
                "SSS",
                "WWW",
            /*Material*/
                'S', Items.wheat, 'W', "plankWood"));
    }

    public static void registerBlockRecipes()
    {

    }

}
