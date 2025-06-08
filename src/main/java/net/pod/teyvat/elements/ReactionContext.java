package net.pod.teyvat.elements;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;

public class ReactionContext {
    private LivingIncomingDamageEvent triggerEvent;

    public ReactionContext(LivingIncomingDamageEvent triggerEvent) {
        this.triggerEvent = triggerEvent;
    }

    public Entity getTarget() {
        return triggerEvent.getEntity();
    }

    public Entity getDriver() {
        return triggerEvent.getSource().getEntity();
    }

    public float getDamage() {
        return triggerEvent.getAmount();
    }

    public void setDamage(float newDamage) {
        triggerEvent.setAmount(newDamage);
    }

    public LivingIncomingDamageEvent getTriggerEvent() {
        return triggerEvent;
    }
}
