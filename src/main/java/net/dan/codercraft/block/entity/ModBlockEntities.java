package net.dan.codercraft.block.entity;

import net.dan.codercraft.CoderCraft;
import net.dan.codercraft.block.ModBlocks;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {

    public static DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CoderCraft.MOD_ID);

    public static final RegistryObject<BlockEntityType<FabricatorBlockEntity>> FABRICATOR_BLOCK = BLOCK_ENTITIES.register("fabricator_block",
            ()-> BlockEntityType.Builder.of(FabricatorBlockEntity::new, ModBlocks.FABRICATION_BLOCK.get()).build(null));



    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
