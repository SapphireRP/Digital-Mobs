
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.metamobs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.metamobs.world.features.ores.YellowMetaOreFeature;
import net.mcreator.metamobs.world.features.ores.RedMetaOreFeature;
import net.mcreator.metamobs.world.features.ores.BlueMetaOreFeature;
import net.mcreator.metamobs.world.features.ores.BlackMetaOreFeature;
import net.mcreator.metamobs.MetamobsMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class MetamobsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MetamobsMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> BLACK_META_ORE = register("black_meta_ore", BlackMetaOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, BlackMetaOreFeature.GENERATE_BIOMES, BlackMetaOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BLUE_META_ORE = register("blue_meta_ore", BlueMetaOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, BlueMetaOreFeature.GENERATE_BIOMES, BlueMetaOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_META_ORE = register("red_meta_ore", RedMetaOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RedMetaOreFeature.GENERATE_BIOMES, RedMetaOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> YELLOW_META_ORE = register("yellow_meta_ore", YellowMetaOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, YellowMetaOreFeature.GENERATE_BIOMES,
					YellowMetaOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
