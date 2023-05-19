package net.bluev3.nivaxia.world.dimension;

import net.bluev3.nivaxia.Nivaxia;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ModDimensions {
    public static final ResourceKey<Level> NIV_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(Nivaxia.MOD_ID, "nivaxia"));

    public static final ResourceKey<DimensionType> NIV_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, NIV_KEY.registry());


    public static void register() {
        System.out.println("Registering ModDimensions for " + Nivaxia.MOD_ID);
    }
}
