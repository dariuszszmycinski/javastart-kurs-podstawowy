package pl.javastart.mp3reader;

import org.farng.mp3.MP3File;
import org.farng.mp3.TagException;
import org.farng.mp3.id3.AbstractID3v2;

import java.io.File;
import java.io.IOException;

public class Mp3DataReader {
    public static void main(String[] args) throws IOException, TagException {
        File file  = new File("06 - Chop Suey!.mp3");
        MP3File mp3File = new MP3File(file);
        AbstractID3v2 id3vTag = mp3File.getID3v2Tag();
        String album = id3vTag.getAlbumTitle();
        String author = id3vTag.getLeadArtist();
        String title = id3vTag.getSongTitle();
        System.out.println("Album: "+album);
        System.out.println("Wykonawca: "+author);
        System.out.println("Tytuł: "+title);

    }
}
