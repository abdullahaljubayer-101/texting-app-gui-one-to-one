module com.example.textingappguionetoone {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.textingappguionetoone to javafx.fxml;
    exports com.example.textingappguionetoone;
}