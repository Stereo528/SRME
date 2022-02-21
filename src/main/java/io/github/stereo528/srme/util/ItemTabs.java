package io.github.stereo528.srme.util;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

import static io.github.stereo528.srme.SheRa.MOD_ID;
import static io.github.stereo528.srme.common.SheRaBlocks.BASE_HORDE_METAL_BLOCK;
import static io.github.stereo528.srme.common.SheRaBlocks.BASE_REBEL_METAL_BLOCK;

public class ItemTabs {

    public static final CreativeModeTab HORDE = FabricItemGroupBuilder.build(
            new ResourceLocation(MOD_ID, "horde_item_group"),
            () -> new ItemStack(BASE_HORDE_METAL_BLOCK)
    );

    public static final CreativeModeTab REBEL = FabricItemGroupBuilder.build(
            new ResourceLocation(MOD_ID, "rebel_item_group"),
            () -> new ItemStack(BASE_REBEL_METAL_BLOCK)
    );

}
