package pl.javastart.mvc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameTextField;

    @FXML
    private Label primaryLabel;

    @FXML
    private Button loginButton;

    public void initialize(){
        String labelText = primaryLabel.getText();
        System.out.println(labelText);
        usernameTextField.setText("Tekst z kontrolera");
    }

}
