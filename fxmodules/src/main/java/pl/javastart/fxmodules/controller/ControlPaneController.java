package pl.javastart.fxmodules.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ControlPaneController {

    @FXML
    private Button upperCaseButton;

    @FXML
    private Button lowerCaseButton;

    public Button getUpperCaseButton() {
        return upperCaseButton;
    }

    public Button getLowerCaseButton() {
        return lowerCaseButton;
    }

    public void initialize(){
        System.out.println("ControlPaneController created");
    }
}
