/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.customore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.customore.block.RawCrystalBlockBlock;
import net.mcreator.customore.block.CrystalOreBlock;
import net.mcreator.customore.block.ChristyllineflowerBlock;
import net.mcreator.customore.CustomoreMod;

import java.util.function.Function;

public class CustomoreModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CustomoreMod.MODID);
	public static final DeferredBlock<Block> CRYSTAL_ORE;
	public static final DeferredBlock<Block> RAW_CRYSTAL_BLOCK;
	public static final DeferredBlock<Block> CHRISTYLLINEFLOWER;
	static {
		CRYSTAL_ORE = register("crystal_ore", CrystalOreBlock::new);
		RAW_CRYSTAL_BLOCK = register("raw_crystal_block", RawCrystalBlockBlock::new);
		CHRISTYLLINEFLOWER = register("christyllineflower", ChristyllineflowerBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}