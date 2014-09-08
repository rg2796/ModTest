package com.robert.elevators.client.settings;

import com.robert.elevators.reference.Names;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

/**
 * Created by Robert on 07/09/2014.
 */
public class Keybindings {
    public static KeyBinding charge=new KeyBinding(Names.Keys.CHARGE, Keyboard.KEY_C,Names.Keys.CATEGORY);
    public static KeyBinding release=new KeyBinding(Names.Keys.RELEASE, Keyboard.KEY_R ,Names.Keys.CATEGORY);


}
