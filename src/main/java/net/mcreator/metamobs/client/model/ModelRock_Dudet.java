package net.mcreator.metamobs.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelRock_Dudet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("metamobs", "model_rock_dudet"), "main");
	public final ModelPart leftleg1;
	public final ModelPart leftleg2;
	public final ModelPart rightleg1;
	public final ModelPart rightleg2;
	public final ModelPart bodyhead;

	public ModelRock_Dudet(ModelPart root) {
		this.leftleg1 = root.getChild("leftleg1");
		this.leftleg2 = root.getChild("leftleg2");
		this.rightleg1 = root.getChild("rightleg1");
		this.rightleg2 = root.getChild("rightleg2");
		this.bodyhead = root.getChild("bodyhead");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leftleg1 = partdefinition.addOrReplaceChild(
				"leftleg1", CubeListBuilder.create().texOffs(40, 0).addBox(0.0F, 3.3239F, -6.4837F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 40).addBox(0.0F, -1.3239F, -1.5163F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 18.6761F, -1.5163F));
		PartDefinition cube_r1 = leftleg1.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 27).addBox(-0.5F, -1.5F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 4.2365F, -4.2239F, 0.8727F, 0.0F, 0.0F));
		PartDefinition leftleg2 = partdefinition.addOrReplaceChild(
				"leftleg2", CubeListBuilder.create().texOffs(14, 16).addBox(0.0F, -1.3239F, -0.4837F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(22, 16).addBox(0.0F, 3.3239F, 4.4837F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, 18.6761F, 1.5163F));
		PartDefinition cube_r2 = leftleg2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(13, 20).addBox(-0.5F, -1.5F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.4063F, 1.01F, -0.8727F, 0.0F, 0.0F));
		PartDefinition rightleg1 = partdefinition.addOrReplaceChild(
				"rightleg1", CubeListBuilder.create().texOffs(8, 36).addBox(-2.0F, 3.3239F, -6.4837F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 36).addBox(-2.0F, -1.3239F, -1.5163F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 18.6761F, -1.5163F));
		PartDefinition cube_r3 = rightleg1.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(24, 25).addBox(-0.5F, -1.5F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 4.2365F, -4.2239F, 0.8727F, 0.0F, 0.0F));
		PartDefinition rightleg2 = partdefinition.addOrReplaceChild("rightleg2",
				CubeListBuilder.create().texOffs(35, 17).addBox(-2.0F, -1.3239F, -0.4837F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(35, 25).addBox(-2.0F, 3.3239F, 4.4837F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 18.6761F, 1.5163F));
		PartDefinition cube_r4 = rightleg2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(24, 16).addBox(-0.5F, -1.5F, -1.0F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 0.4063F, 1.01F, -0.8727F, 0.0F, 0.0F));
		PartDefinition bodyhead = partdefinition.addOrReplaceChild("bodyhead",
				CubeListBuilder.create().texOffs(0, 16).addBox(-5.8448F, -3.8361F, -9.7799F, 4.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.8448F, 17.1882F, 3.7473F));
		PartDefinition cube_r5 = bodyhead.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(11, 29).addBox(-3.0F, -2.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8818F, 0.4121F, -0.2281F));
		PartDefinition cube_r6 = bodyhead.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(35, 12).addBox(-5.0F, -2.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4918F, 0.554F, 3.1105F, -0.8818F, -0.4121F, 0.2281F));
		PartDefinition cube_r7 = bodyhead.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -2.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4918F, -4.446F, 0.1105F, -0.6636F, -0.4121F, 0.2281F));
		PartDefinition cube_r8 = bodyhead.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(24, 0).addBox(-3.0F, -2.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, -3.0F, -0.6636F, 0.4121F, -0.2281F));
		PartDefinition cube_r9 = bodyhead.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(26, 34).addBox(-5.0F, -2.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4918F, -2.446F, 3.1105F, -0.8818F, -0.4121F, 0.2281F));
		PartDefinition cube_r10 = bodyhead.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(34, 34).addBox(-3.0F, -2.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, -0.8818F, 0.4121F, -0.2281F));
		PartDefinition cube_r11 = bodyhead.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(32, 0).addBox(-7.0F, -2.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.4918F, -5.446F, 2.1105F, -0.8818F, -0.4121F, 0.2281F));
		PartDefinition cube_r12 = bodyhead.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(18, 32).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, -1.0F, -0.8818F, 0.4121F, -0.2281F));
		PartDefinition cube_r13 = bodyhead.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -6.0F, -5.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8448F, 2.1639F, -4.7799F, -0.8727F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		leftleg1.render(poseStack, buffer, packedLight, packedOverlay);
		leftleg2.render(poseStack, buffer, packedLight, packedOverlay);
		rightleg1.render(poseStack, buffer, packedLight, packedOverlay);
		rightleg2.render(poseStack, buffer, packedLight, packedOverlay);
		bodyhead.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.rightleg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftleg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightleg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftleg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
