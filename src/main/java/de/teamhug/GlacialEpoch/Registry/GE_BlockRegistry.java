package de.teamhug.GlacialEpoch.Registry;

import de.henny022.HennyLib.api.HennyLibRegistry;
import de.teamhug.GlacialEpoch.Blocks.*;
import net.minecraft.block.Block;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_BlockRegistry
{
    @HennyLibRegistry.Block
    public static Block blockDummyBlock;

    @HennyLibRegistry.Block(constructorArg = 0, creativeTab = "none")
    public static Block blockBush;
    @HennyLibRegistry.Block(material = "ice", blockClass = GE_BlockFrozenDeadWood.class)
    @HennyLibRegistry.Fuel(burnTime = 200)
    public static Block blockFrozenDeadWood;

    @HennyLibRegistry.Block(blockClass = GE_BlockCampFire.class, effectiveTool = "axe", harvestLevel = 1)
    public static Block blockCampFire;
    @HennyLibRegistry.Block(material = "clay", blockClass = GE_BlockClayFurnace.class, effectiveTool = "pickaxe", harvestLevel = 2)
    public static Block blockClayFurnace;
    @HennyLibRegistry.Block(blockClass = GE_BlockButcherTable.class, creativeTab = "tabGEButcher", effectiveTool = "pickaxe", harvestLevel = 2)
    public static Block blockButcherTable;

    @HennyLibRegistry.Block(blockClass = GE_BlockPistonBlock.class, effectiveTool = "pickaxe", harvestLevel = 1)
    public static Block blockPistonBlock;

    @HennyLibRegistry.Block(blockClass = GE_BlockStrawBed.class, creativeTab = "none")
    public static Block blockStrawBed;

}
