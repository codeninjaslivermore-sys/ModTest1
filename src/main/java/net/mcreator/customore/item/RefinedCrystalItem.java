package net.mcreator.customore.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RefinedCrystalItem extends Item {
	public RefinedCrystalItem(Item.Properties properties) {
		super(properties.fireResistant().food((new FoodProperties.Builder()).nutrition(-2).saturationModifier(10f).alwaysEdible().build()));
	}
}