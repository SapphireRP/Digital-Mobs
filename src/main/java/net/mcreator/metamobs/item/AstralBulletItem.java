
package net.mcreator.metamobs.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.metamobs.init.MetamobsModTabs;

import java.util.List;

public class AstralBulletItem extends Item {
	public AstralBulletItem() {
		super(new Item.Properties().tab(MetamobsModTabs.TAB_META_MOBS).stacksTo(8).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("A Cosmic Star that can be used with a bow and very strong metat to form the Astral Bow"));
	}
}
