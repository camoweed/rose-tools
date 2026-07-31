package camoweed.rosesword;

import static camoweed.rosesword.ModMain.MOD_ID;

import net.minecraft.core.enums.HumanArmorShape;
import net.minecraft.core.item.IArmorItem;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemArmor;
import net.minecraft.core.item.material.ArmorMaterial;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.item.tool.ItemToolAxe;
import net.minecraft.core.item.tool.ItemToolSword;
import turniplabs.halplibe.helper.ArmorHelper;
import turniplabs.halplibe.helper.ItemBuilder;

public class ModItems {
    //private static int startingID = ModConfig.CFG.getInt("IDs.startingBlockID");
    //private static int nextID() {return startingID++;}

    public static Item roseSword;
    public static Item roseBoots;
    public static Item rosePants;
    public static Item roseChest;
    public static Item roseHelm;
	public static Item roseAxe;
	public static Item rosePick;
        public static ToolMaterial roseToolMaterial = new ToolMaterial().setDurability(2303).setEfficiency(2.0f, 45.0f).setMiningLevel(3).setDamage(3);
        public static ArmorMaterial roseArmour = ArmorHelper.createArmorMaterial(MOD_ID, "roseArmour", 600, 50f, 35f, 15f, 100f);
    public static void initItems() {
            roseSword = new ItemBuilder(MOD_ID)
        .build(new ItemToolSword("rosesword", MOD_ID + ":item/rosesword", 17000, roseToolMaterial));
            roseBoots = new ItemBuilder(MOD_ID)
        .build(new ItemArmor("roseBoots", MOD_ID + ":item/roseBoots", 17001, roseArmour, HumanArmorShape.BOOTS));
            rosePants = new ItemBuilder(MOD_ID)
        .build(new ItemArmor("rosePants", MOD_ID + ":item/rosePants", 17002, roseArmour, HumanArmorShape.LEGS));
            roseChest = new ItemBuilder(MOD_ID)
        .build(new ItemArmor("roseChest", MOD_ID + ":item/roseChest", 17003, roseArmour, HumanArmorShape.CHEST));
            roseHelm = new ItemBuilder(MOD_ID)
        .build(new ItemArmor("roseHelm", MOD_ID + ":item/roseHelm", 17004, roseArmour, HumanArmorShape.HEAD));
		roseAxe = new ItemBuilder(MOD_ID)
			.build(new ModRoseAxe("roseaxe", MOD_ID + ":item/roseaxe", 17005));
		rosePick = new ItemBuilder(MOD_ID)
			.build(new ModRosePickaxe("rosepick", MOD_ID + ":item/rosepick", 17006,roseToolMaterial));
    }
}
