package com.main.Game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

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

    public void initialize() {
        int score = Integer.parseInt(scoreResults.getText());
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
}
