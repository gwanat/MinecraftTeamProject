package net.ggmd.teamprojectmod.item;

import net.ggmd.teamprojectmod.TeamProjectMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TeamProjectMod.MOD_ID);
    public static final RegistryObject<Item> GLACIER_SHARD = ITEMS.register("glacier_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLACIER_INGOT = ITEMS.register("glacier_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BRICK = ITEMS.register("raw_brick",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
