module fxmvc {
    requires javafx.fxml;
    requires javafx.controls;

    exports main to javafx.graphics;
    opens main to javafx.fxml;
}