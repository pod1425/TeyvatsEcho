package net.pod.teyvat.registries;

import com.mojang.serialization.Codec;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.pod.teyvat.TeyvatEcho;
import net.pod.teyvat.elements.basic.Pyro;

import java.util.function.Supplier;

public class ModAttachments {
    // Create the DeferredRegister for attachment types
    private static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(
            NeoForgeRegistries.ATTACHMENT_TYPES, TeyvatEcho.MODID);

    public static final Supplier<AttachmentType<Integer>> ELEMENTAL_MASTERY = ATTACHMENT_TYPES.register(
            "elemental_mastery", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build()
    );
    public static final Supplier<AttachmentType<Double>> ENERGY_RECHARGE = ATTACHMENT_TYPES.register(
            "energy_recharge", () -> AttachmentType.builder(() -> 100.0).serialize(Codec.DOUBLE).build()
    );
    public static final Supplier<AttachmentType<Double>> HEALING_BONUS = ATTACHMENT_TYPES.register(
            "healing_bonus", () -> AttachmentType.builder(() -> 0.0).serialize(Codec.DOUBLE).build()
    );
    public static final Supplier<AttachmentType<Double>> SHIELD_STRENGTH = ATTACHMENT_TYPES.register(
            "shield_strength", () -> AttachmentType.builder(() -> 0.0).serialize(Codec.DOUBLE).build()
    );
    public static final Supplier<AttachmentType<Double>> ELEMENTAL_DAMAGE_BONUS = ATTACHMENT_TYPES.register(
            "elemental_damage_bonus", () -> AttachmentType.builder(() -> 0.0).serialize(Codec.DOUBLE).build()
    );
    public static final Supplier<AttachmentType<String>> INFUSION = ATTACHMENT_TYPES.register(
            "infusion", () -> AttachmentType.builder(() -> "").serialize(Codec.STRING).build()
    );
    public static final Supplier<AttachmentType<Integer>> INFUSION_TICKS = ATTACHMENT_TYPES.register(
            "infusion_ticks", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build()
    );


    public static final Supplier<AttachmentType<Integer>> ENERGY = ATTACHMENT_TYPES.register(
            "energy", () -> AttachmentType.builder(() -> 0).serialize(Codec.INT).build()
    );
    public static final Supplier<AttachmentType<Integer>> ENERGY_COST = ATTACHMENT_TYPES.register(
            "energy_cost", () -> AttachmentType.builder(() -> 40).serialize(Codec.INT).build()
    );
    public static final Supplier<AttachmentType<Integer>> SKILL_COUNT = ATTACHMENT_TYPES.register(
            "skill_count", () -> AttachmentType.builder(() -> 1).serialize(Codec.INT).build()
    );
    public static final Supplier<AttachmentType<Integer>> SKILL_COOLDOWN = ATTACHMENT_TYPES.register(
            "skill_cooldown", () -> AttachmentType.builder(() -> 10).serialize(Codec.INT).build()
    );
    public static final Supplier<AttachmentType<Integer>> BURST_COOLDOWN = ATTACHMENT_TYPES.register(
            "burst_cooldown", () -> AttachmentType.builder(() -> 10).serialize(Codec.INT).build()
    );

    public static void register(IEventBus eventBus) {
        ATTACHMENT_TYPES.register(eventBus);
    }

}
