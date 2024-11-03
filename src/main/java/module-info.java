module com.personal {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.personal to javafx.fxml;
    exports com.personal;
}
