
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.metamobs.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.metamobs.item.EarthIconItem;
import net.mcreator.metamobs.item.AstralBulletItem;
import net.mcreator.metamobs.item.AstralBowItem;
import net.mcreator.metamobs.MetamobsMod;

public class MetamobsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MetamobsMod.MODID);
	public static final RegistryObject<Item> BONSAI_WOOD = block(MetamobsModBlocks.BONSAI_WOOD, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> BONSAI_LOG = block(MetamobsModBlocks.BONSAI_LOG, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> BONSAI_PLANKS = block(MetamobsModBlocks.BONSAI_PLANKS, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> BONSAI_LEAVES = block(MetamobsModBlocks.BONSAI_LEAVES, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> BONSAI_STAIRS = block(MetamobsModBlocks.BONSAI_STAIRS, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> BONSAI_SLAB = block(MetamobsModBlocks.BONSAI_SLAB, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> BONSAI_FENCE = block(MetamobsModBlocks.BONSAI_FENCE, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> BONSAI_FENCE_GATE = block(MetamobsModBlocks.BONSAI_FENCE_GATE, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> BONSAI_PRESSURE_PLATE = block(MetamobsModBlocks.BONSAI_PRESSURE_PLATE, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> BONSAI_BUTTON = block(MetamobsModBlocks.BONSAI_BUTTON, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> META_WOOD_WOOD = block(MetamobsModBlocks.META_WOOD_WOOD, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> META_WOOD_LOG = block(MetamobsModBlocks.META_WOOD_LOG, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> META_WOOD_PLANKS = block(MetamobsModBlocks.META_WOOD_PLANKS, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> META_WOOD_LEAVES = block(MetamobsModBlocks.META_WOOD_LEAVES, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> META_WOOD_STAIRS = block(MetamobsModBlocks.META_WOOD_STAIRS, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> META_WOOD_SLAB = block(MetamobsModBlocks.META_WOOD_SLAB, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> META_WOOD_FENCE = block(MetamobsModBlocks.META_WOOD_FENCE, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> META_WOOD_FENCE_GATE = block(MetamobsModBlocks.META_WOOD_FENCE_GATE, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> META_WOOD_PRESSURE_PLATE = block(MetamobsModBlocks.META_WOOD_PRESSURE_PLATE,
			MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> META_WOOD_BUTTON = block(MetamobsModBlocks.META_WOOD_BUTTON, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> BLACK_META_ORE = block(MetamobsModBlocks.BLACK_META_ORE, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> BLUE_META_ORE = block(MetamobsModBlocks.BLUE_META_ORE, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> RED_META_ORE = block(MetamobsModBlocks.RED_META_ORE, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> YELLOW_META_ORE = block(MetamobsModBlocks.YELLOW_META_ORE, MetamobsModTabs.TAB_META_MOBS);
	public static final RegistryObject<Item> ASTRAL_BOW = REGISTRY.register("astral_bow", () -> new AstralBowItem());
	public static final RegistryObject<Item> ASTRAL_BULLET = REGISTRY.register("astral_bullet", () -> new AstralBulletItem());
	public static final RegistryObject<Item> EARTH_ICON = REGISTRY.register("earth_icon", () -> new EarthIconItem());
	public static final RegistryObject<Item> SNAIL = REGISTRY.register("snail_spawn_egg",
			() -> new ForgeSpawnEggItem(MetamobsModEntities.SNAIL, -9154419, -4029690, new Item.Properties().tab(MetamobsModTabs.TAB_META_MOBS)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
