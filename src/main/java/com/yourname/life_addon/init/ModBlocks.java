package com.yourname.life_addon.init;

import com.yourname.life_addon.block.CustomBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import org.mythic_goose_studios.life.api.v1.registers.SimpleRegistrar;

public class ModBlocks extends SimpleRegistrar {
    public static Block EXAMPLE_BLOCK;

    public static void init() {
        EXAMPLE_BLOCK = createBlock("example_block", new CustomBlock(AbstractBlock.Settings.create().hardness(0.4f)), "life_addon");
    }
}
