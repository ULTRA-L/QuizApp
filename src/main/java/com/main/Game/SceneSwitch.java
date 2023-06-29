package com.main.Game;

import com.example.pdproject.MainLauncher;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;
public class SceneSwitch {
    private static String topic;
    private static String difficulty;
    public SceneSwitch(AnchorPane currentAnchorPane, String fxml) throws IOException {
        AnchorPane nextAnchorPane = FXMLLoader.load(Objects.requireNonNull(MainLauncher.class.getResource(fxml)));
        currentAnchorPane.getChildren().removeAll();
        currentAnchorPane.getChildren().setAll(nextAnchorPane);
    }
    public SceneSwitch(AnchorPane currentAnchorPane, String fxml, String topic) throws IOException{
        this.topic = topic;
        new SceneSwitch(currentAnchorPane, fxml);
    }
    public SceneSwitch(String difficulty, AnchorPane currentAnchorPane, String fxml) throws IOException{
        this.difficulty = difficulty;
        new SceneSwitch(currentAnchorPane, fxml);
    }
    public SceneSwitch(){}

    public String getTopic() {
        return topic;
    }

    public String getDifficulty() {
        return difficulty;
    }
}
