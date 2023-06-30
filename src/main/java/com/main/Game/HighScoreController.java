package com.main.Game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HighScoreController {

    @FXML
    private Button btnMainMenu;

    @FXML
    private AnchorPane highScoreAnchor;

    @FXML
    private Label playerName;

    @FXML
    private Label scoreResult;

    @FXML
    void onMainMenu(ActionEvent event) throws IOException {
        new SceneSwitch(highScoreAnchor, "MainMenuView.fxml");
    }

}
