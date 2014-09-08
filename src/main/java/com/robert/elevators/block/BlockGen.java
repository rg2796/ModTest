package com.robert.elevators.block;

import com.robert.elevators.creativetab.CreativeTabElevators;
import com.robert.elevators.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

/**
 * Created by Robert on 04/09/2014.
 */
public class BlockGen  extends Block{

    public BlockGen(Material material)
    {

        super(material);
        this.setCreativeTab(CreativeTabElevators.Elevators_TAB);

    }

    public BlockGen()
    {
        this(Material.rock);
        this.setCreativeTab(CreativeTabElevators.Elevators_TAB);
    }


    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase()+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }



    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
         blockIcon=iconRegister.registerIcon(String.format("%s",getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }


    protected String getUnwrappedUnlocalizedName(String unlocalizesName)
    {
        return unlocalizesName.substring(unlocalizesName.indexOf(".")+1);
    }
}
