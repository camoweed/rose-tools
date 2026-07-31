package camoweed.rosesword;

// 1. Added missing imports for Player and VeinMining context
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.block.Block;
import net.minecraft.core.entity.Mob;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolPickaxe;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;

public class ModRosePickaxe extends ItemToolPickaxe {
	public ModRosePickaxe(@NotNull String name, @NotNull String namespaceId, int id, @NotNull ToolMaterial toolMaterial) {
		super(name, namespaceId, id, ModItems.roseToolMaterial);
	}

	@Override
	public boolean onBlockDestroyed(@NotNull ItemStack selfStack, @NotNull World world, @NotNull Mob mob, @NotNull Block<?> removedBlock, @NotNull TilePosc blockPos, @NotNull Side side) {
		if (!world.isClientSide && mob instanceof Player player) {
			VeinMining.veinMining(world, selfStack, blockPos, player)
				.mine(removedBlock, side);
		}

		return super.onBlockDestroyed(selfStack, world, mob, removedBlock, blockPos, side);
	}
}
