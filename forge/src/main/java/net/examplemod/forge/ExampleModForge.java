package net.examplemod.forge;

import dev.architectury.platform.forge.EventBuses;
import io.gabezerbe.simplydivine.SimplyDivine;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SimplyDivine.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(SimplyDivine.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        SimplyDivine.init();
    }
}
