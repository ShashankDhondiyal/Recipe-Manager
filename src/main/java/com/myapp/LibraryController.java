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
}