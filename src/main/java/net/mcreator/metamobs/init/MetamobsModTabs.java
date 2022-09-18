
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.metamobs.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MetamobsModTabs {
	public static CreativeModeTab TAB_META_MOBS;

	public static void load() {
		TAB_META_MOBS = new CreativeModeTab("tabmeta_mobs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MetamobsModItems.EARTH_ICON.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
