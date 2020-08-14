package exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ela","Ola","Ala","Tola","Pola");
        System.out.println(names);
        Collections.sort(names,String::compareToIgnoreCase);
        System.out.println(names);
    }
}
