package com.main.Game;

import com.example.pdproject.MainLauncher;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;
public class SceneSwitch {
    private static String topic;
    private static String difficulty;
    private static String name;
    public SceneSwitch(AnchorPane currentAnchorPane, String fxml) throws IOException {
        AnchorPane nextAnchorPane = FXMLLoader.load(Objects.requireNonNull(MainLauncher.class.getResource(fxml)));
        currentAnchorPane.getChildren().removeAll();
        currentAnchorPane.getChildren().setAll(nextAnchorPane);
    }
    public SceneSwitch(String name, String fxml, AnchorPane currentAnchorPane) throws IOException { //Set Name
        SceneSwitch.name = name;
        new SceneSwitch(currentAnchorPane,fxml);
    }
    public SceneSwitch(AnchorPane currentAnchorPane, String fxml, String topic) throws IOException{ //Set Topic
        SceneSwitch.topic = topic;
        new SceneSwitch(currentAnchorPane, fxml);
    }
    public SceneSwitch(String difficulty, AnchorPane currentAnchorPane, String fxml) throws IOException{ //Set Difficulty
        SceneSwitch.difficulty = difficulty;
        new SceneSwitch(currentAnchorPane, fxml);
    }
    public SceneSwitch(){}

    public String getTopic() {
        return topic;
    }

    public String getDifficulty() {
        return difficulty;
    }
    public String getName(){
        return name;
    }
}
