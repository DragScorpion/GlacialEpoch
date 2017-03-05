package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import de.teamhug.GlacialEpoch.Blocks.GE_Block;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_Blocks_Registry
{
    public static Block blockDummyBlock;
    public static Block blockDummyBlockNexon;
    public static Block blockDummyBlockRohr;
    public static Block blockDummyBlockDrag;

    public static void registerBlocks()
    {
        blockDummyBlock = new GE_Block("GE_blockDummyBlock", Material.rock);
        GameRegistry.registerBlock(blockDummyBlock, "GE_blockDummyBlock");
        
        blockDummyBlockNexon = new GE_Block("GE_blockDummyBlockNexon", Material.rock);
        GameRegistry.registerBlock(blockDummyBlockNexon, "GE_blockDummyBlockNexon");
        
        blockDummyBlockRohr = new GE_Block("GE_blockDummyBlockRohr", Material.rock);
        GameRegistry.registerBlock(blockDummyBlockRohr, "GE_blockDummyBlockRohr");
        
        blockDummyBlockDrag = new GE_Block("GE_blockDummyBlockDrag", Material.rock);
        GameRegistry.registerBlock(blockDummyBlockDrag, "GE_blockDummyBlockDrag");
    }
}
