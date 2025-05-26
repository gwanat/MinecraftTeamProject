package net.ggmd.teamprojectmod.item;

import net.ggmd.teamprojectmod.TeamProjectMod;
import net.ggmd.teamprojectmod.item.custom.ModFoods;
import net.minecraft.world.item.ArmorItem;
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

    public static final RegistryObject<Item> GLACIER_HELMET = ITEMS.register("glacier_helmet",
            () -> new ArmorItem(ModArmorMaterials.GLACIER_INGOT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GLACIER_CHESTPLATE = ITEMS.register("glacier_chestplate",
            () -> new ArmorItem(ModArmorMaterials.GLACIER_INGOT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> GLACIER_LEGGINS = ITEMS.register("glacier_leggins",
            () -> new ArmorItem(ModArmorMaterials.GLACIER_INGOT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> GLACIER_BOOTS = ITEMS.register("glacier_boots",
            () -> new ArmorItem(ModArmorMaterials.GLACIER_INGOT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> WSIZSANWICH = ITEMS.register("wsizsandwich",
            () -> new Item(new Item.Properties().food(ModFoods.WSIZSANDWICH)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
