package net.mcreator.customore.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.InstantenousMobEffect;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.customore.procedures.CurseExpodeProcedure;

public class CurseOfExplodingMobEffect extends InstantenousMobEffect {
	public CurseOfExplodingMobEffect() {
		super(MobEffectCategory.HARMFUL, -3407617);
	}

	@Override
	public void applyInstantenousEffect(ServerLevel level, Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		CurseExpodeProcedure.execute(level, entity.getX(), entity.getY(), entity.getZ());
	}
}