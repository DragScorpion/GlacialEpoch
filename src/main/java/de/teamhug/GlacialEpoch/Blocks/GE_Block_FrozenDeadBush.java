package de.TeamHUG.GlacialEpoch.Blocks;

import de.TeamHUG.GlacialEpoch.Main;
import de.TeamHUG.GlacialEpoch.Utilities.MainUtilities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class GE_Block_FrozenDeadBush extends BlockBush {
public IIcon[] icons = new IIcon[6];

	public GE_Block_FrozenDeadBush(String unlocalizedName) {
		super(Material.vine);
        float f = 0.4F;
        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(MainUtilities.tabGlacialEpoch);
        this.setHardness(0.0f);
        this.setHarvestLevel(null, 0);
        this.setStepSound(soundTypeGrass);
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
        
	}

}
