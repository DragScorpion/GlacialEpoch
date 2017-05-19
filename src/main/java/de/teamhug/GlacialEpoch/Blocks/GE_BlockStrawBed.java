package de.teamhug.GlacialEpoch.Blocks;

import de.teamhug.GlacialEpoch.GE_Main;
import net.minecraft.block.BlockBed;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * GlacialEpoch_TRY-StrawBed, Created by Henny on 19.05.2017.
 */
public class GE_BlockStrawBed extends BlockBed
{
    public GE_BlockStrawBed()
    {
        super();
        this.setBlockName("GE_blockStrawBed");
        this.setBlockTextureName(GE_Main.MODID + ":GE_blockStrawBed");
    }

    @Override
    public boolean isBed(IBlockAccess world, int x, int y, int z, EntityLivingBase player)
    {
        return true;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        // we cant use metadata, because the bed uses its own
        //int damage = world.getBlockMetadata(x, y, z);
        //if(damage <= 0)
        //{
        //    System.out.println("should now be destroyed, if minecraft would have good code");
        //    return true;
        //}
        //else
        //{
        //    world.setBlockMetadataWithNotify(x, y, z, damage - 1, 3);
        //    return super.onBlockActivated(world, x, y, z, player, side, hitX, hitY, hitZ);
        //}

        return super.onBlockActivated(world, x, y, z, player, side, hitX, hitY, hitZ);
    }
}
