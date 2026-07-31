package camoweed.rosesword;


import net.minecraft.client.render.EntityRendererDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.item.Item;
import net.minecraft.core.util.collection.NamespaceID;
import org.jetbrains.annotations.NotNull;
import turniplabs.halplibe.util.ModelEntrypoint;

import static camoweed.rosesword.ModMain.LOGGER;
import static camoweed.rosesword.ModMain.MOD_ID;
import static net.minecraft.client.render.item.model.ItemModelDispatcher.*;


public class ModModels implements ModelEntrypoint {

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {
		LOGGER.info("Block Models initialized.");
	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {

		dispatcher.addDispatch(makeModel(ModItems.roseSword, "rosesword").setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND));
			dispatcher.addDispatch(makeModel(ModItems.roseBoots, "roseBoots"));
			dispatcher.addDispatch(makeModel(ModItems.rosePants, "rosePants"));
			dispatcher.addDispatch(makeModel(ModItems.roseChest, "roseChest"));
			dispatcher.addDispatch(makeModel(ModItems.roseHelm, "roseHelm"));
		dispatcher.addDispatch(makeModel(ModItems.roseAxe, "roseaxe").setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND));
		dispatcher.addDispatch(makeModel(ModItems.rosePick, "rosepick").setDisplayPos("firstperson_righthand", HANDHELD_FIRST_PERSON_RIGHT_HAND).setDisplayPos("firstperson_lefthand", HANDHELD_FIRST_PERSON_LEFT_HAND).setDisplayPos("thirdperson_righthand", HANDHELD_THIRD_PERSON_RIGHT_HAND).setDisplayPos("thirdperson_lefthand", HANDHELD_THIRD_PERSON_LEFT_HAND));

		LOGGER.info("Item Models initialized.");
	}
public static @NotNull ItemModelStandard makeModel(@NotNull final Item item, @NotNull final String textureValue) {
		return setIcon(new ItemModelStandard(item, null), NamespaceID.getTemp(MOD_ID, "item/" + textureValue));
	}

	public static <T extends ItemModelStandard> @NotNull T setIcon(@NotNull final T model, @NotNull final String texture) {
		model.icon = TextureRegistry.getTexture(texture);
		return model;
	}

	public static <T extends ItemModelStandard> @NotNull T setIcon(@NotNull final T model, @NotNull final NamespaceID texture) {
		model.icon = TextureRegistry.getTexture(texture);
		return model;
	}
	@Override
	public void initEntityModels(EntityRendererDispatcher dispatcher) {}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {}
}
