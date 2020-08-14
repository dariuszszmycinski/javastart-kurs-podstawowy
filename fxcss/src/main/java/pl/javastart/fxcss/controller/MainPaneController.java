package pl.javastart.fxcss.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainPaneController {

    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button upperCaseButton;

    @FXML
    private Button lowerCaseButton;

    @FXML
    private Button clearButton;

    public void initialize() {
        upperCaseButton.setOnAction(action -> mainTextArea.setText(mainTextArea.getText().toUpperCase()));
        lowerCaseButton.setOnAction(action -> mainTextArea.setText(mainTextArea.getText().toLowerCase()));
        clearButton.setOnAction(action -> mainTextArea.setText(""));
    }
}