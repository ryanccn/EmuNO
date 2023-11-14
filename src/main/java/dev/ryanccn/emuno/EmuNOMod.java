package dev.ryanccn.emuno;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmuNOMod implements ClientModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("emuno");
	@Override
	public void onInitializeClient() {
		LOGGER.info("EmuNO has initialized! Enjoy gaming :D");
	}
}
