package net.pod.teyvat.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pod.teyvat.TeyvatEcho;
import net.pod.teyvat.elements.ElementColors;
import net.pod.teyvat.elements.basic.*;
import net.pod.teyvat.elements.reaction.*;

import java.util.function.Supplier;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(Registries.MOB_EFFECT, TeyvatEcho.MODID);

    public static final Supplier<MobEffect> ANEMO = MOB_EFFECTS.register(
            "anemo", () -> new Anemo(MobEffectCategory.NEUTRAL, ElementColors.ANEMO.get())
    );
    public static final Supplier<MobEffect> CRYO = MOB_EFFECTS.register(
            "cryo", () -> new Cryo(MobEffectCategory.NEUTRAL, ElementColors.CRYO.get())
    );
    public static final Supplier<MobEffect> DENDRO = MOB_EFFECTS.register(
            "dendro", () -> new Dendro(MobEffectCategory.NEUTRAL, ElementColors.DENDRO.get())
    );
    public static final Supplier<MobEffect> ELECTRO = MOB_EFFECTS.register(
            "electro", () -> new Electro(MobEffectCategory.NEUTRAL, ElementColors.ELECTRO.get())
    );
    public static final Supplier<MobEffect> GEO = MOB_EFFECTS.register(
            "geo", () -> new Geo(MobEffectCategory.NEUTRAL, ElementColors.GEO.get())
    );
    public static final Supplier<MobEffect> HYDRO = MOB_EFFECTS.register(
            "hydro", () -> new Hydro(MobEffectCategory.NEUTRAL, ElementColors.HYDRO.get())
    );
    public static final Supplier<MobEffect> PYRO = MOB_EFFECTS.register(
            "pyro", () -> new Pyro(MobEffectCategory.NEUTRAL, ElementColors.PYRO.get())
    );

    public static final Supplier<MobEffect> BLOOM = MOB_EFFECTS.register(
            "bloom", () -> new Bloom(MobEffectCategory.NEUTRAL, ElementColors.DENDRO.get())
    );
    public static final Supplier<MobEffect> BURNING = MOB_EFFECTS.register(
            "burning", () -> new Burning(MobEffectCategory.HARMFUL, ElementColors.PYRO.get())
    );
    public static final Supplier<MobEffect> CRYSTALLIZE = MOB_EFFECTS.register(
            "crystallize", () -> new Crystallize(MobEffectCategory.NEUTRAL, ElementColors.GEO.get())
    );
    public static final Supplier<MobEffect> FROZEN = MOB_EFFECTS.register(
            "frozen", () -> new Frozen(MobEffectCategory.HARMFUL, ElementColors.CRYO.get())
    );
    public static final Supplier<MobEffect> MELT = MOB_EFFECTS.register(
            "melt", () -> new Melt(MobEffectCategory.HARMFUL, ElementColors.CRYO.get())
    );
    public static final Supplier<MobEffect> OVERLOADED = MOB_EFFECTS.register(
            "overloaded", () -> new Overloaded(MobEffectCategory.HARMFUL, ElementColors.PYRO.get())
    );
    public static final Supplier<MobEffect> QUICKEN = MOB_EFFECTS.register(
            "quicken", () -> new Quicken(MobEffectCategory.NEUTRAL, ElementColors.DENDRO.get())
    );
    public static final Supplier<MobEffect> SUPERCONDUCT = MOB_EFFECTS.register(
            "superconduct", () -> new Superconduct(MobEffectCategory.HARMFUL, ElementColors.ELECTRO.get())
    );
    public static final Supplier<MobEffect> SWIRL = MOB_EFFECTS.register(
            "swirl", () -> new Swirl(MobEffectCategory.HARMFUL, ElementColors.ANEMO.get())
    );
    public static final Supplier<MobEffect> VAPORIZE = MOB_EFFECTS.register(
            "vaporize", () -> new Vaporize(MobEffectCategory.HARMFUL, ElementColors.HYDRO.get())
    );

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
