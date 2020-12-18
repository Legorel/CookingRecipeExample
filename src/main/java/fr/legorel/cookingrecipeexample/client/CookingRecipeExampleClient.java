package fr.legorel.cookingrecipeexample.client;

import fr.legorel.cookingrecipeexample.CookingRecipeExample;
import fr.legorel.cookingrecipeexample.client.gui.screen.ingame.TestFurnaceScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

@Environment(EnvType.CLIENT)
public class CookingRecipeExampleClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(CookingRecipeExample.TEST_FURNACE_SCREEN_HANDLER, TestFurnaceScreen::new);
    }
}
