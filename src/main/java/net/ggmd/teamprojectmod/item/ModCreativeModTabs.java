package net.ggmd.teamprojectmod.item;

import net.ggmd.teamprojectmod.TeamProjectMod;
import net.ggmd.teamprojectmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TeamProjectMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PROJECT_TAB = CREATIVE_MODE_TABS.register("project_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GLACIER_ORE.get()))
                    .title(Component.translatable("creativetab.project_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.GLACIER_ORE.get());
                        pOutput.accept(ModItems.GLACIER_SHARD.get());
                        pOutput.accept(ModItems.GLACIER_INGOT.get());
                        pOutput.accept(ModBlocks.GLACIER_BLOCK.get());
                        pOutput.accept(ModItems.GLACIER_HELMET.get());
                        pOutput.accept(ModItems.GLACIER_CHESTPLATE.get());
                        pOutput.accept(ModItems.GLACIER_LEGGINS.get());
                        pOutput.accept(ModItems.GLACIER_BOOTS.get());
                        pOutput.accept(ModItems.WSIZSANWICH.get());
                        pOutput.accept(ModItems.SUPER_SHOVEL.get());

                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}