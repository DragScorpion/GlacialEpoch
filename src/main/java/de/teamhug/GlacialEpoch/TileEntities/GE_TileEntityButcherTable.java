package de.teamhug.GlacialEpoch.TileEntities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;

public class GE_TileEntityButcherTable extends TileEntity implements IInventory {
	
	private ItemStack[] inventory = new ItemStack[24];
	
	public int burnTime;
	
	public int currentItemBurnTime;
	
	public int butcherTime;
	
	public int maxButcherTime = 600;
	
	public GE_TileEntityButcherTable() {
		}
	
	@SideOnly(Side.CLIENT)
    public int getCookProgressScaled(int scale) {
        return this.butcherTime * scale / maxButcherTime;
		}
	
	@SideOnly(Side.CLIENT)
    public int getBurnTimeRemainingScaled(int scale) {
        if (this.currentItemBurnTime == 0) {
            this.currentItemBurnTime = maxButcherTime;
        }
        
        return this.burnTime * scale / this.currentItemBurnTime;
        } 
		
	public boolean isBurning() {
        return this.burnTime > 0;
    }
	public void updateEntity() {
        boolean flag = this.burnTime > 0;
        boolean flag1 = false;

        if (this.burnTime > 0) {
            --this.burnTime;
        }

        if (!this.worldObj.isRemote) {
            if (this.burnTime != 0 || this.inventory[1] != null && this.inventory[0] != null) {
                if (this.burnTime == 0 && this.canButcher()) {
                    this.currentItemBurnTime = this.burnTime = TileEntityFurnace.getItemBurnTime(this.inventory[1]);

                    if (this.burnTime > 0) {
                        flag1 = true;

                        if (this.inventory[1] != null) {
                            --this.inventory[1].stackSize;

                            if (this.inventory[1].stackSize == 0) {
                                this.inventory[1] = inventory[1].getItem().getContainerItem(inventory[1]);
                            }
                        }
                    }
                }

                if (this.isBurning() && this.canButcher()) {
                    ++this.butcherTime;
                    
                    //Brenn Zeit erh�hen
                    if (this.butcherTime == this.maxButcherTime) {
                        this.butcherTime = 0;
                        this.butcherItem();
                        flag1 = true;
                    }
                } else {
                    this.butcherTime = 0;
                }
            }

            if (flag != this.burnTime > 0) {
                flag1 = true;
                //BlockFurnace.updateFurnaceBlockState(this.burnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (flag1) {
            this.markDirty();
        }
    }
	
	private boolean canButcher() {
        if (this.inventory[0] == null) {
            return false;
        } else {
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.inventory[0]);
            if (itemstack == null) return false;
            if (this.inventory[2] == null) return true;
            if (!this.inventory[2].isItemEqual(itemstack)) return false;
            int result = inventory[2].stackSize + itemstack.stackSize;
            return result <= getInventoryStackLimit() && result <= this.inventory[2].getMaxStackSize();
        }
    }

}
