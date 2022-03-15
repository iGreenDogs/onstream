package me.bobwazheer.mods.onstream;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class OnStreamMain implements ModInitializer{

    public static final Item POG = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).alwaysEdible().saturationModifier(9f).snack().meat().statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 20*9999999, 5), 0.25f).build()));
    public static final Item BOB = new Item(new Item.Settings().group(ItemGroup.COMBAT).maxCount(1).maxDamage(10));
    public static final Block BOB_BLOCK = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("on", "pog"), POG);
        Registry.register(Registry.ITEM, new Identifier("on", "bob"), BOB);
    }

}