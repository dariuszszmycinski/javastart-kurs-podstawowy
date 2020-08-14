package main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label label1;

    @FXML
    private Button button1;

    @FXML
    private Label label2;

    @FXML
    private Button button2;

    public void initialize(){
        label1.setText("Etykieta1");
        label2.setText("Etykieta2");
        button1.setText("Przycisk1");
        button2.setText("Przycisk2");
    }

}
