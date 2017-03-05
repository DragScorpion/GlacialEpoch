package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import de.teamhug.GlacialEpoch.Tileentities.GE_TileentityCampFire;
import net.minecraft.tileentity.TileEntity;

public class GE_TileentityRegistry {
	
	public static void registerTileEntity() {
		GameRegistry.registerTileEntity(GE_TileentityCampFire.class, "GE_TileEntityCampFire");
		TileEntity.addMapping(GE_TileentityCampFire.class, "GE_TileEntityCampFire_map");
	}
	
}
