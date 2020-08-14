package pl.javastart.downloader.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;

public class Downloader {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.wykop.pl");

        Document document = Jsoup.parse(url,3000);
        Elements h2Elements = document.select("h2");
        for (Element h2:h2Elements){
            String h2Url = h2.select("a").first().attr("href");
            String h2Text = h2.text();
            System.out.println(h2Text+"::::"+h2Url);
        }
    }
}
