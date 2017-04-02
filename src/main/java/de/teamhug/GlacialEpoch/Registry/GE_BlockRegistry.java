package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import de.teamhug.GlacialEpoch.Blocks.GE_Block;
import de.teamhug.GlacialEpoch.Blocks.GE_BlockButcherTable;
import de.teamhug.GlacialEpoch.Blocks.GE_BlockCampFire;
import de.teamhug.GlacialEpoch.Blocks.GE_BlockDeadWood;
import de.teamhug.GlacialEpoch.Blocks.GE_BlockPistonBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_BlockRegistry
{
    public static Block blockDummyBlock;

    public static Block blockDeadWood;
    public static Block blockDeadWoodFrozen;
    
    public static Block blockCampFire;
    public static Block blockButcherTable;
    
    public static Block blockPistonBlock;

    public static void registerBlocks()
    {
        
    	// Dead Wood
        blockDeadWood = new GE_BlockDeadWood("GE_blockDeadWood", Material.rock);
        GameRegistry.registerBlock(blockDeadWood, "GE_blockDeadWood");

        blockDeadWoodFrozen = new GE_BlockDeadWood("GE_blockDeadWoodFrozen", Material.ice);
        GameRegistry.registerBlock(blockDeadWoodFrozen, "GE_blockDeadWoodFrozen");
    	
        // TileEntities Blocks
        blockCampFire = new  GE_BlockCampFire("GE_BlockCampFire", Material.rock);
        GameRegistry.registerBlock(blockCampFire, "GE_BlockCampFire");
        
        blockButcherTable = new GE_BlockButcherTable("GE_BlockButcherTable", Material.rock);
        GameRegistry.registerBlock(blockButcherTable, "GE_BlockButcherTable");
    	
        // Miscellaneous
        blockPistonBlock = new GE_BlockPistonBlock("GE_blockPistonBlock");
        GameRegistry.registerBlock(blockPistonBlock, "GE_blockPistonBlock");
        
        // Dummy 
    	blockDummyBlock = new GE_Block("GE_blockDummyBlock", Material.rock);
        GameRegistry.registerBlock(blockDummyBlock, "GE_blockDummyBlock");

    }
}
