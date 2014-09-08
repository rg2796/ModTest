package com.robert.elevators;

import com.robert.elevators.Handler.ConfigurationHandler;
import com.robert.elevators.client.handler.KeyInputEventHandler;
import com.robert.elevators.init.ModBlocks;
import com.robert.elevators.init.ModItems;
import com.robert.elevators.init.Recipes;
import com.robert.elevators.proxy.IProxy;
import com.robert.elevators.reference.Reference;
import com.robert.elevators.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

/**
 * Created by Robert on 01/09/2014.
 */
@Mod(modid= Reference.MOD_ID,name=Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class elevators {

    @Mod.Instance(Reference.MOD_ID)
    public static elevators instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide =Reference.SERVER_PROXY_CLASS )
    public static IProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        proxy.registerKeyBindings();

        LogHelper.info("Pre Init Complete!");

        ModItems.init();

        ModBlocks.init();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());


        LogHelper.info("Init Complete!");
        Recipes.init();
    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {

    }
}
