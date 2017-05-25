package de.teamhug.GlacialEpoch.TileEntities;

import net.minecraft.block.BlockBed;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;


/**
 * GlacialEpoch_TRY-StrawBed, Created by Henny on 25.05.2017.
 */
public class GE_TileEntityStrawBed extends TileEntity
{
    public int damage;

    public GE_TileEntityStrawBed()
    {
        damage = 10;
    }

    @Override
    public void updateEntity()
    {
        int meta = worldObj.getBlockMetadata(xCoord, yCoord, zCoord);

        if(damage <= 0 && !BlockBed.func_149976_c(meta) && BlockBed.isBlockHeadOfBed(meta))
        {
            worldObj.setBlockToAir(xCoord, yCoord, zCoord);
            worldObj.removeTileEntity(xCoord, yCoord, zCoord);
        }
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);
        nbt.setInteger("damage", this.damage);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
        this.damage = nbt.getInteger("damage");
    }
}
