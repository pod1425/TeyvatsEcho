package net.pod.teyvat.elements.reaction;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.pod.teyvat.elements.basic.ElementalEffect;

public class Burning extends ElementalEffect {
    public Burning(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void initReactionProvider() {

    }

    @Override
    public boolean isReaction() {
        return true;
    }

    @Override
    public boolean isReactive() {
        return true;
    }

    @Override
    public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
        livingEntity.setRemainingFireTicks(20);
        return true;
        //return super.applyEffectTick(livingEntity, amplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}
