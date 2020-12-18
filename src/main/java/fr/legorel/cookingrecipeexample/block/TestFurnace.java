package fr.legorel.cookingrecipeexample.block;

import fr.legorel.cookingrecipeexample.block.entity.TestFurnaceBlockEntity;
import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class TestFurnace extends AbstractFurnaceBlock {
    public TestFurnace(Settings settings) {
        super(settings);
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockView world) {
        return new TestFurnaceBlockEntity();
    }

    @Override
    public void openScreen(World world, BlockPos pos, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof TestFurnaceBlockEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
            // Optional: increment player's stat
            player.incrementStat(Stats.INTERACT_WITH_FURNACE);
        }
    }
}
