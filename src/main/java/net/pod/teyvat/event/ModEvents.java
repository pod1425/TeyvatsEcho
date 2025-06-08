package net.pod.teyvat.event;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.entity.living.LivingEquipmentChangeEvent;
import net.pod.teyvat.TeyvatEcho;
import net.pod.teyvat.registries.ModAttachments;

//@EventBusSubscriber(modid = TeyvatEcho.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public void attachStats(EntityJoinLevelEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof LivingEntity) {
            System.out.println("Attaching stats to entity " + entity.toString());
            entity.getData(ModAttachments.ELEMENTAL_MASTERY);
            entity.getData(ModAttachments.HEALING_BONUS);
            entity.getData(ModAttachments.SHIELD_STRENGTH);
            entity.getData(ModAttachments.ELEMENTAL_DAMAGE_BONUS);
            entity.getData(ModAttachments.INFUSION);
        }

        
    }

    @SubscribeEvent
    public void onEquipmentChange(LivingEquipmentChangeEvent event) {
        System.out.println("LivingEquipmentChangeEvent!");
        System.out.println(event.getFrom());
        System.out.println(event.getTo());
    }

}
