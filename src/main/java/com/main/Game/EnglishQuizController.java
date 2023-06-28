package com.main.Game;

import com.example.pdproject.UITesting;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class EnglishQuizController extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FadeTransition fadeTransition;
        FXMLLoader fxmlLoader = new FXMLLoader(UITesting.class.getResource("EnglishQuizView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);

        ToggleButton btnChoice1 = new ToggleButton("Button 1");
        ToggleButton btnChoice2 = new ToggleButton("Button 2");
        ToggleButton btnChoice3 = new ToggleButton("Button 3");

        ToggleGroup toggleChoiceGroup = new ToggleGroup();
        btnChoice1.setToggleGroup(toggleChoiceGroup);
        btnChoice2.setToggleGroup(toggleChoiceGroup);
        btnChoice3.setToggleGroup(toggleChoiceGroup);

        HBox hBox = new HBox();
        hBox.getChildren().addAll(btnChoice1, btnChoice2, btnChoice3);

        Group root = new Group();
        root.getChildren().add(hBox);



        stage.setTitle("Test!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
