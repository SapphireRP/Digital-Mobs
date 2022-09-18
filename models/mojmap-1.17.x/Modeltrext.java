// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltrext<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "trex"), "main");
	private final ModelPart Head;
	private final ModelPart body;
	private final ModelPart rightleg;
	private final ModelPart leftleg;

	public Modeltrext(ModelPart root) {
		this.Head = root.getChild("Head");
		this.body = root.getChild("body");
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(36, 38)
						.addBox(-7.0F, 0.0F, -9.0F, 14.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
						.addBox(-5.0F, 0.0F, -18.0F, 10.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-6.0F, -6.0F, -8.0F, 12.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(39, 0)
						.addBox(-4.0F, -4.0F, -17.0F, 8.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -12.0F, -19.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-6.0F, -6.2669F, -1.7683F, 12.0F, 11.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(31, 76)
				.addBox(-3.0F, -1.2669F, 28.2317F, 6.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(49, 117)
				.addBox(-8.5F, -0.2669F, -11.7683F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(117, 111)
				.addBox(-8.5F, 4.7331F, -10.7683F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(15, 115)
				.addBox(5.5F, -0.2669F, -11.7683F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
				.addBox(5.5F, 4.7331F, -10.7683F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, -6.7331F, 2.7683F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(34, 90)
						.addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(114, 33)
						.addBox(-15.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 11.9522F, -19.2273F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(76, 42)
						.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(110, 60)
						.addBox(-15.5F, -1.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 10.6451F, -16.9072F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(110, 68)
						.addBox(-1.5F, -1.5F, -3.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(70, 111)
						.addBox(-15.5F, -1.5F, -3.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 9.7769F, -11.9832F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(99, 36)
						.addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(85, 100)
						.addBox(-16.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -1.5511F, -10.082F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(66, 56).addBox(-1.0F, -13.2F, 51.5F, 2.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 29.2331F, -1.7683F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(94, 77).addBox(-2.0F, -23.0F, 42.0F, 4.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 29.7331F, -1.7683F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(68, 68)
						.addBox(-4.0F, -36.0F, 19.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(35, 56)
						.addBox(-5.0F, -37.0F, 9.0F, 10.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 29.7331F, -1.7683F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 26).addBox(-6.0F, -5.5F, -5.5F, 12.0F, 11.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.8269F, -5.9475F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(42, 15).addBox(-4.0F, -3.5F, -4.5F, 10.0F, 9.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -5.7491F, -16.7253F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(0, 98)
				.addBox(-4.9451F, 27.8668F, -6.8253F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 109)
				.addBox(-3.9451F, 28.8668F, -12.8253F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(66, 56)
				.addBox(-3.4451F, 29.8668F, -13.8253F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0549F, -8.0973F, 8.7211F));

		PartDefinition cube_r10 = rightleg.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 53)
						.addBox(-6.5F, 2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(85, 15)
						.addBox(-7.0F, 1.0F, 1.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0549F, 27.8668F, -10.8253F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r11 = rightleg.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 66)
						.addBox(-13.5F, 2.0F, -6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 88)
						.addBox(-14.0F, 1.0F, -5.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0549F, 27.8668F, -10.8253F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r12 = rightleg.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(113, 84)
						.addBox(-11.0F, -11.0F, 5.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 104)
						.addBox(-12.0F, -20.0F, 4.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 110)
						.addBox(-11.5F, -15.0F, 4.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(107, 49)
						.addBox(-11.0F, -20.0F, -2.0F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(74, 15)
						.addBox(-12.0F, -21.0F, -4.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(100, 10)
						.addBox(-13.0F, -21.0F, -9.0F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0549F, 27.8668F, -10.8253F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r13 = rightleg.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(41, 94)
						.addBox(-11.0F, -25.0F, 1.0F, 3.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(76, 27)
						.addBox(-12.0F, -30.0F, 0.0F, 5.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0549F, 29.0973F, -7.7211F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r14 = rightleg.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 83).addBox(-13.0F, -29.0F, -21.0F, 6.0F, 6.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0549F, 29.8941F, -8.0986F, -0.8727F, 0.0F, 0.0F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(103, 0)
				.addBox(2.0549F, 28.8668F, -12.8253F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(39, 0)
				.addBox(2.5549F, 29.8668F, -13.8253F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(93, 63)
				.addBox(1.0549F, 27.8668F, -6.8253F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.9451F, -8.0973F, 8.7211F));

		PartDefinition cube_r15 = leftleg.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(52, 82)
						.addBox(-7.0F, 1.0F, 1.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-6.5F, 2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0549F, 27.8668F, -10.8253F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r16 = leftleg.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(39, 4)
						.addBox(-13.5F, 2.0F, -6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(75, 84)
						.addBox(-14.0F, 1.0F, -5.0F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0549F, 27.8668F, -10.8253F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r17 = leftleg.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(57, 107)
						.addBox(-12.0F, -15.0F, 4.0F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(102, 111)
						.addBox(-11.5F, -11.0F, 5.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(65, 0)
						.addBox(-13.5F, -21.0F, -4.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(106, 100)
						.addBox(-12.5F, -20.0F, -2.0F, 3.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(103, 22)
						.addBox(-12.5F, -20.0F, 4.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(62, 96)
						.addBox(-13.5F, -21.0F, -9.0F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5549F, 27.8668F, -10.8253F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftleg.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(80, 49).addBox(-12.0F, -29.0F, -21.0F, 6.0F, 6.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0549F, 29.8942F, -8.0986F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftleg.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(74, 0)
						.addBox(-12.0F, -30.0F, 0.0F, 5.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(20, 90)
						.addBox(-11.0F, -25.0F, 1.0F, 3.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0549F, 29.0973F, -7.7211F, -0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		body.render(poseStack, buffer, packedLight, packedOverlay);
		rightleg.render(poseStack, buffer, packedLight, packedOverlay);
		leftleg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}