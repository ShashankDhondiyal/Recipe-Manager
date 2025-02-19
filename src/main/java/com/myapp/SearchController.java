package com.myapp;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;

public class SearchController {

    @FXML
    private VBox ingredientCheckboxContainer;

    private RecipeDataBase recipeDataBase;

    @FXML
    public void initialize() {
        recipeDataBase = new RecipeDataBase();

        // Add some dummy data for testing
        recipeDataBase.Ingredients.put("Salt", "Salt");
        recipeDataBase.Ingredients.put("Pepper", "Pepper");
        recipeDataBase.Ingredients.put("Olive Oil", "Olive Oil");

        recipeDataBase.Name.put("Recipe1", "Recipe1");
        recipeDataBase.Name.put("Recipe2", "Recipe2");
        recipeDataBase.Name.put("Recipe3", "Recipe3");
    }

    private void generateIngredientCheckboxes() {
        ingredientCheckboxContainer.getChildren().clear();
        for (String ingredient : recipeDataBase.Ingredients.keySet()) {
            CheckBox checkBox = new CheckBox(ingredient);
            checkBox.setPrefWidth(200); // Set preferred width
            ingredientCheckboxContainer.getChildren().add(checkBox);
        }
    }

    private void generateNameCheckboxes() {
        ingredientCheckboxContainer.getChildren().clear();
        for (String name : recipeDataBase.Name.keySet()) {
            CheckBox checkBox = new CheckBox(name);
            checkBox.setPrefWidth(200); // Set preferred width
            ingredientCheckboxContainer.getChildren().add(checkBox);
        }
    }

    @FXML
    private void switchToLibrary() throws IOException {
        App.setRoot("library");
    }

    @FXML
    private void switchToItemizer() throws IOException {
        App.setRoot("itemizer");
    }

    @FXML
    private void switchTheme() throws IOException {
        App.switchTheme();
    }

    @FXML
    private void AppExit() throws IOException {
        System.exit(0);
    }

    @FXML
    private void NameSearch() throws IOException {
        generateNameCheckboxes();
    }

    @FXML
    private void IngredientSearch() throws IOException {
        generateIngredientCheckboxes();
    }
}
