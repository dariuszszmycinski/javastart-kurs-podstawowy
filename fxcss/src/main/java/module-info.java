module fxcss {
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.javastart.fxcss.app;
    opens pl.javastart.fxcss.controller to javafx.fxml;
}