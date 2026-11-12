/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.customore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.customore.item.*;
import net.mcreator.customore.CustomoreMod;

import java.util.function.Function;

public class CustomoreModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CustomoreMod.MODID);
	public static final DeferredItem<Item> RAW_CRYSTAL;
	public static final DeferredItem<Item> CRYSTAL_ORE;
	public static final DeferredItem<Item> REFINED_CRYSTAL;
	public static final DeferredItem<Item> CRYSTAL_ARMOR_HELMET;
	public static final DeferredItem<Item> CRYSTAL_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> CRYSTAL_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> CRYSTAL_ARMOR_BOOTS;
	public static final DeferredItem<Item> CRYSTALLINE_PICKAXE;
	public static final DeferredItem<Item> CRYSTALLINE_AXE;
	public static final DeferredItem<Item> RAW_CRYSTAL_BLOCK;
	public static final DeferredItem<Item> DIRT_ARMOR_HELMET;
	public static final DeferredItem<Item> DIRT_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> DIRT_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> DIRT_ARMOR_BOOTS;
	public static final DeferredItem<Item> CHRISTYLLINEFLOWER;
	static {
		RAW_CRYSTAL = register("raw_crystal", RawCrystalItem::new);
		CRYSTAL_ORE = block(CustomoreModBlocks.CRYSTAL_ORE);
		REFINED_CRYSTAL = register("refined_crystal", RefinedCrystalItem::new);
		CRYSTAL_ARMOR_HELMET = register("crystal_armor_helmet", CrystalArmorItem.Helmet::new);
		CRYSTAL_ARMOR_CHESTPLATE = register("crystal_armor_chestplate", CrystalArmorItem.Chestplate::new);
		CRYSTAL_ARMOR_LEGGINGS = register("crystal_armor_leggings", CrystalArmorItem.Leggings::new);
		CRYSTAL_ARMOR_BOOTS = register("crystal_armor_boots", CrystalArmorItem.Boots::new);
		CRYSTALLINE_PICKAXE = register("crystalline_pickaxe", CrystallinePickaxeItem::new);
		CRYSTALLINE_AXE = register("crystalline_axe", CrystallineAxeItem::new);
		RAW_CRYSTAL_BLOCK = block(CustomoreModBlocks.RAW_CRYSTAL_BLOCK);
		DIRT_ARMOR_HELMET = register("dirt_armor_helmet", DirtArmorItem.Helmet::new);
		DIRT_ARMOR_CHESTPLATE = register("dirt_armor_chestplate", DirtArmorItem.Chestplate::new);
		DIRT_ARMOR_LEGGINGS = register("dirt_armor_leggings", DirtArmorItem.Leggings::new);
		DIRT_ARMOR_BOOTS = register("dirt_armor_boots", DirtArmorItem.Boots::new);
		CHRISTYLLINEFLOWER = block(CustomoreModBlocks.CHRISTYLLINEFLOWER);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), () -> properties);
	}
}