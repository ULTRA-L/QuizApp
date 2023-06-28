package com.main.Game;

import com.example.pdproject.MainLauncher;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChoiceGame extends Application {
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainLauncher.class.getResource("ChoiceGameUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),453,400);
        primaryStage.setTitle("Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
