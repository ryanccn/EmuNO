package dev.ryanccn.emuno;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmuNOMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("emuno");

	@Override
	public void onInitialize() {
		LOGGER.info("EmuNO has initialized! Enjoy gaming :D");
	}
}
