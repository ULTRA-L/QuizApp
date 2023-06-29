package com.main.Game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainViewController {

    @FXML
    private Button btnStart;

    @FXML
    private AnchorPane mainViewAnchor;

    @FXML
    void loadNextScene(ActionEvent event) throws IOException {
        new SceneSwitch(mainViewAnchor, "NameEntryView.fxml");
    }

}
