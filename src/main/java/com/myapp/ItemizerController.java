package com.myapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class ItemizerController {

    @FXML
    private void switchToHome() throws IOException {
        App.setRoot("home");
    }

    @FXML
    private void switchToLibrary() throws IOException {
        App.setRoot("library");
    }
}