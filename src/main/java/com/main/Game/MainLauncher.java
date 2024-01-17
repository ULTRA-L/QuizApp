package com.main.Game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.IOException;

public class MainLauncher extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainLauncher.class.getResource("MainMenuView.fxml"));
        Pane root = fxmlLoader.load();

        Rectangle gradientRectangle = new Rectangle(1280, 720);
        gradientRectangle.setStyle("-fx-fill: linear-gradient(from 0% 0% to 100% 100%, purple, pink);");
        root.getChildren().add(0, gradientRectangle);
        System.out.println();

        stage.getIcons().add(new Image(MainLauncher.class.getResource("/com/main/Images/logo.png").openStream()));

        Scene scene = new Scene(root, 1280, 720);
        stage.setTitle("Quiz Up! - Application");
        stage.setScene(scene);
        stage.show();

        // Animation
        gradientRectangle.setRotate(0);
        gradientRectangle.widthProperty().addListener((obs, oldVal, newVal) -> {
            double width = newVal.doubleValue();
            double angle = width / scene.getWidth() * 10; // Increase the value to make it move faster
            gradientRectangle.setStyle(String.format("-fx-fill: linear-gradient(from 0%% 0%% to 100%% 100%%, purple, pink); -fx-rotate: %.1f;", angle));
        });

    }


    public static void main(String[] args) {
        launch();
    }
}
