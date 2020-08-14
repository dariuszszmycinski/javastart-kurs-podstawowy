package example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PersonOperators {
    public static void main(String[] args) {
        //losowe osoby
        String [] firstNames = {"Jan", "Karol", "Piotr", "Adrzej"};
        String[] lastNames = {"Kowalski", "Abacki", "Zalewski", "Korzeniewski"};
        int[] ages = {5,16,22,33,44,55};
        Random random = new Random();
        Supplier<Person> supplier = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            example1.Person randomPerson = new example1.Person(firstName,lastName,age);
            return new Person(firstName,lastName,age);
        };
        List<Person> people = generateRandomList(5,supplier);

        System.out.println(">>>> People");
        consumeList(people, p -> System.out.println(p));

        //postarzenie o rok
        System.out.println(">>>> People age +1");
        consumeList(people, p -> p.setAge(p.getAge() + 1));
        consumeList(people, p -> System.out.println(p));

        //wyświetl dorosłych
        System.out.println(">>>> Adults");
        List<Person> adults = filterByPredicate(people, person -> person.getAge() >= 18);
        consumeList(adults, p -> System.out.println(p));

        //wyświetl osoby o imieniu Jan
        System.out.println(">>>> Jan People");
        List<Person> janPeople = filterByPredicate(people, person -> "Jan".equals(person.getFirstName()));
        consumeList(janPeople, p -> System.out.println(p));

        //wyświetl imiona
        System.out.println(">>>> FirstNames");
        List<String> firstNamesList = convertList(people, person -> person.getFirstName());
        consumeList(firstNamesList,(String s)-> System.out.println(s));
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    private static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t))
                result.add(t);
        }
        return result;
    }

    private static <T,R> List<R> convertList(List<T> list, Function<T,R> function){
        List<R> resultList = new ArrayList<>();
        for (T t:list){
            R result = function.apply(t);
            resultList.add(result);
        }
        return resultList;
    }

    private static <T> List<T> generateRandomList(int elements, Supplier<T> supplier){
        List<T> result = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            result.add(supplier.get());
        }
        return result;
    }

}
