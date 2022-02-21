package io.github.stereo528.srme;

import io.github.stereo528.srme.common.SheRaBlocks;
import io.github.stereo528.srme.util.LogManager;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;

public class SheRa implements ModInitializer {

    public static final String MOD_ID = "she-ra";
    public static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().getFriendlyString();
    public static final String MOD_NAME = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getName();

    /**
     * @param location String ID of the object you want to locate
     * @return returns the ResourceLocation of the object
     */
    public static ResourceLocation locate(String location) {
        if (location.contains(":")) {
            return new ResourceLocation(location);
        } else {
            return new ResourceLocation(MOD_ID, location);
        }
    }

    @Override
    public void onInitialize() {
        LogManager.log("dev_info", "In Dev Environment");

        LogManager.log("dev_info", "Loading Blocks");
        SheRaBlocks.init();
        LogManager.log("dev_info","Blocks Loaded");

        LogManager.log("dev_info", "Loading Items");
        LogManager.log("dev_info", "Loading Biomes");
        LogManager.log("info", "Mod Loaded");
    }
}
