package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.common.network.NetworkRegistry;
import de.teamhug.GlacialEpoch.GE_Main;
import de.teamhug.GlacialEpoch.Guis.GE_GUIHandler;

public class GE_GUIRegistry {
	
	public static final int guiCampFire = 0;

	public static void registerGUIs()
	{
        NetworkRegistry.INSTANCE.registerGuiHandler(GE_Main.instance, new GE_GUIHandler());
	}
	
}
