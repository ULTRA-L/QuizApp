package com.main.Game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class TopicMenuController {

    @FXML
    private Button btnEnglishTopic;

    @FXML
    private Button btnGeneralTopic;

    @FXML
    private Button btnMathTopic;

    @FXML
    private AnchorPane topicViewAnchor;

    @FXML
    void onChooseEnglish(ActionEvent event) throws IOException {
        new SceneSwitch(topicViewAnchor, "DifficultyMenuView.fxml");
    }

    @FXML
    void onChooseGeneral(ActionEvent event) throws IOException {
        new SceneSwitch(topicViewAnchor, "DifficultyMenuView.fxml");
    }

    @FXML
    void onChooseMath(ActionEvent event) throws IOException {
        new SceneSwitch(topicViewAnchor, "DifficultyMenuView.fxml");
    }

}
