package pl.javastart.downloader.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

public class ExampleParser {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.parse(new URL("http://example.com"),3000);
        String h1 = document.select("h1").first().text();
        String p = document.select("p").first().text();
        System.out.println("Nagłówek H1:\n"+h1);
        System.out.println("Pierwszy paragraf\n"+p);


    }
}
