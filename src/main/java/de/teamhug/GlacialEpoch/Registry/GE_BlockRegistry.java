package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import de.teamhug.GlacialEpoch.Blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_BlockRegistry
{
    public static Block blockDummyBlock;

    public static Block blockBush;
    public static Block blockFrozenDeadWood;
    
    public static Block blockCampFire;
    public static Block blockClayFurnace;
    public static Block blockButcherTable;
    
    public static Block blockPistonBlock;

    public static Block blockStrawBed;

    public static void registerBlocks()
    {
        blockFrozenDeadWood = new GE_BlockFrozenDeadWood("GE_blockFrozenDeadWood", Material.ice);
        GameRegistry.registerBlock(blockFrozenDeadWood, "GE_blockFrozenDeadWood");

        blockBush = new GE_BlockBush("GE_blockBush", 0);
        GameRegistry.registerBlock(blockBush, "GE_blockBush");
    	
        // TileEntities Blocks
        blockCampFire = new  GE_BlockCampFire("GE_blockCampFire", Material.rock);
        GameRegistry.registerBlock(blockCampFire, "GE_blockCampFire");
        
        blockClayFurnace = new  GE_BlockClayFurnace("GE_blockClayFurnace", Material.clay);
        GameRegistry.registerBlock(blockClayFurnace, "GE_blockClayFurnace");
        
        blockButcherTable = new GE_BlockButcherTable("GE_blockButcherTable", Material.rock);
        GameRegistry.registerBlock(blockButcherTable, "GE_blockButcherTable");
    	
        // Miscellaneous
        blockPistonBlock = new GE_BlockPistonBlock("GE_blockPistonBlock");
        GameRegistry.registerBlock(blockPistonBlock, "GE_blockPistonBlock");
        
        // Dummy 
    	//blockDummyBlock = new GE_Block("GE_blockDummyBlock", Material.rock);
        //GameRegistry.registerBlock(blockDummyBlock, "GE_blockDummyBlock");

        blockStrawBed = new GE_BlockStrawBed();
        GameRegistry.registerBlock(blockStrawBed, "GE_blockStrawBed");
    }
}
