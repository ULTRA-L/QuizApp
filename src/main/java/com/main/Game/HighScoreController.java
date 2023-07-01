package com.main.Game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.IOException;
import java.sql.SQLException;

public class HighScoreController {

    @FXML
    private Button btnMainMenu;

    @FXML
    private AnchorPane highScoreAnchor;

    @FXML
    private VBox name_field;
    //private Label playerName;

    @FXML
    private VBox score_field;
    //private Label scoreResult;

    @FXML
    private void initialize() throws SQLException, ClassNotFoundException {
        SceneSwitch data = new SceneSwitch();
        SQLConnect sql = new SQLConnect(data.getTopic(),data.getDifficulty());

        String[][] top5 = sql.getTop5();
        for (String[] player: top5) {
            Text text = new Text(player[1]);
            text.setFont(Font.font("System",32));
            name_field.getChildren().add(text);

            text = new Text(player[4]);
            text.setFont(Font.font("System",32));
            score_field.getChildren().add(text);
        }
    }
    @FXML
    void onMainMenu(ActionEvent event) throws IOException {
        new SceneSwitch(highScoreAnchor, "MainMenuView.fxml");
    }

}
