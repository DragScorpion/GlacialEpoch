package de.teamhug.GlacialEpoch.Util;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import de.henny022.HennyLib.api.HennyLibRegistry;
import de.teamhug.GlacialEpoch.Registry.GE_ItemButcherMod;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

@HennyLibRegistry.Event
public class GE_MobDropsHandler
{
    @SubscribeEvent
    public void onMobDrops(LivingDropsEvent event)
    {
        //Cow
        if(event.entity instanceof EntityCow)
        {
            event.drops.clear();

            ItemStack stack = new ItemStack(GE_ItemButcherMod.itemCadaverCow);
            EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);

            event.drops.add(drop);
        }
    }
}


