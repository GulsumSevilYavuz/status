module com.example.status {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.status to javafx.fxml;
    exports com.example.status;
}