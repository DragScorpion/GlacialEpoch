package de.teamhug.GlacialEpoch.Registry;

import de.henny022.HennyLib.api.HennyLibRegistry;
import net.minecraft.item.Item;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
@HennyLibRegistry.ItemRegistry(creativeTab = "tabGEButcher")
public class GE_ItemButcherMod
{
    //Butcher
    //Cow
    @HennyLibRegistry.Item
    public static Item itemCadaverCow;     //Kuhkoerper
    @HennyLibRegistry.Item
    public static Item itemBovineHalf;    //Rinderhaelfte
    @HennyLibRegistry.Item
    public static Item itemBovineSkin;    //Rinderhaut
    @HennyLibRegistry.Item
    public static Item itemCowHead;        //Kuhkopf

    //Sheep
    @HennyLibRegistry.Item
    public static Item itemCadaverSheep;    //Schafkoerper
    @HennyLibRegistry.Item
    public static Item itemSheepSkin;        //Schafhaut
    @HennyLibRegistry.Item
    public static Item itemSheepHead;        //Schafkopf
    @HennyLibRegistry.Item
    public static Item itemSheepHalf;        //Schafhaelfte

    //Pig
    @HennyLibRegistry.Item
    public static Item itemCadaverPig;
    @HennyLibRegistry.Item
    public static Item itemPigSkin;
    @HennyLibRegistry.Item
    public static Item itemPigHead;
    @HennyLibRegistry.Item
    public static Item itemPigHalf;

    //Chicken
    @HennyLibRegistry.Item
    public static Item itemCadaverChicken;
    @HennyLibRegistry.Item
    public static Item itemChickenHead;

    //ButcherTools
    @HennyLibRegistry.Item(stacksize = 1)
    public static Item itemHidesCutter;        //Haeutemesser
    @HennyLibRegistry.Item(stacksize = 1)
    public static Item itemCuttingKnife;    //Stechmesser
    @HennyLibRegistry.Item(stacksize = 1)
    public static Item itemSlaughteringAxe;    //Schlachterbeil
    @HennyLibRegistry.Item(stacksize = 1)
    public static Item itemButchersKnife;    //Schlachtermesser
}
