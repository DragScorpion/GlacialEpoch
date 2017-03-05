package de.teamhug.GlacialEpoch.Guis;

import cpw.mods.fml.common.network.IGuiHandler;
import de.teamhug.GlacialEpoch.Container.GE_ContainerCampFire;
import de.teamhug.GlacialEpoch.Registry.GE_GUIRegistry;
import de.teamhug.GlacialEpoch.Tileentities.GE_TileentityCampFire;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GE_GUIHandler implements IGuiHandler {
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
		
		switch(ID) {
		case GE_GUIRegistry.guiCampFire:
			//System.out.println("Test Container 1");
			if (te instanceof GE_TileentityCampFire) {
				//System.out.println("Test Container 2");
				return new GE_ContainerCampFire(player.inventory, (GE_TileentityCampFire)te);
			}
			break;
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
		
		switch(ID) {
		case GE_GUIRegistry.guiCampFire:
			//System.out.println("Test GUI 1");
			if (te instanceof GE_TileentityCampFire) {
				//System.out.println("Test GUI 2");
				return new GE_GUICampFire(player.inventory, (GE_TileentityCampFire)te);
			}
			break;
		}
		return null;
	}
}
