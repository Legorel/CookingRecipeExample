package fr.legorel.cookingrecipeexample;

import fr.legorel.cookingrecipeexample.block.TestFurnace;
import fr.legorel.cookingrecipeexample.block.entity.TestFurnaceBlockEntity;
import fr.legorel.cookingrecipeexample.recipe.TestRecipe;
import fr.legorel.cookingrecipeexample.screen.TestFurnaceScreenHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CookingRecipeExample implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "cookingrecipeexample";
    public static final String MOD_NAME = "CookingRecipeExample";

    public static final Block TEST_FURNACE_BLOCK;
    public static final BlockEntityType TEST_FURNACE_BLOCK_ENTITY;

    public static final RecipeType<TestRecipe> TEST_RECIPE_TYPE;

    public static final RecipeSerializer<TestRecipe> TEST_RECIPE_SERIALIZER;

    public static final ScreenHandlerType<TestFurnaceScreenHandler> TEST_FURNACE_SCREEN_HANDLER;

    static {
        TEST_FURNACE_BLOCK = Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "test_furnace"), new TestFurnace(FabricBlockSettings.of(Material.METAL)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "test_furnace"), new BlockItem(TEST_FURNACE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        TEST_FURNACE_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MOD_ID, "test_furnace"), BlockEntityType.Builder.create(TestFurnaceBlockEntity::new, TEST_FURNACE_BLOCK).build(null));

        TEST_RECIPE_TYPE = Registry.register(Registry.RECIPE_TYPE, new Identifier(MOD_ID, "test_furnace"), new RecipeType<TestRecipe>() {
            @Override
            public String toString() {
                return "test_furnace";
            }
        });

        TEST_RECIPE_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MOD_ID, "test_furnace"), new CookingRecipeSerializer(TestRecipe::new, 200));

        TEST_FURNACE_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(MOD_ID, "test_furnace"), TestFurnaceScreenHandler::new);
    }

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}