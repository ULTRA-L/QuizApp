package com.main.Game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AboutUsController {

    @FXML
    private AnchorPane aboutUsAnchor;

    @FXML
    private Button btnBack;

    @FXML
    void OnMainMenu(ActionEvent event) {

    }

    @FXML
    void goBackMainMenu(ActionEvent event) throws IOException {
        new SceneSwitch(aboutUsAnchor, "MainMenuView.fxml");
    }

}
