package exercise1;

public class Hospital {
    Person[] employees = new Person[3];
    private int totalEmployees=0;

    public void add(Person person){
        employees[totalEmployees] = person;
        totalEmployees++;
    }

    public void getInfo(){
        System.out.println("W szpitalu pracują:");
        for (Person person:employees){
            System.out.println(person.info());
        }
    }
}
