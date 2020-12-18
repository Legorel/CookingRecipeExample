package fr.legorel.cookingrecipeexample.screen;

import fr.legorel.cookingrecipeexample.CookingRecipeExample;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.PropertyDelegate;

public class TestFurnaceScreenHandler extends AbstractFurnaceScreenHandler {
    public TestFurnaceScreenHandler(int i, PlayerInventory playerInventory) {
        super(CookingRecipeExample.TEST_FURNACE_SCREEN_HANDLER, CookingRecipeExample.TEST_RECIPE_TYPE, RecipeBookCategory.FURNACE, i, playerInventory);
    }

    public TestFurnaceScreenHandler(int i, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
        super(CookingRecipeExample.TEST_FURNACE_SCREEN_HANDLER, CookingRecipeExample.TEST_RECIPE_TYPE, RecipeBookCategory.FURNACE, i, playerInventory, inventory, propertyDelegate);
    }
}
