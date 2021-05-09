package com.github.jamesledgard.myfabricmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FastBoots implements ModInitializer {
    public static final ArmorItem FAST_BOOTS = new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.FEET,new FabricItemSettings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("flashmod", "george_fast_boots"),FAST_BOOTS);
    }
}
