package net.pod.teyvat.elements.basic;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.pod.teyvat.elements.ReactionContext;
import net.pod.teyvat.elements.ReactionProvider;

import java.util.function.Consumer;

public abstract class ElementalEffect extends MobEffect {
    protected ReactionProvider reactionProvider;

    protected ElementalEffect(MobEffectCategory category, int color) {
        super(category, color);
        reactionProvider = new ReactionProvider();
    }

    public abstract void initReactionProvider();
    public abstract boolean isReaction();
    public abstract boolean isReactive();
    public boolean reactWith(ElementalEffect effect, ReactionContext context) {
        Consumer<ReactionContext> contextConsumer = reactionProvider.getReactionResult(effect);
        if (contextConsumer == null) {
            return false;
        }
        contextConsumer.accept(context);
        return true;
    }
}
