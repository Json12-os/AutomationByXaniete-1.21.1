package me.xanetie.automationbyxanetie.block;

import me.xanetie.automationbyxanetie.AutomationByXanetie;
import me.xanetie.automationbyxanetie.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {
    //code For registreting new blocks
    public static final Block HELLO_BLOCK = registerBlock("hello", new Block(BlockBehaviour.Properties.of()));



    public static Block registerBlock(String id, Block block) {
        ModItems.registerItem(id, new BlockItem(block, new Item.Properties()));
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(AutomationByXanetie.MOD_ID, id), block);
    }

    public static void registerModBlocks() {
        AutomationByXanetie.LOGGER.info("Registering Blocks from Xanetie ;)");
    }
}
