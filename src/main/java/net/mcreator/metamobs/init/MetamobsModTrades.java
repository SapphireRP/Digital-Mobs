
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.metamobs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MetamobsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FLETCHER) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.NETHER_STAR),

					new ItemStack(MetamobsModItems.ASTRAL_BULLET.get(), 4), 2, 11, 1f));
		}
	}
}
