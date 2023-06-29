package com.main.Game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class NameEntryView {

    @FXML
    private Button btnProceedName;

    @FXML
    private AnchorPane nameEntryAnchor;

    @FXML
    private TextField nameEntryText;

    @FXML
    void onLoadScene(ActionEvent event) throws IOException {
        String saveName = nameEntryText.getText();

        new SceneSwitch(nameEntryAnchor, "TopicMenuView.fxml");
    }

}
