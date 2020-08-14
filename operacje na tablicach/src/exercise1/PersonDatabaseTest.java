package exercise1;

public class PersonDatabaseTest {
    public static void main(String[] args) {
        PersonDatabase pd = new PersonDatabase();
        pd.add(new Person("Ania","Kowalska", "12345"));
        pd.add(new Person("Ola","Nowak","23456"));
        pd.add(new Person("Tomek","Lewandowski","34567"));
        pd.add(new Person("Kasia","Piotrowska","45678"));
        Person person = pd.get(1);
        System.out.println(person);
        System.out.println(pd);
        pd.remove(new Person("Ola","Nowak","23456"));
        System.out.println(pd);

    }
}
