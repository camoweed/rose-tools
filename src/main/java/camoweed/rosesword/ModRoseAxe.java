package camoweed.rosesword;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockLogicLog;
import net.minecraft.core.data.gamerule.TreecapitatorHelper;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolAxe;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;

public class ModRoseAxe extends ItemToolAxe {

	public ModRoseAxe(String translationKey, String namespaceId, int itemId) {
		super(translationKey, namespaceId, itemId, ModItems.roseToolMaterial);
	}

	@Override
	public boolean beforeBlockDestroyed(@NotNull ItemStack selfStack, @NotNull World world, @NotNull Player player, @NotNull Block<?> block, @NotNull TilePosc blockPos, @NotNull Side side) {
		if (!world.isClientSide && !player.isSneaking()) {
			Block<?> blockType = world.getBlockType(blockPos);

			if (Block.hasLogicClass(blockType, BlockLogicLog.class)) {
				boolean chopped = new TreecapitatorHelper(world, blockPos.x(), blockPos.y(), blockPos.z(), player).chopTree();

				if (chopped) {
					return false;
				}
			}
		}
		return super.beforeBlockDestroyed(selfStack, world, player, block, blockPos, side);
	}
}
