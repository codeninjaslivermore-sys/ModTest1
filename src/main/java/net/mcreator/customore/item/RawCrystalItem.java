package net.mcreator.customore.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RawCrystalItem extends Item {
	public RawCrystalItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(-1).saturationModifier(0.3f).alwaysEdible().build()));
	}
}