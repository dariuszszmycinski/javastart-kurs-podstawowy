package example2;

import java.util.Random;

public class Person {
    private String[] firstNames ={"Jan", "Karol", "Andrzej", "Piotr"};
    private String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
    private int[] ages= {22,33,44,55};
    private static Random random = new Random();

    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        firstName = firstNames[random.nextInt(firstNames.length)];
        lastName = lastNames[random.nextInt(lastNames.length)];
        age = ages[random.nextInt(ages.length)];
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName + ' ' + age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
