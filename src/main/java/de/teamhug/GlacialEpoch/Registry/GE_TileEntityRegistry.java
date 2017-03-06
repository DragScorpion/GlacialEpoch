package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import de.teamhug.GlacialEpoch.TileEntities.GE_TileEntityButcherTable;
import de.teamhug.GlacialEpoch.TileEntities.GE_TileEntityCampFire;
import net.minecraft.tileentity.TileEntity;

public class GE_TileEntityRegistry
{
	
	public static void registerTileEntity() {
		GameRegistry.registerTileEntity(GE_TileEntityCampFire.class, "GE_TileEntityCampFire");
		TileEntity.addMapping(GE_TileEntityCampFire.class, "GE_TileEntityCampFire_map");
		
		GameRegistry.registerTileEntity(GE_TileEntityButcherTable.class, "GE_TileEntityButcherTable");
		TileEntity.addMapping(GE_TileEntityButcherTable.class, "GE_TileEntityButcherTable_map");
	}
	
}
