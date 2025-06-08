package net.pod.teyvat.elements.basic;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class Hydro extends ElementalEffect {
    public Hydro(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void initReactionProvider() {

    }

    @Override
    public boolean isReaction() {
        return false;
    }

    @Override
    public boolean isReactive() {
        return true;
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
