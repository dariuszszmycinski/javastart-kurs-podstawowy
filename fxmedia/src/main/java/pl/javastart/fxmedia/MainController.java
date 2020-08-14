package pl.javastart.fxmedia;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MainController {

    @FXML
    private Button playButton;
    @FXML
    private MediaView mediaView;

    public void initialize() {
        Media media = new Media("https://img-9gag-fun.9cache.com/photo/aXgjKmg_460svav1.mp4");
        MediaPlayer player = new MediaPlayer(media);
        player.setAutoPlay(true);
        mediaView.setMediaPlayer(player);

        playButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (player.getStatus() == MediaPlayer.Status.READY || player.getStatus() == MediaPlayer.Status.PAUSED) {
                    player.play();
                    playButton.setText("Pause");
                } else {
                    player.pause();
                    playButton.setText("Play");
                }
            }
        });
    }
}