package exercise2;

public class Start {
    public static void main(String[] args) {
        Person person1 = new Person(1, 70);
        Person person2 = new Person(2, 130);
        Person person3 = new Person(3,55);
        Person person4 = new Person(4, 100);
        Person person5 = new Person(5, 250);

        Lift lift = new Lift();

        lift.add(person1);
        lift.add(person2);
        lift.add(person3);
        lift.add(person4);
        lift.add(person5);

        lift.start();

        lift.clear();

    }
}
