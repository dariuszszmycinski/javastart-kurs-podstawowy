package exercise2;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.addAll;

public class MusicCollection {
    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP)
        );

        System.out.println("Długość piosenek gatunku Metal: "+genreDuration(songs, Song.Genre.METAL));

        System.out.println("Liczba piosenek zespołu Metallica: "+artistSongNumber(songs,"Metallica"));

        System.out.println("Piosenki bez POPu:"+songsWithoutGenre(songs, Song.Genre.POP).size());
        songsWithoutGenre(songs, Song.Genre.POP).forEach(System.out::println);

    }
    private static int genreDuration (List<Song> list, Song.Genre genre){
        int time = list.stream()
                .filter(song -> genre.equals(genre))
                .mapToInt(song -> song.getLength())
                .sum();
        return time;
    }

    private static long artistSongNumber (List<Song> list, String artist){
        long result = list.stream()
                .filter(song -> song.getArtist().equals(artist))
                .count();
        return result;
    }

    private static List<Song> songsWithoutGenre (List<Song> list, Song.Genre genre){
        return list.stream()
                .filter(song -> song.getGenre()!=genre)
                .distinct()
                .collect(Collectors.toList());
    }


}
