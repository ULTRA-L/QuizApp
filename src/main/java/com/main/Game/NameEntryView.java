package com.main.Game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
        if(saveName.length() > 3 && saveName.length() <= 8){
            new SceneSwitch(saveName ,"TopicMenuView.fxml",nameEntryAnchor);
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR,"Name should have characters between 4 to 8 only!");
            alert.show();
        }

    }

}
