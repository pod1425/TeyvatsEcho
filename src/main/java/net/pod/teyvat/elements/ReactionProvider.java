package net.pod.teyvat.elements;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Mob;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ReactionProvider {
    private Map<MobEffect, Consumer<ReactionContext>> reactions;
    private boolean frozen;
    public ReactionProvider() {
        reactions = new HashMap<>();
        frozen = false;
    }

    public void addReaction(MobEffect effect, Consumer<ReactionContext> contextConsumer) {
        if (frozen) return;

        reactions.put(effect, contextConsumer);
    }

    public Consumer<ReactionContext> getReactionResult(MobEffect appliedEffect) {
        return reactions.get(appliedEffect);
    }
}
