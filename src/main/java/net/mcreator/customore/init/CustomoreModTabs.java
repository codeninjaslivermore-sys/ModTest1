/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.customore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.customore.CustomoreMod;

@EventBusSubscriber
public class CustomoreModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CustomoreMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(CustomoreModItems.RAW_CRYSTAL.get());
			tabData.accept(CustomoreModItems.REFINED_CRYSTAL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(CustomoreModItems.RAW_CRYSTAL.get());
			tabData.accept(CustomoreModItems.REFINED_CRYSTAL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(CustomoreModBlocks.CRYSTAL_ORE.get().asItem());
			tabData.accept(CustomoreModBlocks.CHRISTYLLINEFLOWER.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(CustomoreModItems.CRYSTAL_ARMOR_HELMET.get());
			tabData.accept(CustomoreModItems.CRYSTAL_ARMOR_CHESTPLATE.get());
			tabData.accept(CustomoreModItems.CRYSTAL_ARMOR_LEGGINGS.get());
			tabData.accept(CustomoreModItems.CRYSTAL_ARMOR_BOOTS.get());
			tabData.accept(CustomoreModItems.DIRT_ARMOR_HELMET.get());
			tabData.accept(CustomoreModItems.DIRT_ARMOR_CHESTPLATE.get());
			tabData.accept(CustomoreModItems.DIRT_ARMOR_LEGGINGS.get());
			tabData.accept(CustomoreModItems.DIRT_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CustomoreModItems.CRYSTALLINE_PICKAXE.get());
			tabData.accept(CustomoreModItems.CRYSTALLINE_AXE.get());
		}
	}
}