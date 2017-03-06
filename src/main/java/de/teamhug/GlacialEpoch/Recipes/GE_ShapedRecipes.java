package de.teamhug.GlacialEpoch.Recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import de.teamhug.GlacialEpoch.Registry.GE_ItemRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GE_ShapedRecipes
{

    public static void registerItemRecipes()
    {

        GameRegistry.addRecipe(new ItemStack(GE_ItemRegistry.itemHidesCutter),
            /*Recipe*/      "  F",
                			"BF ",
                			"SB ",
			/*Material*/    'F', Items.flint, 'B', Items.string, 'S', Items.stick);
    
        GameRegistry.addRecipe(new ItemStack(GE_ItemRegistry.itemCuttingKnife),
             /*Recipe*/      "D  ",
                    		 " DB",
                    		 "  S",
             /*Material*/    'D', Items.flint, 'B', Items.string, 'S', Items.stick);

    }

    public static void registerBlockRecipes()
    {

    }

}
