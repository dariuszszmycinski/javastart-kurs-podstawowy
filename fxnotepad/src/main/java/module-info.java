module fxcss {
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.javastart.cssnotepad.main;
    opens pl.javastart.cssnotepad.controller to javafx.fxml;
}