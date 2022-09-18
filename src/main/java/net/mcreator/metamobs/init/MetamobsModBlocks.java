
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.metamobs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.metamobs.block.YellowMetaOreBlock;
import net.mcreator.metamobs.block.RedMetaOreBlock;
import net.mcreator.metamobs.block.MetaWoodWoodBlock;
import net.mcreator.metamobs.block.MetaWoodStairsBlock;
import net.mcreator.metamobs.block.MetaWoodSlabBlock;
import net.mcreator.metamobs.block.MetaWoodPressurePlateBlock;
import net.mcreator.metamobs.block.MetaWoodPlanksBlock;
import net.mcreator.metamobs.block.MetaWoodLogBlock;
import net.mcreator.metamobs.block.MetaWoodLeavesBlock;
import net.mcreator.metamobs.block.MetaWoodFenceGateBlock;
import net.mcreator.metamobs.block.MetaWoodFenceBlock;
import net.mcreator.metamobs.block.MetaWoodButtonBlock;
import net.mcreator.metamobs.block.BonsaiWoodBlock;
import net.mcreator.metamobs.block.BonsaiStairsBlock;
import net.mcreator.metamobs.block.BonsaiSlabBlock;
import net.mcreator.metamobs.block.BonsaiPressurePlateBlock;
import net.mcreator.metamobs.block.BonsaiPlanksBlock;
import net.mcreator.metamobs.block.BonsaiLogBlock;
import net.mcreator.metamobs.block.BonsaiLeavesBlock;
import net.mcreator.metamobs.block.BonsaiFenceGateBlock;
import net.mcreator.metamobs.block.BonsaiFenceBlock;
import net.mcreator.metamobs.block.BonsaiButtonBlock;
import net.mcreator.metamobs.block.BlueMetaOreBlock;
import net.mcreator.metamobs.block.BlackMetaOreBlock;
import net.mcreator.metamobs.MetamobsMod;

public class MetamobsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MetamobsMod.MODID);
	public static final RegistryObject<Block> BONSAI_WOOD = REGISTRY.register("bonsai_wood", () -> new BonsaiWoodBlock());
	public static final RegistryObject<Block> BONSAI_LOG = REGISTRY.register("bonsai_log", () -> new BonsaiLogBlock());
	public static final RegistryObject<Block> BONSAI_PLANKS = REGISTRY.register("bonsai_planks", () -> new BonsaiPlanksBlock());
	public static final RegistryObject<Block> BONSAI_LEAVES = REGISTRY.register("bonsai_leaves", () -> new BonsaiLeavesBlock());
	public static final RegistryObject<Block> BONSAI_STAIRS = REGISTRY.register("bonsai_stairs", () -> new BonsaiStairsBlock());
	public static final RegistryObject<Block> BONSAI_SLAB = REGISTRY.register("bonsai_slab", () -> new BonsaiSlabBlock());
	public static final RegistryObject<Block> BONSAI_FENCE = REGISTRY.register("bonsai_fence", () -> new BonsaiFenceBlock());
	public static final RegistryObject<Block> BONSAI_FENCE_GATE = REGISTRY.register("bonsai_fence_gate", () -> new BonsaiFenceGateBlock());
	public static final RegistryObject<Block> BONSAI_PRESSURE_PLATE = REGISTRY.register("bonsai_pressure_plate",
			() -> new BonsaiPressurePlateBlock());
	public static final RegistryObject<Block> BONSAI_BUTTON = REGISTRY.register("bonsai_button", () -> new BonsaiButtonBlock());
	public static final RegistryObject<Block> META_WOOD_WOOD = REGISTRY.register("meta_wood_wood", () -> new MetaWoodWoodBlock());
	public static final RegistryObject<Block> META_WOOD_LOG = REGISTRY.register("meta_wood_log", () -> new MetaWoodLogBlock());
	public static final RegistryObject<Block> META_WOOD_PLANKS = REGISTRY.register("meta_wood_planks", () -> new MetaWoodPlanksBlock());
	public static final RegistryObject<Block> META_WOOD_LEAVES = REGISTRY.register("meta_wood_leaves", () -> new MetaWoodLeavesBlock());
	public static final RegistryObject<Block> META_WOOD_STAIRS = REGISTRY.register("meta_wood_stairs", () -> new MetaWoodStairsBlock());
	public static final RegistryObject<Block> META_WOOD_SLAB = REGISTRY.register("meta_wood_slab", () -> new MetaWoodSlabBlock());
	public static final RegistryObject<Block> META_WOOD_FENCE = REGISTRY.register("meta_wood_fence", () -> new MetaWoodFenceBlock());
	public static final RegistryObject<Block> META_WOOD_FENCE_GATE = REGISTRY.register("meta_wood_fence_gate", () -> new MetaWoodFenceGateBlock());
	public static final RegistryObject<Block> META_WOOD_PRESSURE_PLATE = REGISTRY.register("meta_wood_pressure_plate",
			() -> new MetaWoodPressurePlateBlock());
	public static final RegistryObject<Block> META_WOOD_BUTTON = REGISTRY.register("meta_wood_button", () -> new MetaWoodButtonBlock());
	public static final RegistryObject<Block> BLACK_META_ORE = REGISTRY.register("black_meta_ore", () -> new BlackMetaOreBlock());
	public static final RegistryObject<Block> BLUE_META_ORE = REGISTRY.register("blue_meta_ore", () -> new BlueMetaOreBlock());
	public static final RegistryObject<Block> RED_META_ORE = REGISTRY.register("red_meta_ore", () -> new RedMetaOreBlock());
	public static final RegistryObject<Block> YELLOW_META_ORE = REGISTRY.register("yellow_meta_ore", () -> new YellowMetaOreBlock());
}
