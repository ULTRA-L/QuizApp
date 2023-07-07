package com.main.Game;

import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class MainViewController {

    @FXML
    private Button btnStart;
    @FXML
    private Button btnExit;

    @FXML
    private Button btnAbout;

    @FXML
    private AnchorPane mainViewAnchor;
    @FXML
    private ImageView title;

    @FXML
    void onExitPress(){
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }
    @FXML
    void loadNextScene(ActionEvent event) throws IOException {
        new SceneSwitch(mainViewAnchor, "NameEntryView.fxml");
    }

    @FXML
    void onToAbout(ActionEvent event) throws IOException {
        new SceneSwitch(mainViewAnchor, "AboutUsView.fxml");
    }

    @FXML
    protected void initialize(){
        title.setFitWidth(700);
        title.setFitHeight(300);
        //title.setTranslateX(300);
        //title.setTranslateY(40);

        //root.getChildren().add(imageFrame);

        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(2), title);
        scaleTransition.setFromX(1.0);
        scaleTransition.setFromY(1.0);
        scaleTransition.setToX(1.15);
        scaleTransition.setToY(1.15);
        scaleTransition.setAutoReverse(true);
        scaleTransition.setCycleCount(ScaleTransition.INDEFINITE);
        scaleTransition.play();
    }



}
