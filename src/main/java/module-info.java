module com.example.pdproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;
    //requires mysql.connector.j;

    opens com.example.pdproject to javafx.fxml;
    exports com.example.pdproject;
    exports com.main.Game;
    opens com.main.Game to javafx.fxml;
}