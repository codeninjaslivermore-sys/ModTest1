/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.customore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.customore.potion.CurseOfExplodingMobEffect;
import net.mcreator.customore.CustomoreMod;

public class CustomoreModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, CustomoreMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> CURSE_OF_EXPLODING = REGISTRY.register("curse_of_exploding", CurseOfExplodingMobEffect::new);
}