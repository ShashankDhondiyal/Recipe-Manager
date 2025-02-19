package com.myapp;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class ItemizerController {
    @FXML
    private VBox ingredientCheckboxContainer;

    @FXML
    private void switchToSearch() throws IOException {
        App.setRoot("search");
    }

    @FXML
    private void switchToLibrary() throws IOException {
        App.setRoot("library");
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