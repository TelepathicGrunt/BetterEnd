package ru.betterend.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import ru.betterend.blocks.basis.PottableFeatureSapling;
import ru.betterend.registry.EndBlocks;
import ru.betterend.registry.EndFeatures;

public class PythadendronSaplingBlock extends PottableFeatureSapling {
	public PythadendronSaplingBlock() {
		super((state)->EndFeatures.PYTHADENDRON_TREE.getFeature());
	}
	
	@Override
	public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
		return world.getBlockState(pos.below()).is(EndBlocks.CHORUS_NYLIUM);
	}
	
	@Override
	public boolean canPlantOn(Block block) {
		return block == EndBlocks.CHORUS_NYLIUM;
	}
}
