package com.myapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Scene scene;
    private static boolean isDarkTheme = false;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("search"), 1920, 1080);
        stage.setScene(scene);
        stage.setTitle("Recipe Application");
        stage.setWidth(1920);
        stage.setHeight(1080);
        applyTheme(); // Apply the initial theme
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
        applyTheme(); // Apply the current theme when switching scenes
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void switchTheme() {
        isDarkTheme = !isDarkTheme;
        applyTheme();
    }

    private static void applyTheme() {
        scene.getStylesheets().clear();
        if (isDarkTheme) {
            scene.getStylesheets().add(App.class.getResource("/com/myapp/darkTheme.css").toExternalForm());
        } else {
            scene.getStylesheets().add(App.class.getResource("/com/myapp/lightTheme.css").toExternalForm());
        }
    }

    public static void main(String[] args) {
        launch();
    }

}