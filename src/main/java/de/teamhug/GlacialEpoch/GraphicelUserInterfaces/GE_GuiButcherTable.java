package de.teamhug.GlacialEpoch.GraphicelUserInterfaces;

import org.lwjgl.opengl.GL11;

import de.teamhug.GlacialEpoch.GE_Main;
import de.teamhug.GlacialEpoch.Container.GE_ContainerButcherTable;
import de.teamhug.GlacialEpoch.Container.GE_ContainerCampFire;
import de.teamhug.GlacialEpoch.TileEntities.GE_TileEntityButcherTable;
import de.teamhug.GlacialEpoch.TileEntities.GE_TileEntityCampFire;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GE_GuiButcherTable extends GuiContainer {
	
	public final ResourceLocation texture = new ResourceLocation(GE_Main.MODID, "textures/gui/GE_guiButcherTable.png");
	public final GE_TileEntityButcherTable tileEntity;
	
	public GE_GuiButcherTable(InventoryPlayer inventory, GE_TileEntityButcherTable te) {
		super(new GE_ContainerButcherTable(inventory, te));
		this.tileEntity = te;
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
