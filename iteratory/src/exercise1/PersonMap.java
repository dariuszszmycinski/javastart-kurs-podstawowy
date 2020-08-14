package exercise1;


import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PersonMap {
    public static void main(String[] args) {
        Map<String,Person> personMap = new TreeMap<>();
        personMap.put("Kowalski", new Person("Jan", "Kowalski",30));
        personMap.put("Nowak", new Person("Bartosz", "Nowak", 55));
        personMap.put("Borowska", new Person("Julita", "Borowska",27));

        System.out.println(personMap);

        Collection<Person> values = personMap.values();
        Iterator<Person> iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
