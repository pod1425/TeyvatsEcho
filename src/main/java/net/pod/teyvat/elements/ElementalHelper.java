package net.pod.teyvat.elements;

import net.minecraft.world.effect.MobEffect;
import net.pod.teyvat.elements.basic.ElementalEffect;
import net.pod.teyvat.registries.ModEffects;

import java.util.HashMap;
import java.util.Map;

public class ElementalHelper {
    private static Map<String, ElementalEffect> elements = new HashMap<>();
    private static Map<String, ElementalEffect> reactions = new HashMap<>();

    public static void init() {
        elements.put("anemo", (ElementalEffect) ModEffects.ANEMO.get());
        elements.put("cryo", (ElementalEffect) ModEffects.CRYO.get());
        elements.put("dendro", (ElementalEffect) ModEffects.DENDRO.get());
        elements.put("electro", (ElementalEffect) ModEffects.ELECTRO.get());
        elements.put("geo", (ElementalEffect) ModEffects.GEO.get());
        elements.put("hydro", (ElementalEffect) ModEffects.HYDRO.get());
        elements.put("pyro", (ElementalEffect) ModEffects.PYRO.get());
        for (var element : elements.values()) {
            element.initReactionProvider();
        }
        reactions.put("bloom", (ElementalEffect) ModEffects.BLOOM.get());
        reactions.put("burning", (ElementalEffect) ModEffects.BURNING.get());
        reactions.put("crystallize", (ElementalEffect) ModEffects.CRYSTALLIZE.get());
        reactions.put("frozen", (ElementalEffect) ModEffects.FROZEN.get());
        reactions.put("melt", (ElementalEffect) ModEffects.MELT.get());
        reactions.put("overloaded", (ElementalEffect) ModEffects.OVERLOADED.get());
        reactions.put("quicken", (ElementalEffect) ModEffects.QUICKEN.get());
        reactions.put("superconduct", (ElementalEffect) ModEffects.SUPERCONDUCT.get());
        reactions.put("swirl", (ElementalEffect) ModEffects.SWIRL.get());
        reactions.put("vaporize", (ElementalEffect) ModEffects.VAPORIZE.get());
        for (var reaction : reactions.values()) {
            reaction.initReactionProvider();
        }
    }

    public static MobEffect getElementalEffect(String element) {
        return elements.get(element.toLowerCase());
    }
}
