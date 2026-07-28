package camoweed.rosesword;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static camoweed.rosesword.ModMain.LOGGER;
import static camoweed.rosesword.ModMain.MOD_ID;

import static camoweed.rosesword.ModItems.*;

public class ModRecipes implements RecipeEntrypoint {

	@Override
	public void onRecipesReady() {
		LookupFuelFurnace.instance.addFuelEntry(roseSword.id, 12800);
		LookupFuelFurnace.instance.addFuelEntry(roseAxe.id, 12800);
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"ARA",
				"TST",
				"ARA")
			.addInput('A', Blocks.ALGAE)
            .addInput('R', Blocks.FLOWER_RED)
            .addInput('S', Items.TOOL_SWORD_IRON)
			.addInput('T', Items.INGOT_STEEL)
		.create("rose_sword", new ItemStack(roseSword, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"ARA",
				"TST",
				"ARA")
			.addInput('A', Blocks.ALGAE)
			.addInput('R', Blocks.FLOWER_RED)
			.addInput('S', Items.TOOL_AXE_IRON)
			.addInput('T', Items.INGOT_STEEL)
			.create("rose_sword", new ItemStack(roseAxe, 1));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"ARA",
				"TST",
				"ARA")
			.addInput('A', Blocks.ALGAE)
            .addInput('R', Blocks.FLOWER_RED)
            .addInput('S', Items.ARMOR_BOOTS_IRON)
			.addInput('T', Items.INGOT_STEEL)
		.create("roseBoots", new ItemStack(roseBoots, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"ARA",
				"TST",
				"ARA")
			.addInput('A', Blocks.ALGAE)
            .addInput('R', Blocks.FLOWER_RED)
            .addInput('S', Items.ARMOR_LEGGINGS_IRON)
			.addInput('T', Items.INGOT_STEEL)
		.create("rosePants", new ItemStack(rosePants, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"ARA",
				"TST",
				"ARA")
			.addInput('A', Blocks.ALGAE)
            .addInput('R', Blocks.FLOWER_RED)
            .addInput('S', Items.ARMOR_CHESTPLATE_IRON)
			.addInput('T', Items.INGOT_STEEL)
		.create("roseChest", new ItemStack(roseChest, 1));

		RecipeBuilder.Shaped(MOD_ID)
			.setShape(
				"ARA",
				"TST",
				"ARA")
			.addInput('A', Blocks.ALGAE)
            .addInput('R', Blocks.FLOWER_RED)
            .addInput('S', Items.ARMOR_HELMET_IRON)
			.addInput('T', Items.INGOT_STEEL)
		.create("roseHelm", new ItemStack(roseHelm, 1));

		LOGGER.info("Recipes initialized.");
	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}

}
