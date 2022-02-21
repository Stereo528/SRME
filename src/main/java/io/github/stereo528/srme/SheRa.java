package io.github.stereo528.srme;

import io.github.stereo528.srme.common.SheRaBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SheRa implements ModInitializer {

    public static final String MOD_ID = "she-ra";
    public static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().getFriendlyString();
    public static final String MOD_NAME = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getName();

    public static final Logger LOGGER = LoggerFactory.getLogger("She-Ra: Minecraft Edition");

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

    /**
     * @param message String to pass into the logger
     */
    public static void debugLogger(String message) {
        if(FabricLoader.getInstance().isDevelopmentEnvironment()) {
            LOGGER.info(message);
        }
    }

    @Override
    public void onInitialize() {
        debugLogger("In a Dev Environment");
        debugLogger("Loading Blocks");
        SheRaBlocks.init();
    }
}
