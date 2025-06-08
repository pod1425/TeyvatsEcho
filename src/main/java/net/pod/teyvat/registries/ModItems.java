package net.pod.teyvat.registries;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pod.teyvat.TeyvatEcho;
import net.pod.teyvat.item.InfusionItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TeyvatEcho.MODID);

    public static final DeferredItem<Item> PYRO_SPLASH_POTION = ITEMS.registerItem("pyro_splash_potion",
            (properties) -> new InfusionItem(properties, "pyro"));
    public static final DeferredItem<Item> ELECTRO_SPLASH_POTION = ITEMS.registerItem("electro_splash_potion",
            (properties) -> new InfusionItem(properties, "electro"));
    public static final DeferredItem<Item> HYDRO_SPLASH_POTION = ITEMS.registerItem("hydro_splash_potion",
            (properties) -> new InfusionItem(properties, "hydro"));
    public static final DeferredItem<Item> CRYO_SPLASH_POTION = ITEMS.registerItem("cryo_splash_potion",
            (properties) -> new InfusionItem(properties, "cryo"));
    public static final DeferredItem<Item> DENDRO_SPLASH_POTION = ITEMS.registerItem("dendro_splash_potion",
            (properties) -> new InfusionItem(properties, "dendro"));
    public static final DeferredItem<Item> ANEMO_SPLASH_POTION = ITEMS.registerItem("anemo_splash_potion",
            (properties) -> new InfusionItem(properties, "anemo"));
    public static final DeferredItem<Item> GEO_SPLASH_POTION = ITEMS.registerItem("geo_splash_potion",
            (properties) -> new InfusionItem(properties, "geo"));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
