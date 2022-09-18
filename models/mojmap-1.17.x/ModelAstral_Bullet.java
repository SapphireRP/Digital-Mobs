// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelAstral_Bullet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "astral_bullet"), "main");
	private final ModelPart group;

	public ModelAstral_Bullet(ModelPart root) {
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(),
				PartPose.offset(0.0354F, 13.968F, 0.5827F));

		PartDefinition cube_r1 = group.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.9F, -0.95F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-0.9F, -0.85F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 1)
						.addBox(-0.9F, -0.85F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 3)
						.addBox(-1.0F, -0.85F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(0.0F, -0.85F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r2 = group.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(3, 5)
						.addBox(0.0F, -0.85F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-1.0F, -0.85F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-0.9F, -0.85F, -0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 2)
						.addBox(-0.9F, -0.85F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 4)
						.addBox(-0.9F, -0.95F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		group.render(poseStack, buffer, packedLight, packedOverlay);
	}
}