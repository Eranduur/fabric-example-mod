package com.github.eranduur;

import com.github.eranduur.blocks.CopperOreBlock;
import com.github.eranduur.blocks.FishscaleCobblestoneBlock;
import com.github.eranduur.items.BasicItem;
import com.github.eranduur.items.CreeperHeartItem;
import com.github.eranduur.items.LuteItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TestMod implements ModInitializer {

	private static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier("testmod", "group"), () -> new ItemStack(TestMod.LUTE));

	//Sounds
	private static final Identifier LUTE_NOISE_ID = new Identifier("testmod:lute_noise");
	public static SoundEvent LUTE_NOISE_EVENT = new SoundEvent(LUTE_NOISE_ID);

	//Items
	private static final Item CREEPER_HEART = new CreeperHeartItem(new Item.Settings().group(TestMod.GROUP).maxCount(32));
	private static final Item LUTE = new LuteItem(new Item.Settings().group(TestMod.GROUP).maxCount(1));

	//Brain's stupid item that he made me make him
	private static final Item BRIAN_ITEM = new BasicItem(new Item.Settings().group(TestMod.GROUP).maxCount(1));

	//Blocks
	private static final Block FISHSCALE_COBBLESTONE = new FishscaleCobblestoneBlock(FabricBlockSettings.of(Material.STONE).build());
	private static final Item FISHSCALE_COBBLESTONE_ITEM = new BlockItem(FISHSCALE_COBBLESTONE, new Item.Settings().group(TestMod.GROUP));

	private static final Block COPPER_ORE = new CopperOreBlock(FabricBlockSettings.of(Material.STONE).build());
	private static final Item COPPER_ORE_ITEM = new BlockItem(COPPER_ORE, new Item.Settings().group(TestMod.GROUP));

	@Override
	public void onInitialize() {
		//Items
		Registry.register(Registry.ITEM, new Identifier("testmod", "creeper_heart"), CREEPER_HEART);
		Registry.register(Registry.ITEM, new Identifier("testmod", "lute"), LUTE);

		//Brain's stupid item that he made me make him
		Registry.register(Registry.ITEM, new Identifier("testmod", "brian_item"), BRIAN_ITEM);

		//Blocks
		Registry.register(Registry.BLOCK, new Identifier("testmod", "fishscale_cobblestone"), FISHSCALE_COBBLESTONE);
		Registry.register(Registry.ITEM, new Identifier("testmod", "fishscale_cobblestone"), FISHSCALE_COBBLESTONE_ITEM);

		Registry.register(Registry.BLOCK, new Identifier("testmod", "copper_ore"), COPPER_ORE);
		Registry.register(Registry.ITEM, new Identifier("testmod", "copper_ore"), COPPER_ORE_ITEM);

		//Sounds
		Registry.register(Registry.SOUND_EVENT, TestMod.LUTE_NOISE_ID, LUTE_NOISE_EVENT);

		System.out.println("Hello Fabric world!");
	}
}