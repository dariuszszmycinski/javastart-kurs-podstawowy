
module fxmodules {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.media;

    exports pl.javastart.fxmedia;
    opens pl.javastart.fxmedia to javafx.fxml;
}