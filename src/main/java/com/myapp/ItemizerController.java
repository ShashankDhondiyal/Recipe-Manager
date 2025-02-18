package com.myapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class ItemizerController {

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
        
    }

    @FXML
    private void AppExit() throws IOException {
        System.exit(0);
    }
}