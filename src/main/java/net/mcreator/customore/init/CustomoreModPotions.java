/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.customore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.customore.CustomoreMod;

public class CustomoreModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, CustomoreMod.MODID);
	public static final DeferredHolder<Potion, Potion> POTION_OF_EXPLODING = REGISTRY.register("potion_of_exploding", () -> new Potion("potion_of_exploding", new MobEffectInstance(CustomoreModMobEffects.CURSE_OF_EXPLODING, 100, 0, false, false)));
}