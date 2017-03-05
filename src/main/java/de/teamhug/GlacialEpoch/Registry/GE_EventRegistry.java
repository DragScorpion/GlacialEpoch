package de.teamhug.GlacialEpoch.Registry;

import de.teamhug.GlacialEpoch.Util.GE_MobDropsHandler;
import net.minecraftforge.common.MinecraftForge;

/**
 * GlacialEpoch.git, Created by Henny on 05.03.2017.
 */
public class GE_EventRegistry
{
    public static void registerEvents()
    {
        MinecraftForge.EVENT_BUS.register(new GE_MobDropsHandler());
    }
}
