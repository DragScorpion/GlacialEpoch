package de.teamhug.GlacialEpoch.Blocks;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import de.teamhug.GlacialEpoch.GE_Main;
import de.teamhug.GlacialEpoch.Registry.GE_GUIRegistry;
import de.teamhug.GlacialEpoch.TileEntities.GE_TileEntityCampFire;
import de.teamhug.GlacialEpoch.Util.GE_CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GE_BlockCampFire extends BlockContainer {

	public GE_BlockCampFire(String unlocalizedName, Material material)
    {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(GE_Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(GE_CreativeTabs.tabGEBlocks);
        this.setHardness(2.0f);
		this.setResistance(15.0f);
		this.setHarvestLevel("axe", 1);
		this.setStepSound(soundTypeWood);
    }

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new GE_TileEntityCampFire();
	}
	
	@Override
	public void onBlockPlacedBy(World world, int xCoord, int yCoord, int zCoord, EntityLivingBase placer, ItemStack stack) {
		super.onBlockPlacedBy(world, xCoord, yCoord, zCoord, placer, stack);
	}
	
	@Override
	public void breakBlock(World world, int xCoord, int yCoord, int zCoord, Block block, int state) {
		GE_TileEntityCampFire te = (GE_TileEntityCampFire)world.getTileEntity(xCoord, yCoord, zCoord);
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
			FMLNetworkHandler.openGui(player, GE_Main.instance, GE_GUIRegistry.guiCampFire, world, x, y, z);
		}
		return true;
	}
	
}
