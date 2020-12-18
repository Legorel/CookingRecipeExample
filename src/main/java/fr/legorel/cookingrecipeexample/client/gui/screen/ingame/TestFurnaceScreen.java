package fr.legorel.cookingrecipeexample.client.gui.screen.ingame;

import fr.legorel.cookingrecipeexample.screen.TestFurnaceScreenHandler;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.AbstractFurnaceScreen;
import net.minecraft.client.gui.screen.recipebook.FurnaceRecipeBookScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class TestFurnaceScreen extends AbstractFurnaceScreen<TestFurnaceScreenHandler> {
    private static final Identifier BACKGROUND = new Identifier("textures/gui/container/furnace.png");

    public TestFurnaceScreen(TestFurnaceScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, new FurnaceRecipeBookScreen(), inventory, title, BACKGROUND);
    }
}
