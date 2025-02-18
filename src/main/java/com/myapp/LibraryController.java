package com.myapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class LibraryController {

    @FXML
    private void switchToHome() throws IOException {
        App.setRoot("home");
    }

    @FXML
    private void switchToItemizer() throws IOException {
        App.setRoot("itemizer");
    }

    @FXML
    private void switchToLibrary() throws IOException {
        App.setRoot("library");
    }

    @FXML
    private void AppExit() throws IOException {
        System.exit(0);
    }
}