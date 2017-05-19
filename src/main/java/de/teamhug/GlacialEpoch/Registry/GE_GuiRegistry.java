package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.common.network.NetworkRegistry;
import de.teamhug.GlacialEpoch.GE_Main;
import de.teamhug.GlacialEpoch.GraphicalUserInterfaces.GE_GuiHandler;

public class GE_GuiRegistry {
	
	public static final int guiCampFire = 0;
	public static final int guiButcherTable = 1;

	public static void registerGUIs()
	{
        NetworkRegistry.INSTANCE.registerGuiHandler(GE_Main.instance, new GE_GuiHandler());
	}
	
}
