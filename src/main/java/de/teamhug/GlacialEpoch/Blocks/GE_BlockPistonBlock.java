package de.teamhug.GlacialEpoch.Blocks;

import de.teamhug.GlacialEpoch.GE_Main;
import de.teamhug.GlacialEpoch.Util.GE_CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class GE_BlockPistonBlock extends Block {
public IIcon[] icons = new IIcon[6];
	
	public GE_BlockPistonBlock(String unlocalizedName) {
		super(Material.rock);												//Abbausound des Blockes
		this.setBlockName(unlocalizedName);									//Blockname
		this.setBlockTextureName(GE_Main.MODID + ":" + unlocalizedName);	//Texture name
		this.setCreativeTab(GE_CreativeTabs.tabGEBlocks);					//Creative Tab
		this.setHardness(2.0f);												//Block Härte
		this.setResistance(10.0f);											//Resistenz
		this.setHarvestLevel("pickaxe", 1);									//Abbaulevel
		this.setStepSound(soundTypeStone);									//Gegeräusche
		this.setBlockBounds(0, 0, 0, 1, 1, 1);								//Block Größe
		this.setLightOpacity(15);											//Blockdurchlässigkeit
	
	}

	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < 6; i++) {
				if(i==0 || i==1) {
					this.icons[i] = reg.registerIcon(this.textureName + "_Top");
				}
				
				else {
					this.icons[i] = reg.registerIcon(this.textureName + "_Side");
				}
			
		}
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return this.icons[side];
	}
	
}