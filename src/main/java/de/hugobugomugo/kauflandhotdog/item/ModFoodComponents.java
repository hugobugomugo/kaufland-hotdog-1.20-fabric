package de.hugobugomugo.kauflandhotdog.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent KAUFLAND_HOTDOG = new FoodComponent.Builder()
            .hunger(8)
            .saturationModifier(0.6f)
            .meat()
            .build();
}
