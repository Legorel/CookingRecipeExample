package fr.legorel.cookingrecipeexample.block.entity;

import fr.legorel.cookingrecipeexample.CookingRecipeExample;
import fr.legorel.cookingrecipeexample.screen.TestFurnaceScreenHandler;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;

public class TestFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    public TestFurnaceBlockEntity() {
        super(CookingRecipeExample.TEST_FURNACE_BLOCK_ENTITY, CookingRecipeExample.TEST_RECIPE_TYPE);
    }

    @Override
    public Text getContainerName() {
        return Text.of("test furnace");
    }

    @Override
    public ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new TestFurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}
