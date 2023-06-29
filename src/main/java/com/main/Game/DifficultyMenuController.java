package com.main.Game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DifficultyMenuController {

    @FXML
    private Button btnEasyChoice;

    @FXML
    private Button btnHardChoice;

    @FXML
    private Button btnMediumChoice;

    @FXML
    private AnchorPane difficultyMenuAnchor;

    @FXML
    void chooseEasy(ActionEvent event) throws IOException {
        new SceneSwitch("easy",difficultyMenuAnchor, "GeneralQuizView.fxml");
    }

    @FXML
    void chooseHard(ActionEvent event) throws IOException {
        new SceneSwitch("hard",difficultyMenuAnchor, "GeneralQuizView.fxml");
    }

    @FXML
    void chooseMedium(ActionEvent event) throws IOException {
        new SceneSwitch("medium",difficultyMenuAnchor, "GeneralQuizView.fxml");
    }

}
