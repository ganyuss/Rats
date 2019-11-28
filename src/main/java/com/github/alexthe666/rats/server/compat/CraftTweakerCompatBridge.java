package com.github.alexthe666.rats.server.compat;

import com.github.alexthe666.rats.server.compat.crafttweaker.CraftTweakerCompat;
import net.minecraftforge.fml.ModLoader;

public class CraftTweakerCompatBridge {
    private static final String CT_MOD_ID = "crafttweaker";

    public static void loadTweakerCompat() {
        if (ModLoader.isModLoaded(CT_MOD_ID)) {
            CraftTweakerCompat.preInit();
        }
    }
}
