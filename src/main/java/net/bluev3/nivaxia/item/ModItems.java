package net.bluev3.nivaxia.item;

import net.bluev3.nivaxia.Nivaxia;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item>  ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Nivaxia.MOD_ID);

    public static final RegistryObject<Item> BLUE_PETALS = ITEMS.register("blue_petals",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NIVAXIATAB)));
    public static final RegistryObject<Item> MINERAL = ITEMS.register("mineral",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NIVAXIATAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
