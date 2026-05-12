package me.xanetie.automationbyxanetie;

import me.xanetie.automationbyxanetie.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CustomCreativeTabs {
    public static final ResourceKey<CreativeModeTab> CUSTOM_ITEM_GROUP_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), ResourceLocation.fromNamespaceAndPath(AutomationByXanetie.MOD_ID, "main"));
    public static final CreativeModeTab CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.PINK_GARNET))
            .title(Component.translatable("itemGroup.main"))
            .build();
    public static final ResourceKey<CreativeModeTab> CUSTOM_INGREDIENTS_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), ResourceLocation.fromNamespaceAndPath(AutomationByXanetie.MOD_ID, "ingredients"));
    public static final CreativeModeTab CUSTOM_INGREDIENTS_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.PINK_GARNET))
            .title(Component.translatable("itemGroup.ingredients"))
            .build();
    public static void RegisterCreativeTabs() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CUSTOM_INGREDIENTS_KEY, CUSTOM_INGREDIENTS_GROUP);
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_INGREDIENTS_KEY).register(itemGroup -> {
            itemGroup.accept(ModItems.PINK_GARNET);
        });

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);
        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.accept(ModItems.PINK_GARNET);
        });
    }
}
