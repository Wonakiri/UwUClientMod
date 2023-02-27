package wonakiri.uwuclientmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//test if github works | 26.2.2023
public class UwUClientMod implements ModInitializer {
	public static final String MOD_ID = "uwu-client-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("uwu-client-mod");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello UwU world!");

	}
}