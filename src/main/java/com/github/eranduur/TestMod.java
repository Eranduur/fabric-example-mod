package com.github.eranduur;

import com.github.eranduur.items.CreeperHeartItem;
import com.github.eranduur.items.LuteItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TestMod implements ModInitializer {

	private static final Item CREEPER_HEART = new CreeperHeartItem(new Item.Settings().group(ItemGroup.MATERIALS).maxCount(32));
	private static final Item LUTE = new LuteItem(new Item.Settings().group(ItemGroup.MISC).maxCount(1));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("testmod", "creeper_heart"), CREEPER_HEART);
		Registry.register(Registry.ITEM, new Identifier("testmod", "lute"), LUTE);

		System.out.println("Hello Fabric world!");
	}
}