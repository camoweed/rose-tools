package camoweed.rosesword;

import net.minecraft.core.entity.Mob;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolSword;
import org.jetbrains.annotations.NotNull;

public class ModRoseSword extends ItemToolSword {
	public ModRoseSword(@NotNull String name, @NotNull String namespaceId, int id, @NotNull ToolMaterial toolMaterial) {
		super(name, namespaceId, id, toolMaterial);
	}
	@Override
	public boolean hitEntity(@NotNull ItemStack selfStack, @NotNull Mob target, @NotNull Mob attacker) {
		selfStack.damageItem(1, attacker);
		attacker.heal(1);
		return true;
	}
}
