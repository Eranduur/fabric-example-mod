package com.github.eranduur.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FishscaleCobblestoneBlock extends Block {

    public FishscaleCobblestoneBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState blockState, World world, BlockPos blockPos, PlayerEntity playerEntity, Hand hand, BlockHitResult blockHitResult) {


        //Lights block on fire when clicked on with Flint
        /***
        ItemStack itemStack = playerEntity.getMainHandStack();
        if(itemStack.getItem().equals(Items.FLINT)) {
            world.setBlockState(blockPos.up(), Blocks.FIRE.getDefaultState());
        }
         ***/

        return super.onUse(blockState, world, blockPos, playerEntity, hand, blockHitResult);
    }
}
