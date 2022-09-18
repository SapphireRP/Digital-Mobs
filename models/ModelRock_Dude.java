// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelRock_Dude extends EntityModel<Entity> {
	private final ModelRenderer leftleg1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer leftleg2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer rightleg1;
	private final ModelRenderer cube_r3;
	private final ModelRenderer rightleg2;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bodyhead;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;

	public ModelRock_Dude() {
		textureWidth = 64;
		textureHeight = 64;

		leftleg1 = new ModelRenderer(this);
		leftleg1.setRotationPoint(4.0F, 18.6761F, -1.5163F);
		leftleg1.setTextureOffset(40, 0).addBox(0.0F, 3.3239F, -6.4837F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		leftleg1.setTextureOffset(0, 40).addBox(0.0F, -1.3239F, -1.5163F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, 4.2365F, -4.2239F);
		leftleg1.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.8727F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 27).addBox(-0.5F, -1.5F, -1.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(4.0F, 18.6761F, 1.5163F);
		leftleg2.setTextureOffset(14, 16).addBox(0.0F, -1.3239F, -0.4837F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		leftleg2.setTextureOffset(22, 16).addBox(0.0F, 3.3239F, 4.4837F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, 0.4063F, 1.01F);
		leftleg2.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.8727F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(13, 20).addBox(-0.5F, -1.5F, -1.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);

		rightleg1 = new ModelRenderer(this);
		rightleg1.setRotationPoint(-4.0F, 18.6761F, -1.5163F);
		rightleg1.setTextureOffset(8, 36).addBox(-2.0F, 3.3239F, -6.4837F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		rightleg1.setTextureOffset(0, 36).addBox(-2.0F, -1.3239F, -1.5163F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5F, 4.2365F, -4.2239F);
		rightleg1.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.8727F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(24, 25).addBox(-0.5F, -1.5F, -1.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(-4.0F, 18.6761F, 1.5163F);
		rightleg2.setTextureOffset(35, 17).addBox(-2.0F, -1.3239F, -0.4837F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		rightleg2.setTextureOffset(35, 25).addBox(-2.0F, 3.3239F, 4.4837F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.5F, 0.4063F, 1.01F);
		rightleg2.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.8727F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(24, 16).addBox(-0.5F, -1.5F, -1.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);

		bodyhead = new ModelRenderer(this);
		bodyhead.setRotationPoint(3.8448F, 17.1882F, 3.7473F);
		bodyhead.setTextureOffset(0, 16).addBox(-5.8448F, -3.8361F, -9.7799F, 4.0F, 5.0F, 6.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bodyhead.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.8818F, 0.4121F, -0.2281F);
		cube_r5.setTextureOffset(11, 29).addBox(-3.0F, -2.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.4918F, 0.554F, 3.1105F);
		bodyhead.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.8818F, -0.4121F, 0.2281F);
		cube_r6.setTextureOffset(35, 12).addBox(-5.0F, -2.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.4918F, -4.446F, 0.1105F);
		bodyhead.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.6636F, -0.4121F, 0.2281F);
		cube_r7.setTextureOffset(0, 0).addBox(-5.0F, -2.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -5.0F, -3.0F);
		bodyhead.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.6636F, 0.4121F, -0.2281F);
		cube_r8.setTextureOffset(24, 0).addBox(-3.0F, -2.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.4918F, -2.446F, 3.1105F);
		bodyhead.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.8818F, -0.4121F, 0.2281F);
		cube_r9.setTextureOffset(26, 34).addBox(-5.0F, -2.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -3.0F, 0.0F);
		bodyhead.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.8818F, 0.4121F, -0.2281F);
		cube_r10.setTextureOffset(34, 34).addBox(-3.0F, -2.0F, -2.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.4918F, -5.446F, 2.1105F);
		bodyhead.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.8818F, -0.4121F, 0.2281F);
		cube_r11.setTextureOffset(32, 0).addBox(-7.0F, -2.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, -6.0F, -1.0F);
		bodyhead.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.8818F, 0.4121F, -0.2281F);
		cube_r12.setTextureOffset(18, 32).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.8448F, 2.1639F, -4.7799F);
		bodyhead.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.8727F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(0, 0).addBox(-4.0F, -6.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		leftleg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg2.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg1.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg2.render(matrixStack, buffer, packedLight, packedOverlay);
		bodyhead.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.rightleg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftleg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightleg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftleg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}