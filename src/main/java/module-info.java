module com.example.cosa {
    requires javafx.controls;
    requires javafx.fxml;


    opens example.cosa to javafx.fxml;
    exports example.cosa;
}