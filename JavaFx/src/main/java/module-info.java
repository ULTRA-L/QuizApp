module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                        
    opens com.example.javafx to javafx.fxml;
    exports com.example.javafx;
}