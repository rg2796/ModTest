package com.robert.elevators.init;

import com.robert.elevators.block.BlockFlag;
import com.robert.elevators.block.BlockGen;
import com.robert.elevators.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Robert on 05/09/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockGen flag=new BlockFlag();

    public static  void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
