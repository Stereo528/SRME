package io.github.stereo528.srme.common;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

import static io.github.stereo528.srme.SheRa.MOD_ID;
import static io.github.stereo528.srme.util.ItemTabs.HORDE;
import static io.github.stereo528.srme.util.ItemTabs.REBEL;
import static net.minecraft.world.level.block.Blocks.*;
import static net.minecraft.world.level.block.state.BlockBehaviour.*;
import static net.minecraft.world.level.block.state.BlockBehaviour.Properties.*;

public class SheRaBlocks {
    private static Properties commonMetalBlock() { return copy(IRON_BLOCK).sound(SoundType.NETHERITE_BLOCK); }

    //Common Metal Blocks (HORDE)
    public static final Block BASE_HORDE_METAL_BLOCK = registerHorde("horde_metal_block", new Block(commonMetalBlock()));


    //Common Metal Blocks (REBELLION)
    public static final Block BASE_REBEL_METAL_BLOCK = registerRebel("rebel_metal_block", new Block(commonMetalBlock()));


    //Wood Blocks


    public static Block registerHorde(String name, Block block) {
        Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new Item.Properties().tab(HORDE)));
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static Block registerRebel(String name, Block block) {
        Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, name), new BlockItem(block, new Item.Properties().tab(REBEL)));
        return Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, name), block);
    }

    public static void init() {}
}
