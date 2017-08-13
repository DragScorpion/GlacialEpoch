package de.teamhug.GlacialEpoch.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class GE_BlockPistonBlock extends Block {
public IIcon[] icons = new IIcon[6];
	
	public GE_BlockPistonBlock() {
		super(Material.rock);												//Abbausound des Blockes
		this.setHardness(2.0f);												//Block Haerte
		this.setResistance(10.0f);											//Resistenz
		this.setStepSound(soundTypeStone);									//Geraeusche
		this.setBlockBounds(0, 0, 0, 1, 1, 1);								//Block Groesse
		this.setLightOpacity(15);											//Blocktransparaenz
	
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