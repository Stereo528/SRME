package io.github.stereo528.srme.util;

import java.util.Objects;

import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogManager {
    public static final Logger LOGGER = LoggerFactory.getLogger("She-Ra: Minecraft Edition");

    /**
     * @param level Logger Level.
     *              accepts "info", "warn", "error", and "dev_info".
     *              if nothing is passed it defaults to "info".
     * @param message String to pass into the log
     */
    public static void log(String level, String message) {
        if(Objects.equals(level, "info")) {
            LOGGER.info(message);
        }
        else if(Objects.equals(level, "warn")) {
            LOGGER.warn(message);
        }
        else if(Objects.equals(level, "error")) {
            LOGGER.error(message);
        }
        else if(Objects.equals(level, "dev_info") && FabricLoader.getInstance().isDevelopmentEnvironment()) {
            LOGGER.info("[Dev Env] " + message);
        }
        else {
            LOGGER.info(message);
        }
    }
}
