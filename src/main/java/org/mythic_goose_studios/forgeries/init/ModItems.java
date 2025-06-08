package org.mythic_goose_studios.forgeries.init;


import net.minecraft.item.Item;
import org.mythic_goose_studios.forgeries.Forgeries;
import org.mythic_goose_studios.forgeries.item.CustomItem;
import org.mythic_goose_studios.life.api.v1.registers.SimpleRegistrar;

public class ModItems extends SimpleRegistrar {
    public static Item EXAMPLE_ITEM;

    public static void init() {
        EXAMPLE_ITEM = createItem("example_item", new CustomItem(new Item.Settings()), Forgeries.MOD_ID);
    }
}
