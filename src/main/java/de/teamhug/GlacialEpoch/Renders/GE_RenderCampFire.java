package de.teamhug.GlacialEpoch.Renders;

import org.lwjgl.opengl.GL11;

import de.teamhug.GlacialEpoch.GE_Main;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class GE_RenderCampFire extends TileEntitySpecialRenderer {
	
	ResourceLocation texture = new ResourceLocation(GE_Main.MODID, "textures/models/campfire.png");
	ResourceLocation objModelLocation = new ResourceLocation(GE_Main.MODID, "models/CampFireModel.obj");
	
	private IModelCustom model;
	
	public GE_RenderCampFire() {
		this.model = AdvancedModelLoader.loadModel(objModelLocation);
	}
	
	@Override
	public void renderTileEntityAt(TileEntity entitiy, double x, double y, double z, float f) {
		this.bindTexture(texture);
		GL11.glPushMatrix();
			GL11.glTranslated(x+0.5, y, z+0.5);
			GL11.glScaled(0.06125, 0.06125, 0.06125);
			GL11.glPushMatrix();
				GL11.glRotatef(0, 0f, 0f, 0.5f);
				this.model.renderAll();
			GL11.glPopMatrix();
		GL11.glPopMatrix();
	}

}
