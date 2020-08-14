package pl.javastart.cssnotepad.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class NotepadController {

    @FXML
    private TextArea textArea;

    @FXML
    private Button button;

    public void initialize() {
        button.setOnAction(action -> textArea.clear());
    }
}