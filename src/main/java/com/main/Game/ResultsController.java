package com.main.Game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.sql.SQLException;

public class ResultsController {

    @FXML
    private ImageView ResultsLabel;

    @FXML
    private Button btnResultProceed;

    @FXML
    private Label marksResult;

    @FXML
    private Label resultQuote;

    @FXML
    private AnchorPane resultsPageAnchor;

    @FXML
    private Label scoreResults;

    @FXML
    private Label timeResult;

    @FXML
    void on(ActionEvent event) throws IOException {
        new SceneSwitch(resultsPageAnchor, "highScoreView.fxml");
    }

    public void initialize() throws SQLException, ClassNotFoundException {
        SceneSwitch data = new SceneSwitch();
        SQLConnect sql = new SQLConnect(data.getTopic(), data.getDifficulty());
        String[] result = sql.getLatestScore();

        timeResult.setText(timeConvert(Integer.parseInt(result[3])));
        marksResult.setText(result[2]+"/10");
        scoreResults.setText(result[4]);

        int score = Integer.parseInt(result[2]);
        if (score < 3) {
            resultQuote.setText("Try Better Next Time");
        } else if (score >= 3 && score <= 6) {
            resultQuote.setText("Nice Try");
        } else if (score >= 7 && score <= 9) {
            resultQuote.setText("You're outstanding!");
        } else if (score == 10) {
            resultQuote.setText("You got perfect!");
        }
    }

    private String timeConvert(int time){
        int sec = time % 60;
        int min = (time / 60);
        String result = String.format("%02d", min) + ":" + String.format("%02d", sec);
        return result;
    }
}
