package de.teamhug.GlacialEpoch.TileEntities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.henny022.HennyLib.api.HennyLibRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockHardenedClay;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraftforge.common.util.ForgeDirection;

@HennyLibRegistry.TileEntity
public class GE_TileEntityClayFurnace extends TileEntity implements IInventory
{

    private ItemStack[] inventory = new ItemStack[3];
    /**
     * The number of ticks that the furnace will keep burning
     */
    public int burnTime;
    /**
     * The number of ticks that a fresh copy of the currently-burning item would keep the furnace burning for
     */
    public int currentItemBurnTime;
    /**
     * The number of ticks that the current item has been cooking for
     */
    public int cookTime;

    public int checkTimer = 0;

    public boolean created = false;

    private int[] structure = {
            1, 1, 1, 1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 0, 1, 1, 1, 1,
            1, 1, 1, 1, 0, 1, 1, 1, 1,
            1, 1, 1, 1, 0, 1, 1, 1, 1
    };

    public GE_TileEntityClayFurnace()
    {
        inventory = new ItemStack[this.getSizeInventory()];
    }

    @SideOnly(Side.CLIENT)
    public int getCookProgressScaled(int scale)
    {
        return this.cookTime * scale / 200;
    }

    @SideOnly(Side.CLIENT)
    public int getBurnTimeRemainingScaled(int scale)
    {
        if(this.currentItemBurnTime == 0)
        {
            this.currentItemBurnTime = 200;
        }

        return this.burnTime * scale / this.currentItemBurnTime;
    }

    public boolean isBurning()
    {
        return this.burnTime > 0;
    }

	/*
	 * TODO
	 * ADD updateEntitiy and check if construction is valid.
	 * ADD check if item can be melted.
	 * 
	 */

    public void updateEntity()
    {
        checkTimer = (checkTimer + 1) % 20;
        if(checkTimer == 0)
        {
            System.out.println(checkIfConstructIsValid());
        }

        if(!created)
        {
            //System.out.println("TileEntity: " + worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord));
            created = true;
        }
    }

    private boolean checkIfConstructIsValid()
    {
        int direction = worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord);
        ForgeDirection fDirection = ForgeDirection.getOrientation(direction + 2);
        int offsetX = -1 - fDirection.offsetX;
        int offsetY = -1;
        int offsetZ = -1 - fDirection.offsetZ;
        for(int i = 0; i < structure.length; i++)
        {

            int x = (i % 3);
            int y = (int) Math.floor(i / 9);
            int z = (int) Math.floor((i % 9) / 3);

            if(x + offsetX == 0 && y + offsetY == 0 && z + offsetZ == 0)
            {
                continue;
            }

            Block block = worldObj.getBlock(x + this.xCoord + offsetX, y + this.yCoord + offsetY, z + this.zCoord + offsetZ);
            switch(structure[i])
            {
                case 0:
                    if(!(block instanceof BlockAir))
                    {
                        return false;
                    }
                    break;
                case 1:
                    if(!(block instanceof BlockHardenedClay))
                    {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }

    // Read/Write NBT
    @Override
    public void writeToNBT(NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);
        nbt.setShort("BurnTime", (short) this.burnTime);
        nbt.setShort("CookTime", (short) this.cookTime);
        NBTTagList list = new NBTTagList();
        for(int i = 0; i < this.getSizeInventory(); ++i)
        {
            if(this.getStackInSlot(i) != null)
            {
                NBTTagCompound stackTag = new NBTTagCompound();
                stackTag.setByte("Slot", (byte) i);
                this.getStackInSlot(i).writeToNBT(stackTag);
                list.appendTag(stackTag);
            }
        }
        nbt.setTag("Items", list);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);

        NBTTagList list = nbt.getTagList("Items", 10);
        for(int i = 0; i < list.tagCount(); ++i)
        {
            NBTTagCompound stackTag = list.getCompoundTagAt(i);
            int slot = stackTag.getByte("Slot") & 255;
            this.setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(stackTag));
        }

        this.burnTime = nbt.getShort("BurnTime");
        this.cookTime = nbt.getShort("CookTime");
        this.currentItemBurnTime = TileEntityFurnace.getItemBurnTime(this.inventory[1]);

    }

    // Inventory Methods
    @Override
    public int getSizeInventory()
    {
        return this.inventory.length;
    }

    @Override
    public ItemStack getStackInSlot(int index)
    {
        if(index < 0 || index >= this.getSizeInventory())
        {
            return null;
        }
        return inventory[index];
    }

    @Override
    public ItemStack decrStackSize(int index, int count)
    {
        if(this.getStackInSlot(index) != null)
        {
            ItemStack itemstack;

            if(this.getStackInSlot(index).stackSize <= count)
            {
                itemstack = this.getStackInSlot(index);
                this.setInventorySlotContents(index, null);
                this.markDirty();
                return itemstack;
            }
            else
            {
                itemstack = this.getStackInSlot(index).splitStack(count);

                if(this.getStackInSlot(index).stackSize <= 0)
                {
                    this.setInventorySlotContents(index, null);
                }
                else
                {
                    //Just to show that changes happened
                    this.setInventorySlotContents(index, this.getStackInSlot(index));
                }

                this.markDirty();
                return itemstack;
            }
        }
        else
        {
            return null;
        }
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int index)
    {
        ItemStack stack = this.getStackInSlot(index);
        this.setInventorySlotContents(index, null);
        return stack;
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack)
    {
        if(index < 0 || index >= this.getSizeInventory())
        {
            return;
        }

        if(stack != null && stack.stackSize > this.getInventoryStackLimit())
        {
            stack.stackSize = this.getInventoryStackLimit();
        }

        if(stack != null && stack.stackSize == 0)
        {
            stack = null;
        }

        this.inventory[index] = stack;
        this.markDirty();
    }

    @Override
    public String getInventoryName()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean hasCustomInventoryName()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getInventoryStackLimit()
    {
        // TODO Auto-generated method stub
        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player)
    {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) == this && player.getDistanceSq(this.xCoord + 0.5, this.yCoord + 0.5, this.zCoord + 0.5) <= 64;
    }

    @Override
    public void openInventory()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void closeInventory()
    {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack stack)
    {
        return slot == 2 ? false : (slot == 1 ? TileEntityFurnace.isItemFuel(stack) : true);
    }

    @Override
    public Packet getDescriptionPacket()
    {
        NBTTagCompound nbt = new NBTTagCompound();
        this.writeToNBT(nbt);
        return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 1, nbt);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt)
    {
        super.onDataPacket(net, pkt);
        this.readFromNBT(pkt.func_148857_g());
    }

}
