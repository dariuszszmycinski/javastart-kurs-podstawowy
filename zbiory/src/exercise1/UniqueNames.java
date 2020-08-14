package exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class UniqueNames {
    public static void main(String[] args)  {
        String fileName = "namespl.txt";

        TreeSet<String> names = new TreeSet(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return -s1.compareTo(s2);
            }
        });

        try{
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()){
                names.add(scanner.nextLine());
            }
            scanner.close();
        }catch (FileNotFoundException e){
            System.err.println("Brak pliku "+fileName);
        }

        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.first());
        System.out.println(names.last());
    }

}
