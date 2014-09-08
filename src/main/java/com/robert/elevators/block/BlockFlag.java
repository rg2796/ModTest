package com.robert.elevators.block;

import com.robert.elevators.creativetab.CreativeTabElevators;
import net.minecraft.block.material.Material;

/**
 * Created by Robert on 05/09/2014.
 */
public class BlockFlag extends BlockGen{
    public BlockFlag()
    {
        super(Material.cloth);
        this.setBlockName("flag");
        this.setHardness(0.8f);
        this.setStepSound(soundTypeCloth);


    }
}
