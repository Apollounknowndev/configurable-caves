package apollo.configurable.caves;

import org.slf4j.LoggerFactory;
import apollo.configurable.caves.worldgen.GenerateFiles;
import apollo.configurable.caves.config.ConfigurableCavesConfig;
import org.slf4j.Logger;
import net.fabricmc.api.ModInitializer;

public class ConfigurableCavesMod implements ModInitializer {
    public static final String MOD_ID = "configurable-caves";
    public static final Logger LOGGER = LoggerFactory.getLogger("configurable-caves");
    public static final ConfigurableCavesConfig CONFIG = ConfigurableCavesConfig.createAndLoad();
    
    public void onInitialize() {
        GenerateFiles.register();
        ConfigurableCavesMod.LOGGER.info("Configuring caves...");
    }
}