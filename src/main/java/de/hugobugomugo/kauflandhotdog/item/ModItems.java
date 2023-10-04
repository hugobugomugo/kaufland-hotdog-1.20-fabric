package de.hugobugomugo.kauflandhotdog.item;

import de.hugobugomugo.kauflandhotdog.KauflandHotdog;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item KAUFLAND_HOTDOG = registerItem("kauflandhotdog", new Item(new FabricItemSettings().food(ModFoodComponents.KAUFLAND_HOTDOG)));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(KAUFLAND_HOTDOG);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(KauflandHotdog.MOD_ID, name), item);
    }
    public static void registerModItems() {
        KauflandHotdog.LOGGER.info("Registering Items for",KauflandHotdog.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
