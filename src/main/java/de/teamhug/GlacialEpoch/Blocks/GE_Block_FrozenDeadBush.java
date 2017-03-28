package de.teamhug.GlacialEpoch.Blocks;

import de.teamhug.GlacialEpoch.GE_Main;
import de.teamhug.GlacialEpoch.Util.GE_CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class GE_Block_FrozenDeadBush extends BlockBush {
public IIcon[] icons = new IIcon[6];

	public GE_Block_FrozenDeadBush(String unlocalizedName) {
		super(Material.vine);
        float f = 0.4F;
        this.setBlockTextureName(GE_Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(GE_CreativeTabs.tabGEBlocks);
        this.setHardness(0.0f);
        this.setHarvestLevel(null, 0);
        this.setStepSound(soundTypeGrass);
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
        
	}

}
