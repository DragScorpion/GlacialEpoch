package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.client.registry.ClientRegistry;
import de.teamhug.GlacialEpoch.Renders.GE_RenderCampFire;
import de.teamhug.GlacialEpoch.TileEntities.GE_TileEntityCampFire;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class GE_RenderRegistry {
	
	public static void registerRenderer() {
		
		TileEntitySpecialRenderer renderCampFire = new GE_RenderCampFire();
		ClientRegistry.bindTileEntitySpecialRenderer(GE_TileEntityCampFire.class, renderCampFire);
		
	}
	
}
