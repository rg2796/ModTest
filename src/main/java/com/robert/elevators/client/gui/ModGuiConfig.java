package com.robert.elevators.client.gui;

import com.robert.elevators.Handler.ConfigurationHandler;
import com.robert.elevators.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

/**
 * Created by Robert on 02/09/2014.
 */
public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen parentScreen)
    {
    super(parentScreen,
        new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
    Reference.MOD_ID,  false, false,
        GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
