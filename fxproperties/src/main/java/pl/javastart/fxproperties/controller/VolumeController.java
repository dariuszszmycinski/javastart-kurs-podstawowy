package pl.javastart.fxproperties.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class VolumeController {

    @FXML
    private Slider volumeSlider;

    @FXML
    private Label volumeLevelLabel;

    public void initialize(){
        volumeLevelLabel.textProperty().bind(volumeSlider.valueProperty().asString());

        volumeSlider.valueProperty().addListener((observable,oldValue,newValue) ->{
            double volume = (Double) newValue;
            if (volume>75){
                System.out.println("Za głośno!");
            }else if (volume<10){
                System.out.println("Nic nie słychać");
            }
        });

    }

}
