module com.example.based {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.based to javafx.fxml;
    exports com.example.based;
}