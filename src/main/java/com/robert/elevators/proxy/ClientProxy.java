package com.robert.elevators.proxy;

import com.robert.elevators.client.settings.Keybindings;
import cpw.mods.fml.client.registry.ClientRegistry;

/**
 * Created by Robert on 01/09/2014.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void registerKeyBindings()
    {
        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);

    }
}
