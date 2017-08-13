package de.teamhug.GlacialEpoch.Blocks;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import de.teamhug.GlacialEpoch.GE_Main;
import de.teamhug.GlacialEpoch.Registry.GE_GuiRegistry;
import de.teamhug.GlacialEpoch.TileEntities.GE_TileEntityClayFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class GE_BlockClayFurnace extends BlockContainer {
	
	public IIcon[] icons = new IIcon[2];
	
	public GE_BlockClayFurnace(Material material)
    {
        super(material);
        this.setHardness(2.0f);
		this.setResistance(15.0f);
		this.setStepSound(soundTypeStone);
    }
	
	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new GE_TileEntityClayFurnace();
	
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		if (side == meta+2)
			return this.icons[0];
		else
			return this.icons[1];
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		icons[0] = reg.registerIcon(this.textureName + "_face");
		icons[1] = reg.registerIcon(this.textureName + "_wall");
	}

	@Override
	public void breakBlock(World world, int xCoord, int yCoord, int zCoord, Block block, int state) {
		GE_TileEntityClayFurnace te = (GE_TileEntityClayFurnace)world.getTileEntity(xCoord, yCoord, zCoord);
		float motion = 0.7F;
		double motionX = (world.rand.nextFloat() * motion) + (1.0F - motion) * 0.5D;
		double motionY = (world.rand.nextFloat() * motion) + (1.0F - motion) * 0.5D;
		double motionZ = (world.rand.nextFloat() * motion) + (1.0F - motion) * 0.5D;
		for (int i = 0; i < te.getSizeInventory(); i++) {
			if (te.getStackInSlot(i) == null) continue;
			EntityItem entityItem = new EntityItem(world, xCoord + motionX, yCoord + motionY, zCoord + motionZ, te.getStackInSlot(i));
			world.spawnEntityInWorld(entityItem);
		}
		te.blockMetadata = 1;
		super.breakBlock(world, xCoord, yCoord, zCoord, block, state);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			FMLNetworkHandler.openGui(player, GE_Main.instance, GE_GuiRegistry.guiClayFurnace, world, x, y, z);
		}
		return true;
	}

	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
		float yaw = entity.getRotationYawHead();
		int dir = 0;
		if (yaw < 0) {
			yaw = (float) (yaw - 360*Math.floor(yaw / 360));
		}
		
		if (yaw >= 45 && yaw < 135) {
			dir = 3;
		}
		if (yaw >= 135 && yaw < 225) {
			dir = 1;
		}
		if (yaw >= 225 && yaw < 315) {
			dir = 2;
		}
		if ((yaw >= 315 && yaw <= 360) || (yaw >= 0 && yaw < 45)) {
			dir = 0;
		}
		
		//System.out.println("block: " + dir);
		world.setBlockMetadataWithNotify(x, y, z, dir, 3);
	}
	
	

}
