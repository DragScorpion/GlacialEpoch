package de.teamhug.GlacialEpoch.GraphicalUserInterfaces;

import cpw.mods.fml.common.network.IGuiHandler;
import de.teamhug.GlacialEpoch.Container.GE_ContainerButcherTable;
import de.teamhug.GlacialEpoch.Container.GE_ContainerCampFire;
import de.teamhug.GlacialEpoch.Container.GE_ContainerClayFurnace;
import de.teamhug.GlacialEpoch.Registry.GE_GuiRegistry;
import de.teamhug.GlacialEpoch.TileEntities.GE_TileEntityButcherTable;
import de.teamhug.GlacialEpoch.TileEntities.GE_TileEntityCampFire;
import de.teamhug.GlacialEpoch.TileEntities.GE_TileEntityClayFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GE_GuiHandler implements IGuiHandler {
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
		
		switch(ID) {
		case GE_GuiRegistry.guiCampFire:
			//System.out.println("Test Container 1");
			if (te instanceof GE_TileEntityCampFire) {
				//System.out.println("Test Container 2");
				return new GE_ContainerCampFire(player.inventory, (GE_TileEntityCampFire)te);
			}
			break;
		case GE_GuiRegistry.guiButcherTable:
			if (te instanceof GE_TileEntityButcherTable) {
				return new GE_ContainerButcherTable(player.inventory, (GE_TileEntityButcherTable)te);
			}
			break;
		case GE_GuiRegistry.guiClayFurnace:
				if (te instanceof GE_TileEntityClayFurnace) {
					return new GE_ContainerClayFurnace(player.inventory, (GE_TileEntityClayFurnace)te);
				}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
		
		switch(ID) {
		case GE_GuiRegistry.guiCampFire:
			//System.out.println("Test GUI 1");
			if (te instanceof GE_TileEntityCampFire) {
				//System.out.println("Test GUI 2");
				return new GE_GuiCampFire(player.inventory, (GE_TileEntityCampFire)te);
			}
			break;
		case GE_GuiRegistry.guiButcherTable:
			if (te instanceof GE_TileEntityButcherTable) {
				return new GE_GuiButcherTable(player.inventory, (GE_TileEntityButcherTable)te);
			}
			break;
		case GE_GuiRegistry.guiClayFurnace:
			if (te instanceof GE_TileEntityClayFurnace) {
				return new GE_GuiClayFurnace(player.inventory, (GE_TileEntityClayFurnace)te);
			}
		}
		return null;
	}
}
