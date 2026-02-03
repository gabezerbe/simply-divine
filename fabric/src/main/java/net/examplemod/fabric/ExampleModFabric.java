package net.examplemod.fabric;

import io.gabezerbe.simplydivine.SimplyDivine;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SimplyDivine.init();
    }
}
