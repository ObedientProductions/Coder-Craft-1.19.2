package net.dan.codercraft.item;

import net.dan.codercraft.CoderCraft;
import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.EnchantedGoldenAppleItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems  {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CoderCraft.MOD_ID);

    public static final RegistryObject<Item> PCB = ITEMS.register("pcb",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CODERCRAFT_TAB)));

    public static final RegistryObject<Item> WAFER = ITEMS.register("wafer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CODERCRAFT_TAB)));

    public static final RegistryObject<Item> SILICON = ITEMS.register("silicon",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(1)
                            .saturationMod(1)
                            .alwaysEat()
                            .effect(() -> new MobEffectInstance(MobEffects.POISON, 4 * 20, 2), 1.0F)
                            .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 4 * 20, 2), 1.0F)
                            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 4 * 20, 2), 1.0F)
                            .effect(() -> new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 4 * 20, 2), 1.0F)
                            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 4 * 20, 2), 1.0F)
                            .build())

                    .tab(ModCreativeModeTab.CODERCRAFT_TAB)));








    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
