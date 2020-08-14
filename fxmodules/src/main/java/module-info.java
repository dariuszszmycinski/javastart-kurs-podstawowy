module fxmodules {
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.javastart.fxmodules.main;
    opens pl.javastart.fxmodules.controller to javafx.fxml;
}