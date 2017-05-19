package de.teamhug.GlacialEpoch.GraphicalUserInterfaces;

import org.lwjgl.opengl.GL11;

import de.teamhug.GlacialEpoch.GE_Main;
import de.teamhug.GlacialEpoch.Container.GE_ContainerCampFire;
import de.teamhug.GlacialEpoch.TileEntities.GE_TileEntityCampFire;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GE_GuiCampFire extends GuiContainer {
	
	public final ResourceLocation texture = new ResourceLocation(GE_Main.MODID, "textures/gui/GE_guiCampFire.png");
	public final GE_TileEntityCampFire tileEntity;
	
	public GE_GuiCampFire(InventoryPlayer inventory, GE_TileEntityCampFire te) {
		super(new GE_ContainerCampFire(inventory, te));
		this.tileEntity = te;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_) {
		
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        
        if (this.tileEntity.isBurning())
        {
            int i1 = this.tileEntity.getBurnTimeRemainingScaled(13);
            this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 1);
            i1 = this.tileEntity.getCookProgressScaled(24);
            this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
        }
	}

}
