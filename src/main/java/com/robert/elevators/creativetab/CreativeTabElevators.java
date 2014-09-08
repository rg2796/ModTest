package com.robert.elevators.creativetab;

import com.robert.elevators.init.ModItems;
import com.robert.elevators.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Robert on 07/09/2014.
 */
public class CreativeTabElevators {
    public static final CreativeTabs Elevators_TAB=new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }

    };
}
