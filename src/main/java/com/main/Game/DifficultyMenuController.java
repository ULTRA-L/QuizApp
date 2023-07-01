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
    private final SceneSwitch ss = new SceneSwitch();

    @FXML
    void chooseEasy(ActionEvent event) throws IOException {
        if(ss.getTopic() == "english_quiz"){
            new SceneSwitch("easy",difficultyMenuAnchor, "EnglishQuizView.fxml");
        }else if(ss.getTopic() == "general_quiz"){
            new SceneSwitch("easy",difficultyMenuAnchor, "GeneralQuizView.fxml");
        }else if(ss.getTopic() == "math_quiz"){
            new SceneSwitch("easy",difficultyMenuAnchor, "MathQuizView.fxml");
        }
    }

    @FXML
    void chooseHard(ActionEvent event) throws IOException {
        if(ss.getTopic() == "english_quiz"){
            new SceneSwitch("hard",difficultyMenuAnchor, "EnglishQuizView.fxml");
        }else if(ss.getTopic() == "general_quiz"){
            new SceneSwitch("hard",difficultyMenuAnchor, "GeneralQuizView.fxml");
        }else if(ss.getTopic() == "math_quiz"){
            new SceneSwitch("hard",difficultyMenuAnchor, "MathQuizView.fxml");
        }
    }

    @FXML
    void chooseMedium(ActionEvent event) throws IOException {
        if(ss.getTopic() == "english_quiz"){
            new SceneSwitch("medium",difficultyMenuAnchor, "EnglishQuizView.fxml");
        }else if(ss.getTopic() == "general_quiz"){
            new SceneSwitch("medium",difficultyMenuAnchor, "GeneralQuizView.fxml");
        }else if(ss.getTopic() == "math_quiz"){
            new SceneSwitch("medium",difficultyMenuAnchor, "MathQuizView.fxml");
        }
    }

}
