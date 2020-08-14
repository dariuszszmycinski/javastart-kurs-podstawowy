package example2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person pl = new Person("Jan","Kowalski");

        try(
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs);
                ){
            os.writeObject(pl);
            System.out.println("Zapisano obiekt do pliku");
        }catch (IOException e){
            System.err.println("Błąd zapisu pliku "+fileName);
            e.printStackTrace();
        }
    }
}
