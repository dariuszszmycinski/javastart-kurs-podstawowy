package example1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        try(
                var writer = new BufferedWriter(new FileWriter(fileName,true));

                ){
            writer.write("Bolek");
            writer.newLine();
            writer.write("Lolek");
            writer.newLine();
            writer.write("Karolek");
            writer.newLine();
        }catch (IOException e){
            System.err.println("Nie udało się zapisać pliku "+fileName);
        }
    }
}
