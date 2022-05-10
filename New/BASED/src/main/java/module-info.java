module com.example.based {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.based to javafx.fxml;
    opens com.example.based.controllers to javafx.fxml;
    exports com.example.based;
    exports com.example.based.controllers;
    exports com.example.based.Algorithms;
    exports com.example.based.timing;

}