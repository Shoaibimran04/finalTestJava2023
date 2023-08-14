module com.example.finaltestjava2023 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finaltestjava2023 to javafx.fxml;
    exports com.example.finaltestjava2023;
}