package dev.ryanccn;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmuNO implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("emuno");
	@Override
	public void onInitializeClient() {
		LOGGER.info("EmuNO initialized");
	}
}