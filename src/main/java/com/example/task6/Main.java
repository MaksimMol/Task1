package com.example.task6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/task6/layout.fxml"));
        primaryStage.setScene(new Scene(loader.load()));
        primaryStage.setTitle("Drawing Shapes");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}