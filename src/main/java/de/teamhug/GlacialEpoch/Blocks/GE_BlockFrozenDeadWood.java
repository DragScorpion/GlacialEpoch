package de.teamhug.GlacialEpoch.Blocks;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

/**
 * GlacialEpoch.git, Created by Henny on 05.03.2017.
 */
public class GE_BlockFrozenDeadWood extends BlockRotatedPillar
{
    private IIcon[] icons = new IIcon[2];

    public GE_BlockFrozenDeadWood(Material material)
    {
        super(material);
        this.setHardness(2.5f);
    }

    @Override
    public void registerBlockIcons(IIconRegister register)
    {
        icons[0] = register.registerIcon(this.getTextureName() + "_Side");
        icons[1] = register.registerIcon(this.getTextureName() + "_Top");
    }

    @Override
    protected IIcon getSideIcon(int p_150163_1_)
    {
        return icons[0];
    }

    @Override
    protected IIcon getTopIcon(int p_150161_1_)
    {
        return icons[1];
    }
}
