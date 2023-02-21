package net.dan.codercraft.item;

import net.dan.codercraft.CoderCraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CoderCraft.MOD_ID);

    public static final RegistryObject<Item> PCB = ITEMS.register("pcb",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CODERCRAFT_TAB)));

    public static final RegistryObject<Item> WAFER = ITEMS.register("wafer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CODERCRAFT_TAB)));








    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
