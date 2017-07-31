package de.teamhug.GlacialEpoch.Blocks;

import de.teamhug.GlacialEpoch.TileEntities.GE_TileEntityStrawBed;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

import java.util.Random;

/**
 * GlacialEpoch_TRY-StrawBed, Created by Henny on 19.05.2017.
 *
 * Metadata information:
 * bit: usage
 * 1, 2: orientation (SWNE)
 * 3: isSomeoneSleeping (only on head)
 * 4: isHead
 */
public class GE_BlockStrawBed extends BlockBed implements ITileEntityProvider
{
    public GE_BlockStrawBed()
    {
        super();
        this.isBlockContainer = true;
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return null;
    }

    @Override
    public boolean isBed(IBlockAccess world, int x, int y, int z, EntityLivingBase player)
    {
        return true;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if(world.isRemote)
        {
            return true;
        }

        GE_TileEntityStrawBed tileEntity = (GE_TileEntityStrawBed) world.getTileEntity(x, y, z);
        int meta = world.getBlockMetadata(x, y, z);

        if(!isBlockHeadOfBed(meta))
        {
            int j1 = getDirection(meta);
            x += field_149981_a[j1][0];
            z += field_149981_a[j1][1];

            if(world.getBlock(x, y, z) != this)
            {
                return true;
            }

            tileEntity = (GE_TileEntityStrawBed) world.getTileEntity(x, y, z);
            meta = world.getBlockMetadata(x, y, z);
        }

        if(world.provider.canRespawnHere() && world.getBiomeGenForCoords(x, z) != BiomeGenBase.hell)
        {
            if(func_149976_c(meta))
            {
                EntityPlayer entityPlayer1 = null;

                for(Object playerEntity : world.playerEntities)
                {
                    EntityPlayer entityPlayer2 = (EntityPlayer) playerEntity;

                    if(entityPlayer2.isPlayerSleeping())
                    {
                        ChunkCoordinates chunkcoordinates = entityPlayer2.playerLocation;

                        if(chunkcoordinates.posX == x && chunkcoordinates.posY == y && chunkcoordinates.posZ == z)
                        {
                            entityPlayer1 = entityPlayer2;
                        }
                    }
                }

                if(entityPlayer1 != null)
                {
                    player.addChatComponentMessage(new ChatComponentTranslation("tile.bed.occupied"));
                    return true;
                }

                func_149979_a(world, x, y, z, false);
            }

            EntityPlayer.EnumStatus enumStatus = player.sleepInBedAt(x, y, z);

            if(enumStatus == EntityPlayer.EnumStatus.OK)
            {
                func_149979_a(world, x, y, z, true);
                tileEntity.damage = tileEntity.damage - 1;
                return true;
            }
            else
            {
                if(enumStatus == EntityPlayer.EnumStatus.NOT_POSSIBLE_NOW)
                {
                    player.addChatComponentMessage(new ChatComponentTranslation("tile.bed.noSleep"));
                }
                else if(enumStatus == EntityPlayer.EnumStatus.NOT_SAFE)
                {
                    player.addChatComponentMessage(new ChatComponentTranslation("tile.bed.notSafe"));
                }

                return true;
            }
        }
        else
        {
            double d2 = (double) x + 0.5D;
            double d0 = (double) y + 0.5D;
            double d1 = (double) z + 0.5D;
            world.setBlockToAir(x, y, z);
            int k1 = getDirection(meta);
            x += field_149981_a[k1][0];
            z += field_149981_a[k1][1];

            if(world.getBlock(x, y, z) == this)
            {
                world.setBlockToAir(x, y, z);
                d2 = (d2 + (double) x + 0.5D) / 2.0D;
                d0 = (d0 + (double) y + 0.5D) / 2.0D;
                d1 = (d1 + (double) z + 0.5D) / 2.0D;
            }

            world.newExplosion(null, (double) ((float) x + 0.5F), (double) ((float) y + 0.5F), (double) ((float) z + 0.5F), 5.0F, true, true);
            return true;
        }
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new GE_TileEntityStrawBed();
    }

    public void breakBlock(World world, int x, int y, int z, Block block, int state)
    {
        super.breakBlock(world, x, y, z, block, state);
        world.removeTileEntity(x, y, z);
    }

    public boolean onBlockEventReceived(World world, int x, int y, int z, int p_149696_5_, int p_149696_6_)
    {
        super.onBlockEventReceived(world, x, y, z, p_149696_5_, p_149696_6_);
        TileEntity tileentity = world.getTileEntity(x, y, z);
        return tileentity != null && tileentity.receiveClientEvent(p_149696_5_, p_149696_6_);
    }
}
