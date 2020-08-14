package exercise1;

public class Company {
    public static void main(String[] args) {

        Employee jako = new Employee();
        jako.name="Jan";
        jako.lastName="Kowalski";
        jako.birthYear=1989;
        jako.seniority=3.5;

        Employee pino = new Employee();
        pino.name="Piotr";
        pino.lastName="Nowak";
        pino.birthYear=2000;
        pino.seniority=1;

        Employee krle = new Employee();
        krle.name="Krystyna";
        krle.lastName="Lewandowska";
        krle.birthYear=1977;
        krle.seniority=14.5;

        System.out.println("Pan(i) "+jako.name+" "+jako.lastName+" urodzony(a) w roku "+jako.birthYear+" pracuje od lat "+jako.seniority+".");
        System.out.println("Pan(i) "+pino.name+" "+pino.lastName+" urodzony(a) w roku "+pino.birthYear+" pracuje od lat "+pino.seniority+".");
        System.out.println("Pan(i) "+krle.name+" "+krle.lastName+" urodzony(a) w roku "+krle.birthYear+" pracuje od lat "+krle.seniority+".");
    }
}
