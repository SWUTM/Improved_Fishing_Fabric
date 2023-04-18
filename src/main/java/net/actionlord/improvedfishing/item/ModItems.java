package net.actionlord.improvedfishing.item;

import net.actionlord.improvedfishing.improvedfishing;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ADVANCED_STRING = registerItem("advanced_string",
            new Item(new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item WOODEN_HOOK = registerItem("wooden_hook",
            new Item(new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item STONE_HOOK = registerItem("stone_hook",
            new Item(new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item IRON_HOOK = registerItem("iron_hook",
            new Item(new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item COPPER_HOOK = registerItem("copper_hook",
            new Item(new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item GOLD_HOOK = registerItem("gold_hook",
            new Item(new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item DIAMOND_HOOK = registerItem("diamond_hook",
            new Item(new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item NETHERITE_HOOK = registerItem("netherite_hook",
            new Item(new FabricItemSettings().group(ItemGroup.TOOLS)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(improvedfishing.MOD_ID, name), item);
    }

    public static void registerModItems() {
        improvedfishing.LOGGER.debug("Registering Mod Items for " + improvedfishing.MOD_ID);
    }
}
