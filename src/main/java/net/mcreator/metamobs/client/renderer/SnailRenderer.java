
package net.mcreator.metamobs.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.metamobs.procedures.SnailTransparentEntityModelConditionProcedure;
import net.mcreator.metamobs.entity.SnailEntity;
import net.mcreator.metamobs.client.model.Modelsnail;

public class SnailRenderer extends MobRenderer<SnailEntity, Modelsnail<SnailEntity>> {
	public SnailRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnail(context.bakeLayer(Modelsnail.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnailEntity entity) {
		return new ResourceLocation("metamobs:textures/entities/snail_texture.png");
	}

	@Override
	protected boolean isBodyVisible(SnailEntity _ent) {
		Entity entity = _ent;
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return !SnailTransparentEntityModelConditionProcedure.execute(world);
	}
}
