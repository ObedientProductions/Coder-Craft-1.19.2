package net.dan.codercraft.block;

import net.dan.codercraft.CoderCraft;
import net.dan.codercraft.block.custom.FabricatorBlock;
import net.dan.codercraft.block.custom.SiliconLampBlock;
import net.dan.codercraft.item.ModCreativeModeTab;
import net.dan.codercraft.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CoderCraft.MOD_ID);


    public static final RegistryObject<Block> SILICON_ORE = registerBlock("silicon_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2, 18)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.CODERCRAFT_TAB);

    public static final RegistryObject<Block> SILICON_LAMP = registerBlock("silicon_lamp",
            () -> new SiliconLampBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2, 18)
                    .requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(SiliconLampBlock.LIT) ? 15 : 0)), ModCreativeModeTab.CODERCRAFT_TAB);

    public static final RegistryObject<Block> FABRICATION_BLOCK = registerBlock("fabrication_block",
            () -> new FabricatorBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2, 18)
                    .requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(SiliconLampBlock.LIT) ? 15 : 0)), ModCreativeModeTab.CODERCRAFT_TAB);









    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T>block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);

        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus bus){
        BLOCKS.register(bus);
    }
}
