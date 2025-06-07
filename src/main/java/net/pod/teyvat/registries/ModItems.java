package net.pod.teyvat.registries;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pod.teyvat.TeyvatEcho;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TeyvatEcho.MODID);

    public static final DeferredItem<Item> PYRO_SPLASH_POTION = ITEMS.registerItem("pyro_splash_potion",
            Item::new);
    public static final DeferredItem<Item> ELECTRO_SPLASH_POTION = ITEMS.registerItem("electro_splash_potion",
            Item::new);
    public static final DeferredItem<Item> HYDRO_SPLASH_POTION = ITEMS.registerItem("hydro_splash_potion",
            Item::new);
    public static final DeferredItem<Item> CRYO_SPLASH_POTION = ITEMS.registerItem("cryo_splash_potion",
            Item::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
