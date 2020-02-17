package com.github.eranduur;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TestMod implements ModInitializer {

	private static final Item CREEPER_HEART = new CreeperHeartItem(new Item.Settings().group(ItemGroup.MATERIALS).maxCount(32));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("testmod", "creeperheart"), CREEPER_HEART);

		System.out.println("Hello Fabric world!");
	}
}