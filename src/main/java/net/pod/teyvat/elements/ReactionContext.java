package net.pod.teyvat.elements;

import net.minecraft.world.entity.LivingEntity;

public class ReactionContext {
    private LivingEntity target;
    private LivingEntity driver;

    public ReactionContext(LivingEntity target, LivingEntity driver) {
        this.target = target;
        this.driver = driver;
    }

    public LivingEntity getTarget() {
        return target;
    }

    public LivingEntity getDriver() {
        return driver;
    }
}
