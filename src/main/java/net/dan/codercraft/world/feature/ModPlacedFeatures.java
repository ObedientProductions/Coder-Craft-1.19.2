package net.dan.codercraft.world.feature;

import net.dan.codercraft.CoderCraft;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, CoderCraft.MOD_ID);

    public static final RegistryObject<PlacedFeature> SILICON_ORE_PLACED = PLACED_FEATURES.register("silicon_ore_placed",
            ()-> new PlacedFeature(ModConfiguredFeatures.SILICON_ORE.getHolder().get(),
                    commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(70))))); //Ore Y Placement Rance middle value is most common location ex -80 and 80 would be 0






    private static List<PlacementModifier> orePlacement(PlacementModifier placementModifier1, PlacementModifier placementModifier2) {
        return List.of(placementModifier1, InSquarePlacement.spread(), placementModifier2, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int countPlacement, PlacementModifier placementModifier) {
        return orePlacement(CountPlacement.of(countPlacement), placementModifier);
    }

    private static List<PlacementModifier> rareOrePlacement(int rarityFilter, PlacementModifier placementModifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(rarityFilter), placementModifier);
    }







    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }
}
