package exercise1;

public class Bank {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.pesel = "999999999";
        Adress adress1 = new Adress();
        adress1.street = "Warszawska";
        adress1.building = "2B";
        adress1.appartment = 4;
        adress1.city = "Warszawa";
        adress1.postcode = "12-345";
        person.occupation = adress1;
        person.home = adress1;

        Person person1 = new Person();
        person1.firstName = "Hanna";
        person1.lastName = "Kowalska";
        person1.pesel = "888888888";
        person1.home = new Adress();
        person1.home.street = "Gdańska";
        person1.home.building = "34";
        person1.home.appartment = 1;
        person1.home.city = "Gdańsk";
        person1.home.postcode = "23-456";
        person1.occupation = person.occupation;
        BankAccount account1 = new BankAccount();
        account1.owner = person;
        account1.balance = 10000;

        Credit credit1 = new Credit();
        credit1.borrower = person;
        credit1.cashBorrowed = 2000;
        credit1.interestRate = 0.05;
        credit1.termMonths = 12;

        BankAccount account2 = new BankAccount();
        account2.owner = person1;
        account2.balance = -500;

        System.out.println("Osoba 1:");
        System.out.println(person.firstName + " " + person.lastName + " " + person.pesel);
        System.out.println("Mieszka w " + person.occupation.city + " na ulicy " + person.occupation.street + " budynek " + person.occupation.building + " mieszkanie " + person.occupation.appartment + ".");
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);

        System.out.println("Osoba 2:");
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("Mieszka w " + person1.occupation.city + " na ulicy " + person1.occupation.street + " budynek " + person1.occupation.building + " mieszkanie " + person1.occupation.appartment + ".");
        System.out.println("posiada konto bankowe z kwotą: " + account2.balance);
    }
}
