package camoweed.rosesword;
// taken from redart commandly
// https://github.com/Redart15/Commandly/blob/8.0.1/src/main/java/redart15/commandly/veincapitator/OreTags.java
import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.data.tag.Tag;

import java.lang.reflect.Field;

import static net.minecraft.core.block.tag.BlockTags.TAG_LIST;
import static camoweed.rosesword.ModMain.LOGGER;

public class OreTags {
	public static Tag<Block<?>> ORE = Tag.of("ore");
	private OreTags(){}

	public static void init(){}

	static {
		Field[] declaredFields = BlockTags.class.getDeclaredFields();
		for (Field field : declaredFields) {
			if (!field.getType().equals(Tag.class)) {
				continue;
			}
			try {
				TAG_LIST.add((Tag) field.get(null));
			} catch (Exception exception) {
				LOGGER.error("Failed to add tag '{}'!", field.getName(), exception);
			}
		}
	}
}
