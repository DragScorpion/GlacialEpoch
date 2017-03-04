package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import de.teamhug.GlacialEpoch.Blocks.GE_Block;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_Blocks
{
    public static Block blockDummyBlock;

    public static void registerBlocks()
    {
        blockDummyBlock = new GE_Block("GE_blockDummyBlock", Material.rock);
        GameRegistry.registerBlock(blockDummyBlock, "GE_blockDummyBlock");
    }
}
