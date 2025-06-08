package net.pod.teyvat.event;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.EntityHitResult;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.entity.living.LivingEquipmentChangeEvent;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.neoforge.event.entity.player.AttackEntityEvent;
import net.pod.teyvat.TeyvatEcho;
import net.pod.teyvat.elements.ElementalHelper;
import net.pod.teyvat.elements.ReactionContext;
import net.pod.teyvat.elements.basic.ElementalEffect;
import net.pod.teyvat.registries.ModAttachments;
import net.pod.teyvat.registries.ModEffects;


public class ModCombatEvents {

    @SubscribeEvent
    public void onLivingDamage(LivingIncomingDamageEvent event) {
        Entity attacker = event.getSource().getEntity();
        System.out.println(attacker + " attacks " + event.getEntity());
        if (attacker == null) return;
        if (!attacker.hasData(ModAttachments.INFUSION)) return;
        if (attacker.getData(ModAttachments.INFUSION).equals("")) return;

        System.out.println("Infusion detected!");
        ElementalEffect infusedElement = (ElementalEffect) ElementalHelper
                .getElementalEffect(attacker.getData(ModAttachments.INFUSION));

        var effects = event.getEntity().getActiveEffects();
        for (var effect : effects) {
            if (effect.getEffect().value() instanceof ElementalEffect elementalEffect
                && elementalEffect.isReactive()) {
                System.out.println("Applying reaction...");
                elementalEffect.reactWith(infusedElement, new ReactionContext(event));
                return;
            }
        }
        System.out.println("Applying effect...");
        event.getEntity().addEffect(new MobEffectInstance(Holder.direct(infusedElement), 200));
    }
}
