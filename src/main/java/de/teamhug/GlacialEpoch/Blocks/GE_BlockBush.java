package de.teamhug.GlacialEpoch.Blocks;

import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.relauncher.Side;
import de.teamhug.GlacialEpoch.GE_Main;
import de.teamhug.GlacialEpoch.Util.GE_CreativeTabs;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;
import java.util.Random;

public class GE_BlockBush extends BlockBush {
    public static final String[][] types = new String[][] {{"frozenDeadBush"}};
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;
    private int typeID;


	public GE_BlockBush(String unlocalizedName, int _typeID) {
		super(Material.plants);
        //float f = 0.4F;
        this.setBlockName(unlocalizedName + "_" + _typeID);
        this.setBlockTextureName(GE_Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(GE_CreativeTabs.tabGEBlocks);
        this.setHardness(0.0f);
        //this.setHarvestLevel(null, 0);
        this.setStepSound(soundTypeGrass);
        //this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
        this.typeID = _typeID;
	}

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        if (meta >= this.icons.length)
        {
            meta = 0;
        }

        return this.icons[meta];
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.icons = new IIcon[types[this.typeID].length];

        for (int i = 0; i < this.icons.length; ++i)
        {
            this.icons[i] = reg.registerIcon(this.textureName + "_" + types[this.typeID][i]);
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int damage)
    {
        return damage;
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < this.icons.length; ++i) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random rand) {
        int randInt = rand.nextInt(3);
        return 1+randInt;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Items.stick;
    }
}
