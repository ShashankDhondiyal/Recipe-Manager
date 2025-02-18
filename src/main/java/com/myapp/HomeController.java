package com.myapp;

import java.io.IOException;
import javafx.fxml.FXML;

public class HomeController {

    @FXML
    private void switchToLibrary() throws IOException {
        App.setRoot("library");
    }

    @FXML
    private void switchToItemizer() throws IOException {
        App.setRoot("itemizer");
    }
}
