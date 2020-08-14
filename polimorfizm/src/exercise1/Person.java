package exercise1;

public class Person {
    private String name;
    private String surname;
    private double sallary;

    public Person(String name, String surname, double sallary) {
        this.name = name;
        this.surname = surname;
        this.sallary = sallary;
    }

    public String info() {
        return "Imię: " + name + ", Nazwisko: " + surname + ", Wypłata " + sallary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSallary() {
        return sallary;
    }

}
