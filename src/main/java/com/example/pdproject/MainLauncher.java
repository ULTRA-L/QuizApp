package com.example.pdproject;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.IOException;

public class MainLauncher extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainLauncher.class.getResource("MainMenuView.fxml"));
        Pane root = fxmlLoader.load();

        Rectangle gradientRectangle = new Rectangle(1280, 720);
        gradientRectangle.setStyle("-fx-fill: linear-gradient(from 0% 0% to 100% 100%, purple, pink);");
        root.getChildren().add(0, gradientRectangle);

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

        // Scale Animation
        ImageView imageFrame = new ImageView("https://github.com/ULTRA-L/PD_Project/blob/84b3cdc4464db491901cb176473a133c1011c0b1/src/main/resources/com/example/Images/quizAppTitle.png");  // Replace with the actual path to your image
        imageFrame.setFitWidth(700);
        imageFrame.setFitHeight(300);
        imageFrame.setTranslateX(300);
        imageFrame.setTranslateY(40);

        root.getChildren().add(imageFrame);

        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(2), imageFrame);
        scaleTransition.setFromX(1.0);
        scaleTransition.setFromY(1.0);
        scaleTransition.setToX(1.15);
        scaleTransition.setToY(1.15);
        scaleTransition.setAutoReverse(true);
        scaleTransition.setCycleCount(ScaleTransition.INDEFINITE);
        scaleTransition.play();

    }


    public static void main(String[] args) {
        launch();
    }
}
