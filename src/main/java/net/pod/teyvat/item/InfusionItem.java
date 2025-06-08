package net.pod.teyvat.item;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.pod.teyvat.registries.ModAttachments;

public class InfusionItem extends Item {
    private String infusionElement;
    public InfusionItem(Properties properties, String infusionElement) {
        super(properties);
        this.infusionElement = infusionElement;
    }

    @Override
    public InteractionResult onItemUseFirst(ItemStack stack, UseOnContext context) {
        context.getPlayer().setData(ModAttachments.INFUSION, infusionElement);
        System.out.println("Used infusion item! " + infusionElement);
        return super.onItemUseFirst(stack, context);
    }
}
