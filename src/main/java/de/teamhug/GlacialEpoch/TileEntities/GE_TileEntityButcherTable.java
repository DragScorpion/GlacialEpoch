package de.teamhug.GlacialEpoch.TileEntities;

import com.ibm.icu.util.BytesTrie.Iterator;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.teamhug.GlacialEpoch.Recipes.GE_ButcherRecipes;
import de.teamhug.GlacialEpoch.Util.GE_ButcherRecipe;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;

public class GE_TileEntityButcherTable extends TileEntity implements IInventory {
	
	// Inventory Slot Array
	private ItemStack[] inventory = new ItemStack[24];
	
	//Remaining burnTime
	public int burnTime;
	//Max burnTime from last Item
	public int currentItemBurnTime;
	//Current butcher progress
	public int butcherTime;
	//Max butcherTime to finish
	public int maxButcherTime = 600;
	
	// Constructor for this tileEntity (Needed to work)
	public GE_TileEntityButcherTable() {
		}
	
	//To scale the image with the current butcherTime
	@SideOnly(Side.CLIENT)
    public int getCookProgressScaled(int scale) {
        return this.butcherTime * scale / maxButcherTime;
		}
	
	//To scale the image with remaining burnTime
	@SideOnly(Side.CLIENT)
    public int getBurnTimeRemainingScaled(int scale) {
        if (this.currentItemBurnTime == 0) {
            this.currentItemBurnTime = maxButcherTime;
        }
        
        return this.burnTime * scale / this.currentItemBurnTime;
    } 
	
	//Has the block fuel to work?
	public boolean isBurning() {
        return this.burnTime > 0;
    }
	
	//Update tileEntity
	public void updateEntity() {
		//BurningState before Update
        boolean flag = this.isBurning();
        boolean flag1 = false;
        boolean canButcher = this.canButcher();
        
        //Decrease burnTime every tick
        if (this.burnTime > 0) {
            --this.burnTime;
        }
        
        //If this function get called from Server
        if (!this.worldObj.isRemote) {
        	//Block has fuel or has a fuel item and can butcher
            if (this.isBurning() || this.inventory[1] != null && this.hasInput()) {
                if (this.burnTime == 0 && canButcher) {
                    this.currentItemBurnTime = this.burnTime = TileEntityFurnace.getItemBurnTime(this.inventory[9]);

                    if (this.burnTime > 0) {
                        flag1 = true;

                        if (this.inventory[9] != null) {
                            --this.inventory[9].stackSize;

                            if (this.inventory[9].stackSize == 0) {
                                this.inventory[9] = inventory[9].getItem().getContainerItem(inventory[9]);
                            }
                        }
                    }
                }

                if (this.isBurning() && canButcher) {
                    ++this.butcherTime;
                    
                    //Is progress finish
                    if (this.butcherTime == this.maxButcherTime) {
                        this.butcherTime = 0;
                        this.butcherItem();
                        flag1 = true;
                    }
                } else {
                    this.butcherTime = 0;
                }
            }

            if (flag != this.isBurning()) {
                flag1 = true;
                //BlockFurnace.updateFurnaceBlockState(this.burnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (flag1) {
            this.markDirty();
        }
    }
	
	private boolean hasInput() {
		for (int i = 0; i < 9; i++) {
			if (this.inventory[i] != null)
				return true;
		}
		return false;
	}
	
	private boolean canButcher() {
		GE_ButcherRecipe recipe = null;
		
		for (int i = 0; i < 9; i++) {
			if (this.inventory[i] == null) continue;
			
			java.util.Iterator<GE_ButcherRecipe> iterator = GE_ButcherRecipes.recipes.iterator();
			while (iterator.hasNext()) {
				GE_ButcherRecipe tempRecipe = iterator.next();
				if (tempRecipe.getInputItem().equals(this.inventory[i])) {
					recipe = tempRecipe;
					break;
				}
			}
			if (recipe != null) {
				break;
			}
		}
		if (recipe == null) {
			return false;
		}
		
		java.util.Iterator<ItemStack> iterator = recipe.getToolItems().iterator();
		while (iterator.hasNext()) {
			ItemStack item = iterator.next();
			boolean flag = false;
			for (int i = 0; i < 5; i++) {
				if (this.inventory[i+10] == null) continue;
				if (item.equals(this.inventory[i+10])) {
					flag = true;
					break;
				}
			}
			
			if (flag == false) {
				return false;
			}
		}
		ItemStack[] tempInventory = new ItemStack[9];
		for (int i = 0; i < 9; i++) {
			tempInventory[i] = this.inventory[i+15];
		}
		
		iterator = recipe.getOutputItems().iterator();
		while (iterator.hasNext()) {
			ItemStack item = iterator.next();
			boolean flag = false;
			int freeSlot = -1;
			for (int i = 0; i < 9; i++) {
				if (tempInventory[i] == null && freeSlot == -1)
					freeSlot = i;
				if (item.isItemEqual(tempInventory[i]) && tempInventory[i].stackSize < getInventoryStackLimit()) {
					int tempSize = Math.min(getInventoryStackLimit() - tempInventory[i].stackSize, item.stackSize);
					tempInventory[i].stackSize += tempSize;
					item.stackSize -= tempSize;
				}
				if (item.stackSize <= 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				if (freeSlot == -1)
					return false;
				else
					tempInventory[freeSlot] = item;
			}
		}
		return true;
    }
	
	private boolean butcherItem() {
		GE_ButcherRecipe recipe = null;
		int slot = 0;
		
		for (int i = 0; i < 9; i++) {
			if (this.inventory[i] == null) continue;
			
			java.util.Iterator<GE_ButcherRecipe> iterator = GE_ButcherRecipes.recipes.iterator();
			while (iterator.hasNext()) {
				GE_ButcherRecipe tempRecipe = iterator.next();
				if (tempRecipe.getInputItem().equals(this.inventory[i])) {
					recipe = tempRecipe;
					slot = i;
					break;
				}
			}
			if (recipe != null) {
				break;
			}
		}
		if (recipe == null) {
			return false;
		}
		
		/*
		 * Hier einprogrammieren, das der Eimer leer wird nach dem die arbeit fertig ist.
		 * 
		 */
		/*
		java.util.Iterator<ItemStack> iterator = recipe.getToolItems().iterator();
		while (iterator.hasNext()) {
			ItemStack item = iterator.next();
			boolean flag = false;
			for (int i = 0; i < 5; i++) {
				if (this.inventory[i+10] == null) continue;
				if (item.equals(this.inventory[i+10])) {
					flag = true;
					break;
				}
			}
			
			if (flag == false) {
				return false;
			}
		}
		*/
		
		java.util.Iterator<ItemStack> iterator = recipe.getOutputItems().iterator();
		while (iterator.hasNext()) {
			ItemStack item = iterator.next();
			boolean flag = false;
			int freeSlot = -1;
			for (int i = 0; i < 9; i++) {
				if (this.inventory[i+15] == null && freeSlot == -1)
					freeSlot = i;
				if (item.isItemEqual(this.inventory[i+15]) && this.inventory[i+15].stackSize < getInventoryStackLimit()) {
					int tempSize = Math.min(getInventoryStackLimit() - this.inventory[i+15].stackSize, item.stackSize);
					this.inventory[i+15].stackSize += tempSize;
					item.stackSize -= tempSize;
				}
				if (item.stackSize <= 0) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				if (freeSlot == -1)
					return false;
				else
					this.inventory[freeSlot] = item;
			}
		}
		return true;
    }
	
	// Read/Write NBT
		@Override
		public void writeToNBT(NBTTagCompound nbt) {
		    super.writeToNBT(nbt);
		    nbt.setShort("BurnTime",(short)this.burnTime);
		    nbt.setShort("ButcherTime",(short)this.butcherTime);
		    NBTTagList list = new NBTTagList();
		    for (int i = 0; i < this.getSizeInventory(); ++i) {
		        if (this.getStackInSlot(i) != null) {
		            NBTTagCompound stackTag = new NBTTagCompound();
		            stackTag.setByte("Slot", (byte) i);
		            this.getStackInSlot(i).writeToNBT(stackTag);
		            list.appendTag(stackTag);
		        }
		    }
		    nbt.setTag("Items", list);
		}
		
		@Override
		public void readFromNBT(NBTTagCompound nbt) {
		    super.readFromNBT(nbt);

		    NBTTagList list = nbt.getTagList("Items", 10);
		    for (int i = 0; i < list.tagCount(); ++i) {
		        NBTTagCompound stackTag = list.getCompoundTagAt(i);
		        int slot = stackTag.getByte("Slot") & 255;
		        this.setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(stackTag));
		    }
		    
		    this.burnTime = nbt.getShort("BurnTime");
		    this.butcherTime = nbt.getShort("ButcherTime");
		    this.currentItemBurnTime = TileEntityFurnace.getItemBurnTime(this.inventory[1]);
		    
		}

	@Override
	public int getSizeInventory() {
		return this.inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int index) {
		if (index < 0 || index >= this.getSizeInventory())
			return null;
		return inventory[index];
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
	    if (this.getStackInSlot(index) != null) {
	        ItemStack itemstack;

	        if (this.getStackInSlot(index).stackSize <= count) {
	            itemstack = this.getStackInSlot(index);
	            this.setInventorySlotContents(index, null);
	            this.markDirty();
	            return itemstack;
	        } else {
	            itemstack = this.getStackInSlot(index).splitStack(count);

	            if (this.getStackInSlot(index).stackSize <= 0) {
	                this.setInventorySlotContents(index, null);
	            } else {
	                //Just to show that changes happened
	                this.setInventorySlotContents(index, this.getStackInSlot(index));
	            }

	            this.markDirty();
	            return itemstack;
	        }
	    } else {
	        return null;
	    }
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int index) {
	    ItemStack stack = this.getStackInSlot(index);
	    this.setInventorySlotContents(index, null);
	    return stack;
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
	    if (index < 0 || index >= this.getSizeInventory())
	        return;

	    if (stack != null && stack.stackSize > this.getInventoryStackLimit())
	        stack.stackSize = this.getInventoryStackLimit();
	        
	    if (stack != null && stack.stackSize == 0)
	        stack = null;

	    this.inventory[index] = stack;
	    this.markDirty();
	}

	@Override
	public String getInventoryName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasCustomInventoryName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getInventoryStackLimit() {
		// TODO Auto-generated method stub
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) == this && player.getDistanceSq(this.xCoord+0.5, this.yCoord+0.5, this.zCoord+0.5) <= 64;
	}

	@Override
	public void openInventory() {
		// TODO Auto-generated method stub
	}

	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		if (index >= 15) return false;
		return true;
	}

}
