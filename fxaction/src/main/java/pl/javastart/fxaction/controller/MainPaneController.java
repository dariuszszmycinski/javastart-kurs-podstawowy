package pl.javastart.fxaction.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class MainPaneController {

    @FXML
    private TextArea leftTextArea;

    @FXML
    private TextArea rightTextArea;

    @FXML
    private Button clearButton;

    public void initialize(){

    }

    @FXML
    public void clearBothTextAreas(ActionEvent event){
        leftTextArea.clear();
        rightTextArea.clear();
    }

    @FXML
    public void leftType(KeyEvent event){
        String text = event.getCharacter()+rightTextArea.getText();
        rightTextArea.setText(text);
    }

    @FXML
    public void rightType(KeyEvent event){
        String text = event.getCharacter()+leftTextArea.getText();
        leftTextArea.setText(text);
    }

}
