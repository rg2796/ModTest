package com.robert.elevators.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.rmi.registry.Registry;

/**
 * Created by Robert on 07/09/2014.
 */
public class Recipes {
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.mapleLeaf), " s ","sss"," s ",'s',"stickWood"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.flag),new ItemStack(Items.dye, 1, 1),new ItemStack(Items.dye, 1, 11),new ItemStack(Blocks.lapis_block),new ItemStack(Blocks.wool)));

    }
}
