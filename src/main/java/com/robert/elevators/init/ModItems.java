package com.robert.elevators.init;

import com.robert.elevators.Item.ItemGen;
import com.robert.elevators.Item.ItemMapleLeaf;
import com.robert.elevators.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Robert on 03/09/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModItems {
    public static  final ItemGen mapleLeaf=new ItemMapleLeaf();


    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }


}
