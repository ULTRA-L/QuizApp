package com.main.Game;

import com.example.pdproject.MainLauncher;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;
public class SceneSwitch {
    public SceneSwitch(AnchorPane currentAnchorPane, String fxml) throws IOException {
        AnchorPane nextAnchorPane = FXMLLoader.load(Objects.requireNonNull(MainLauncher.class.getResource(fxml)));
        currentAnchorPane.getChildren().removeAll();
        currentAnchorPane.getChildren().setAll(nextAnchorPane);
    }
}
