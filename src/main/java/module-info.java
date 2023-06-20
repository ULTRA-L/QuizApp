module com.example.pdproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.pdproject to javafx.fxml;
    exports com.example.pdproject;
}