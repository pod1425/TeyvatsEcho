package net.pod.teyvat.elements.reaction;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.pod.teyvat.elements.basic.ElementalEffect;

public class Bloom extends ElementalEffect {
    public Bloom(MobEffectCategory category, int color) {
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
        return false;
    }

    @Override
    public boolean applyEffectTick(LivingEntity livingEntity, int amplifier) {
        return true;
        //return super.applyEffectTick(livingEntity, amplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}
