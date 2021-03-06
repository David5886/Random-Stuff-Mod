package com.faidedtech.randomstuff.world.gen;

import com.faidedtech.randomstuff.util.RegistryHandlerBlocks;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Class format to generate an ore into the game
 * @author David Adams
 *
 */
public class AmethystOreGen {
	public static void generateOre() {
		for(Biome biome : ForgeRegistries.BIOMES) {
			//if(biome == Biomes.PLAINS) {
				ConfiguredPlacement customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(9, 5, 5, 45));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandlerBlocks.AMATHYST_ORE.get().getDefaultState(), 6)).withPlacement(customConfig));
			//}
		}
	}
}
