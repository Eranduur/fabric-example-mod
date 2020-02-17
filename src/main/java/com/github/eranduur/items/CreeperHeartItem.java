package com.github.eranduur.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class CreeperHeartItem extends Item {

    public CreeperHeartItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        if(hand == Hand.MAIN_HAND) {
            System.out.println("Ssssss.......");
        }

        return super.use(world, playerEntity, hand);
    }
}
