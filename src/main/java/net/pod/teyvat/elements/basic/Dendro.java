package net.pod.teyvat.elements.basic;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.pod.teyvat.elements.ReactionProvider;
import net.pod.teyvat.registries.ModEffects;

public class Dendro extends ElementalEffect {
    public Dendro(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void initReactionProvider() {
        reactionProvider.addReaction(ModEffects.PYRO.get(), context -> {
            if (context.getTarget() instanceof LivingEntity livingEntity) {
                livingEntity.addEffect(new MobEffectInstance(Holder.direct(ModEffects.BURNING.get()), 40));
            }
        });
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
