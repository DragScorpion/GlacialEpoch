package de.teamhug.GlacialEpoch.Items.Tools;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import de.teamhug.GlacialEpoch.GE_Main;
import de.teamhug.GlacialEpoch.Util.GE_CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

import java.util.Set;

/**
 * GlacialEpoch.git, Created by Henny on 19.05.2017.
 */
public class GE_PrimitiveTool extends ItemAxe
{
    private static Set effectiveAgainst = Sets.newHashSet(Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel,
            Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland,
            Blocks.soul_sand, Blocks.mycelium);

    public GE_PrimitiveTool()
    {
        super(GE_ToolMaterials.PRIMITIVE);
        this.setUnlocalizedName("GE_itemPrimitiveTool");
        this.setTextureName(GE_Main.MODID + ":GE_itemPrimitiveTool");
        this.setMaxStackSize(1);
        this.setCreativeTab(GE_CreativeTabs.tabGEItems);
    }

    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return ImmutableSet.of("axe", "spade");
    }

    @Override
    public boolean func_150897_b(Block block) {
        return effectiveAgainst.contains(block) || super.func_150897_b(block);
    }

    @Override
    public float func_150893_a(ItemStack stack, Block block) {
        if (block.getMaterial() == Material.wood || block.getMaterial() == Material.vine || block.getMaterial() == Material.plants)
            return this.efficiencyOnProperMaterial;
        return effectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.func_150893_a(stack, block);
    }

}
