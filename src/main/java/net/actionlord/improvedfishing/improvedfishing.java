package net.actionlord.improvedfishing;

import net.actionlord.improvedfishing.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class improvedfishing implements ModInitializer {
	public static final String MOD_ID = "improvedfishing";
	public static final Logger LOGGER = LoggerFactory.getLogger("improved-fishing");
	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}