package me.xanetie.automationbyxanetie.item;

import me.xanetie.automationbyxanetie.AutomationByXanetie;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Properties()));

    public static Item registerItem(String id, Item item){
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(AutomationByXanetie.MOD_ID, id), item);
    }
    public static void registerModItems() {
        AutomationByXanetie.LOGGER.info("Registering New Items >-< for " + AutomationByXanetie.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register((itemGroup)->itemGroup.accept(ModItems.PINK_GARNET));
    }
}
