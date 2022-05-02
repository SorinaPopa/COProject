module proiect.co.proiect_co_test {
    requires javafx.controls;
    requires javafx.fxml;


    opens proiect.co.proiect_co_test to javafx.fxml;
    exports proiect.co.proiect_co_test;
}