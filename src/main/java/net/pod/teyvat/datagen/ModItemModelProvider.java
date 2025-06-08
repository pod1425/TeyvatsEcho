package net.pod.teyvat.datagen;


import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.pod.teyvat.TeyvatEcho;
import net.pod.teyvat.registries.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper fileHelper) {
        super(output, TeyvatEcho.MODID, fileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.PYRO_SPLASH_POTION.get());
        basicItem(ModItems.HYDRO_SPLASH_POTION.get());
        basicItem(ModItems.ELECTRO_SPLASH_POTION.get());
        basicItem(ModItems.CRYO_SPLASH_POTION.get());
        basicItem(ModItems.ANEMO_SPLASH_POTION.get());
        basicItem(ModItems.DENDRO_SPLASH_POTION.get());
        basicItem(ModItems.GEO_SPLASH_POTION.get());

    }
}
