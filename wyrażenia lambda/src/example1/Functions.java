package example1;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functions {
    public static void main(String[] args) {
        //przerobienie napisu
        Function<String, String> func = text -> text.toLowerCase().trim();
        String original = "   WIELKI NAPIS  ";
        String lowerCaseTrim = func.apply(original);
        System.out.println(lowerCaseTrim);

        //zwielokrotnienie napisu
        Consumer<String> print3Times = s -> {
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        };
        print3Times.accept("abc");
        print3Times.accept("xxx");

        //sprawdzenie pełnoletności
        int personAge = 19;
        Predicate<Integer> checkIfAdult = age -> age>=18;
        if (checkIfAdult.test(personAge)){
            System.out.println("Osoba pełnoletnia");
        }

        //losowanie osoby
        String [] firstNames = {"Jan", "Karol", "Piotr", "Adrzej"};
        String[] lastNames = {"Kowalski", "Abacki", "Zalewski", "Korzeniewski"};
        int[] ages = {22,33,44,55};
        Random random = new Random();
        Supplier<Person> supplier = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            Person randomPerson = new Person(firstName,lastName,age);
            return new Person(firstName,lastName,age);
        };
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            people.add(supplier.get());
        }
        for (Person person:people){
            System.out.println(person);
        }
    }
}
