package com.myapp;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class LibraryController implements RecipeDataBase.RecipeAddedListener {

    @FXML
    private VBox ingredientCheckboxContainer;

    @FXML
    private TabPane tabPane;

    private RecipeDataBase recipeDataBase;

    @FXML
    public void initialize() {
        recipeDataBase = new RecipeDataBase();
        recipeDataBase.addListener(this);

        // Add some dummy data for testing
        recipeDataBase.addRecipe(new Attributes("Recipe1", "Salt", "Instruction1", 10));
        recipeDataBase.addRecipe(new Attributes("Recipe2", "Pepper", "Instruction2", 20));
        recipeDataBase.addRecipe(new Attributes("Recipe3", "Olive Oil", "Instruction3", 30));
    }

    @Override
    public void onRecipeAdded(Attributes attributes) {
        Tab newTab = new Tab(attributes.getNameAttribute());
        AnchorPane content = new AnchorPane();
        newTab.setContent(content);
        tabPane.getTabs().add(newTab);
    }

    @FXML
    private void switchToSearch() throws IOException {
        App.setRoot("search");
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
}