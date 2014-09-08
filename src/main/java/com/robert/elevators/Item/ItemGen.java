package com.robert.elevators.Item;

import com.robert.elevators.creativetab.CreativeTabElevators;
import com.robert.elevators.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Robert on 03/09/2014.
 */
public class ItemGen extends Item
{
    public ItemGen()
    {
        super();
        this.setCreativeTab(CreativeTabElevators.Elevators_TAB);

    }

    @Override
    public String getUnlocalizedName()
    {
         return String.format("item.%s%s", Reference.MOD_ID.toLowerCase()+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase()+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon=iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
    }


    protected String getUnwrappedUnlocalizedName(String unlocalizesName)
    {
        return unlocalizesName.substring(unlocalizesName.indexOf(".")+1);
    }
}
