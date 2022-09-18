
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.metamobs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.metamobs.client.model.Modeltrext;
import net.mcreator.metamobs.client.model.Modelsnail;
import net.mcreator.metamobs.client.model.ModelRock_Dudet;
import net.mcreator.metamobs.client.model.ModelDire_Wolf;
import net.mcreator.metamobs.client.model.ModelAstral_Bullet;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MetamobsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelRock_Dudet.LAYER_LOCATION, ModelRock_Dudet::createBodyLayer);
		event.registerLayerDefinition(Modeltrext.LAYER_LOCATION, Modeltrext::createBodyLayer);
		event.registerLayerDefinition(ModelAstral_Bullet.LAYER_LOCATION, ModelAstral_Bullet::createBodyLayer);
		event.registerLayerDefinition(ModelDire_Wolf.LAYER_LOCATION, ModelDire_Wolf::createBodyLayer);
		event.registerLayerDefinition(Modelsnail.LAYER_LOCATION, Modelsnail::createBodyLayer);
	}
}
