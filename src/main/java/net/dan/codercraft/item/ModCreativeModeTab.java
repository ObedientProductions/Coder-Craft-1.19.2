package net.dan.codercraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab CODERCRAFT_TAB = new CreativeModeTab("codercraft-tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PCB.get());
        }
    };
}
