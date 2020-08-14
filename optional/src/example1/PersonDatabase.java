package example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDatabase {
    private List<Person> people = new ArrayList<>();

    public void add(Person person) {
        if (person == null)
            throw new NullPointerException("Cannot add null reference");
        findByld(person.getId())
                .ifPresent(p->new IllegalArgumentException("Object with suck id already exist"));
        people.add(person);
    }

    public Optional<Person> findByld(int id){
        for(Person person:people){
            if(person.getId()==id)
                return Optional.of(person);
        }
        return  Optional.empty();
    }

    public String findLastNameByld(int id){
        return  findByld(id)
                .map(Person::getLastName)
                .orElse("Anonim");
    }
}
