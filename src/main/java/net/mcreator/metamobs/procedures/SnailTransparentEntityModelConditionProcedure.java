package net.mcreator.metamobs.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class SnailTransparentEntityModelConditionProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world instanceof Level _lvl && _lvl.isDay()) {
			return false;
		}
		return true;
	}
}
