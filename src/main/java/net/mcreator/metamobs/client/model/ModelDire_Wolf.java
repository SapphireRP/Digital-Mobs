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

// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelDire_Wolf<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("metamobs", "model_dire_wolf"), "main");
	public final ModelPart head;
	public final ModelPart body;
	public final ModelPart rightleg1;
	public final ModelPart rightleg2;
	public final ModelPart leftleg1;
	public final ModelPart leftleg2;

	public ModelDire_Wolf(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.rightleg1 = root.getChild("rightleg1");
		this.rightleg2 = root.getChild("rightleg2");
		this.leftleg1 = root.getChild("leftleg1");
		this.leftleg2 = root.getChild("leftleg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(22, 15).addBox(-2.9998F, -2.3953F, -4.993F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
						.texOffs(28, 7).addBox(-1.9998F, 0.5847F, -7.993F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(39, 4)
						.addBox(-1.4998F, 0.4847F, -7.943F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 47)
						.addBox(-0.9998F, 0.3847F, -7.693F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 12).addBox(-2.4998F, -1.8453F,
								-0.993F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0002F, 12.8953F, -4.007F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(0, 4).addBox(1.4F, -1.5F, -1.3F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.501F, -1.5F, -1.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(0.399F, -1.5F, -1.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-1.401F, -1.5F, -1.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-1.4F, -1.5F, -1.3F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 15)
						.addBox(-1.0F, -0.4F, -1.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(13, 45).addBox(-1.5F, -0.5F, -1.5F, 3.0F,
								1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0002F, 3.4559F, -6.3125F, 0.2618F, 0.0F, 0.0F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(54, 4).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2587F, -5.8423F, -3.2348F, 0.2618F, 0.0F, -0.2618F));
		PartDefinition head_r3 = head.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(8, 36).addBox(-0.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3958F, -4.4219F, -2.993F, 0.0F, 0.0F, -0.2618F));
		PartDefinition head_r4 = head.addOrReplaceChild("head_r4",
				CubeListBuilder.create().texOffs(38, 51).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3952F, -2.6194F, -2.993F, 0.0F, 0.0F, -0.2618F));
		PartDefinition head_r5 = head.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(16, 19).addBox(-1.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3961F, -4.4219F, -3.093F, 0.0F, 0.0F, 0.2618F));
		PartDefinition head_r6 = head.addOrReplaceChild("head_r6",
				CubeListBuilder.create().texOffs(49, 54).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2591F, -5.8423F, -3.3348F, 0.2618F, 0.0F, 0.2618F));
		PartDefinition head_r7 = head.addOrReplaceChild("head_r7",
				CubeListBuilder.create().texOffs(44, 51).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3955F, -2.6194F, -3.093F, 0.0F, 0.0F, 0.2618F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 13.4337F, -0.0709F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 15).addBox(-2.5F, -2.35F, 4.0F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -2.85F, -4.0F, 6.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -2.5F, -0.5F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.1163F, -4.4291F, -0.3927F, 0.0F, 0.0F));
		PartDefinition tail = body.addOrReplaceChild("tail",
				CubeListBuilder.create().texOffs(46, 46).addBox(-1.5F, 0.4834F, 13.6662F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 17)
						.addBox(0.75F, 0.9834F, 13.4162F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 32)
						.addBox(-1.75F, 0.9834F, 13.4162F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(49, 42)
						.addBox(-1.0F, 0.2328F, 13.9866F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(49, 27)
						.addBox(-1.0F, 1.6328F, 13.9866F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -0.2957F, -1.8992F));
		PartDefinition cube_r3 = tail.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(45, 37).addBox(-1.0F, 0.4F, 11.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 46)
						.addBox(-1.0F, -1.0F, 11.25F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(28, 28).addBox(-1.0F, 0.4F, 10.25F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 30)
						.addBox(-1.0F, -1.0F, 10.25F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0492F, 5.4756F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(16, 32).addBox(-1.0F, -1.0F, 10.25F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-1.0F, 0.4F, 10.25F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 0).addBox(-1.5F, -0.85F, 10.0F, 3.0F,
								3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.1887F, 9.4731F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 15).addBox(0.5F, 0.15F, 10.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 13)
						.addBox(3.0F, 0.15F, 10.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.25F, -0.2043F, 1.6492F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(38, 34).addBox(0.5F, 0.15F, 10.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 42)
						.addBox(3.0F, 0.15F, 10.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.25F, 2.6026F, 5.1948F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 40).addBox(0.5F, 0.15F, 10.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(39, 40)
						.addBox(3.0F, 0.15F, 10.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.25F, 3.6887F, 9.2231F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(18, 25).addBox(-1.5F, -0.85F, 10.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.1026F, 5.4448F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(47, 22).addBox(-1.5F, -0.85F, 10.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2957F, 1.8992F, -0.0873F, 0.0F, 0.0F));
		PartDefinition rightleg1 = partdefinition.addOrReplaceChild("rightleg1",
				CubeListBuilder.create().texOffs(34, 4).addBox(-2.5F, 8.8984F, 2.029F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 38)
						.addBox(-3.0F, 8.8984F, -0.971F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 33)
						.addBox(-2.5F, 8.7484F, -0.871F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 37)
						.addBox(-2.75F, 8.9984F, -2.221F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 51)
						.addBox(-1.5F, 8.9984F, -2.221F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 52)
						.addBox(-0.25F, 8.9984F, -2.221F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 14.0642F, -3.3061F));
		PartDefinition cube_r11 = rightleg1.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(43, 46).addBox(-3.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 42)
						.addBox(-4.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 47).addBox(-5.75F, -0.5F, -0.5F, 1.0F,
								1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 9.6517F, -2.4916F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r12 = rightleg1.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(16, 42).addBox(-3.25F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 41)
						.addBox(-5.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 42).addBox(-4.5F, -0.5F, -0.5F, 1.0F,
								1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 10.0875F, -3.114F, 0.829F, 0.0F, 0.0F));
		PartDefinition cube_r13 = rightleg1.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(30, 50).addBox(-5.0F, -0.85F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 7.2484F, 4.829F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r14 = rightleg1.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(31, 38).addBox(-5.0F, -0.85F, -4.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -0.6304F, 3.2353F, 0.3054F, 0.0F, 0.0F));
		PartDefinition rightleg2 = partdefinition.addOrReplaceChild("rightleg2",
				CubeListBuilder.create().texOffs(48, 4).addBox(-0.25F, 5.8715F, -2.1851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 47)
						.addBox(-1.5F, 5.8715F, -2.1851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 42)
						.addBox(-2.75F, 5.8715F, -2.1851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 18)
						.addBox(-2.5F, 5.6215F, -0.8351F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 34)
						.addBox(-3.0F, 5.7715F, -0.9351F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 12)
						.addBox(-2.5F, 5.7715F, 2.0649F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.5F, 17.1911F, 6.658F));
		PartDefinition cube_r15 = rightleg2.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 46).addBox(-5.0F, 1.15F, -4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -3.2574F, 2.5211F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r16 = rightleg2.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(8, 49).addBox(-5.0F, -0.85F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 4.8673F, 4.4084F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r17 = rightleg2.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(35, 26).addBox(-5.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-4.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 40).addBox(-3.25F, -0.5F, -0.5F, 1.0F,
								1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 6.5248F, -2.4557F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r18 = rightleg2.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(20, 38).addBox(-4.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 38)
						.addBox(-5.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40).addBox(-3.25F, -0.5F, -0.5F, 1.0F,
								1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 6.9606F, -3.0782F, 0.829F, 0.0F, 0.0F));
		PartDefinition leftleg1 = partdefinition.addOrReplaceChild("leftleg1",
				CubeListBuilder.create().texOffs(44, 0).addBox(-0.6111F, 8.7591F, -0.7268F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(36, 25).addBox(-1.1111F, 8.9091F, -0.8268F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 31)
						.addBox(-0.8611F, 9.0091F, -2.0768F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(53, 0)
						.addBox(1.6389F, 9.0091F, -2.0768F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(0.3889F, 9.0091F, -2.0768F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 25).addBox(-0.6111F, 8.9091F,
								2.1732F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.1111F, 14.0535F, -3.4503F));
		PartDefinition cube_r19 = leftleg1.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(19, 43).addBox(4.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 42)
						.addBox(3.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 22).addBox(2.25F, -0.5F, -0.5F, 1.0F,
								1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1111F, 10.0982F, -2.9699F, 0.829F, 0.0F, 0.0F));
		PartDefinition cube_r20 = leftleg1.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(53, 34).addBox(4.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 53)
						.addBox(3.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 49).addBox(2.25F, -0.5F, -0.5F, 1.0F,
								1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1111F, 9.6624F, -2.3474F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r21 = leftleg1.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(16, 50).addBox(3.0F, -0.85F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1111F, 7.2591F, 4.9732F, -0.3054F, 0.0F, 0.0F));
		PartDefinition cube_r22 = leftleg1.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(23, 38).addBox(3.0F, -0.85F, -4.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.1111F, -0.6197F, 3.3794F, 0.3054F, 0.0F, 0.0F));
		PartDefinition leftleg2 = partdefinition.addOrReplaceChild("leftleg2",
				CubeListBuilder.create().texOffs(40, 29).addBox(-0.5F, 5.6215F, -0.8351F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-1.0F, 5.7715F, -0.9351F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 29)
						.addBox(-0.75F, 5.8715F, -2.1851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 0)
						.addBox(1.75F, 5.8715F, -2.1851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 9)
						.addBox(0.5F, 5.8715F, -2.1851F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 27)
						.addBox(-0.5F, 5.7715F, 2.0649F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.5F, 17.1911F, 6.658F));
		PartDefinition cube_r23 = leftleg2.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(0, 34).addBox(4.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 32)
						.addBox(3.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 27).addBox(2.25F, -0.5F, -0.5F, 1.0F,
								1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 6.9606F, -3.0782F, 0.829F, 0.0F, 0.0F));
		PartDefinition cube_r24 = leftleg2.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(18, 27).addBox(4.75F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 2)
						.addBox(3.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 0).addBox(2.25F, -0.5F, -0.5F, 1.0F,
								1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 6.5248F, -2.4557F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r25 = leftleg2.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(49, 7).addBox(3.0F, -0.85F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 4.8673F, 4.4084F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r26 = leftleg2.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(0, 0).addBox(3.0F, 1.15F, -4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -3.2574F, 2.5211F, 0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
		rightleg1.render(poseStack, buffer, packedLight, packedOverlay);
		rightleg2.render(poseStack, buffer, packedLight, packedOverlay);
		leftleg1.render(poseStack, buffer, packedLight, packedOverlay);
		leftleg2.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightleg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftleg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftleg1.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
