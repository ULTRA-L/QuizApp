module com.example.pdproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;
    requires mysql.connector.j;

    exports com.main.Game;
    opens com.main.Game to javafx.fxml;
    exports com.example.test;
    opens com.example.test to javafx.fxml;
}