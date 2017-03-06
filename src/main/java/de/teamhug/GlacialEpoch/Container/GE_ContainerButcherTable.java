package de.teamhug.GlacialEpoch.Container;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.teamhug.GlacialEpoch.TileEntities.GE_TileEntityButcherTable;
import de.teamhug.GlacialEpoch.TileEntities.GE_TileEntityCampFire;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class GE_ContainerButcherTable extends Container {
	
	private int INPUT = 0;
	private int FUEL = INPUT+9;
	private int TOOL = FUEL+1;
	private int OUTPUT = TOOL+5;
	private int INVBAR = OUTPUT+9;
	private int INVMAIN = INVBAR+9;
	private int INVEND = INVMAIN+27;
	
	private GE_TileEntityButcherTable tileEntity;
	private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;
	
    public GE_ContainerButcherTable(InventoryPlayer inventory, GE_TileEntityButcherTable te) {
    	this.tileEntity = te;
    	
    	for (int i = 0; i < 3; i++) {
    		for (int j = 0; j < 3; j++) {
    			this.addSlotToContainer(new Slot(te, j+i*3, 10, 10));
    		}
    	}
    	for (int i = 0; i < 3; i++) {
    		for (int j = 0; j < 3; j++) {
    			this.addSlotToContainer(new GE_SlotOutput(te, j+i*3+OUTPUT, 10, 10));
    		}
    	}
    	for (int i = 0; i < 5; i++) {
    		this.addSlotToContainer(new Slot(te, i+TOOL, 10, 10));
    	}
    	this.addSlotToContainer(new Slot(te, FUEL, 10, 10));
    	
    	for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(inventory, i*9+j+9, 8+18*j, 84+18*i));
			}
		}
		for (int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(inventory, i, 8+18*i, 142));
		}
    	
    }
    
    public void addCraftingToCrafters(ICrafting p_75132_1_)
    {
        super.addCraftingToCrafters(p_75132_1_);
        p_75132_1_.sendProgressBarUpdate(this, 0, this.tileEntity.butcherTime);
        p_75132_1_.sendProgressBarUpdate(this, 1, this.tileEntity.burnTime);
        p_75132_1_.sendProgressBarUpdate(this, 2, this.tileEntity.currentItemBurnTime);
    }
	 
	public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); ++i)
        {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if (this.lastCookTime != this.tileEntity.butcherTime)
            {
                icrafting.sendProgressBarUpdate(this, 0, this.tileEntity.butcherTime);
            }

            if (this.lastBurnTime != this.tileEntity.burnTime)
            {
                icrafting.sendProgressBarUpdate(this, 1, this.tileEntity.burnTime);
            }

            if (this.lastItemBurnTime != this.tileEntity.currentItemBurnTime)
            {
                icrafting.sendProgressBarUpdate(this, 2, this.tileEntity.currentItemBurnTime);
            }
        }

        this.lastCookTime = this.tileEntity.butcherTime;
        this.lastBurnTime = this.tileEntity.burnTime;
        this.lastItemBurnTime = this.tileEntity.currentItemBurnTime;
    }
	
	@SideOnly(Side.CLIENT)
    public void updateProgressBar(int p_75137_1_, int p_75137_2_)
    {
        if (p_75137_1_ == 0)
        {
            this.tileEntity.butcherTime = p_75137_2_;
        }

        if (p_75137_1_ == 1)
        {
            this.tileEntity.burnTime = p_75137_2_;
        }

        if (p_75137_1_ == 2)
        {
            this.tileEntity.currentItemBurnTime = p_75137_2_;
        }
    }
    
	@Override
	public boolean canInteractWith(EntityPlayer p_75145_1_) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
		ItemStack stack = null;
		Slot slotObject = (Slot) inventorySlots.get(slot);
		
		// null checks and checks if the item can be stacked (maxStackSize > 1)
		if (slotObject != null && slotObject.getHasStack()) {
			ItemStack stackInSlot = slotObject.getStack();
			stack = stackInSlot.copy();
			
			// merges the item into player inventory since its in the tileEntity
			if (slot <= INVBAR) {
				// From TileEntity to Player
				if (!this.mergeItemStack(stackInSlot, INVBAR, INVEND, true)) {
					return null;
				}
			}
			// places it into the tileEntity is possible since its in the player
			// inventory
			else {
				//From Player to TileEntity
				if (!this.mergeItemStack(stackInSlot, INPUT, OUTPUT, true)) {
					return null;
				}
			}
			
			if (stackInSlot.stackSize == 0) {
				slotObject.putStack(null);
			} else {
				slotObject.onSlotChanged();
			}
			
			if (stackInSlot.stackSize == stack.stackSize) {
				return null;
			}
			slotObject.onPickupFromSlot(player, stackInSlot);
			
		}
		return stack;
	}
	
}
