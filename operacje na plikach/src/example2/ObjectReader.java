package example2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person pl = null;

        try (
                var fis = new FileInputStream(fileName);
                var ois = new ObjectInputStream(fis);
        ) {
            pl=(Person) ois.readObject();
        }catch (ClassNotFoundException|IOException e){
            System.err.println("Nie udało się odczytać pliku");
            e.printStackTrace();
        }

        if(pl!=null){
            System.out.println("Wczytane dane o: ");
            System.out.println(pl.getFirstName()+" "+pl.getLastName());
        }
    }
}
