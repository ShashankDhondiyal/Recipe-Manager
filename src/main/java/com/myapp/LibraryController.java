package com.myapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class LibraryController {

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
        
    }

    @FXML
    private void AppExit() throws IOException {
        System.exit(0);
    }
}