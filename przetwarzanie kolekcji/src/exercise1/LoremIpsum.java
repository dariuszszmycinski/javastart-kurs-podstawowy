package exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class LoremIpsum {
    static String fileName = "loremipsum-129.txt";

    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new FileReader(fileName));

        List<String> words = reader.lines()
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
                .collect(Collectors.toList());

        long countWords = words.stream()
                .filter(s -> s.startsWith("s"))
                .peek(s -> System.out.print(s+" "))
                .count();
        System.out.println("\nLiczba słów na S: "+countWords);

        long countFives = words.stream()
                .filter(s -> s.length()==5)
                .peek(s -> System.out.print(s+" "))
                .count();
        System.out.println("\nLiczba słów 5-literowych: "+countFives);

        reader.close();






    }
}
