package de.teamhug.GlacialEpoch.Blocks;

import de.teamhug.GlacialEpoch.GE_Main;
import de.teamhug.GlacialEpoch.Util.GE_CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_Block extends Block
{

    public GE_Block(String unlocalizedName, Material material)
    {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(GE_Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(GE_CreativeTabs.tabGEBlocks);
    }

    @Override
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        super.registerBlockIcons(p_149651_1_);
    }
}
