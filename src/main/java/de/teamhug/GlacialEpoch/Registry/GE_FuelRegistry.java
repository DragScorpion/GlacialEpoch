package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * GlacialEpoch.git, Created by Henny on 05.03.2017.
 */
public class GE_FuelRegistry implements IFuelHandler
{
	public static void registerFuels()
    {
        GameRegistry.registerFuelHandler(new GE_FuelRegistry());
    }
	
    @Override
    public int getBurnTime(ItemStack fuel)
    {
        Item fuelItem = fuel.getItem();
        Block fuelBlock = Block.getBlockFromItem(fuel.getItem());
        
        if(fuelBlock == GE_BlockRegistry.blockDeadWood)
        {
            return 200;
        }
        if (fuelItem == GE_ItemRegistry.itemDummyItem2)
        {
        	return 1600;
        }

        return 0;
    }
}
