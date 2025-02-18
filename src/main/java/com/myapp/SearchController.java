package com.myapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class SearchController {

    @FXML
    private void switchToLibrary() throws IOException {
        App.setRoot("library");
    }

    @FXML
    private void switchToItemizer() throws IOException {
        App.setRoot("itemizer");
    }


    @FXML
    private void AppExit() throws IOException {
        System.exit(0);
    }

    @FXML
    private void NameSearch() throws IOException {
    }

    @FXML
    private void switchTheme() throws IOException {
        
    }
    
    @FXML
    private void IngredientSearch() throws IOException {
    }
}
