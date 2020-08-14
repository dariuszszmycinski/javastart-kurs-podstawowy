package exercise2;

public class Shop {
    public static void main(String[] args) {

        Seller jako = new Seller();
        jako.firstName = "Jan";
        jako.lastName = "Kowalski";
        Address address1 = new Address();
        address1.city = "Wrocław";
        address1.postalCode = "50-500";
        address1.street = "Kościuszki";
        address1.homeNo = "24A";
        address1.flatNo = 21;
        jako.address = address1;

        Seller juad = new Seller();
        juad.firstName = "Justyna";
        juad.lastName = "Adamczyk";
        juad.address = new Address();
        juad.address = address1;

        Auction auction1 = new Auction();
        auction1.title = "Xbox One";
        auction1.description = "Dla wymagających graczy";
        auction1.price = 999.99;
        auction1.seller = jako;

        Auction auction2 = new Auction();
        auction2.title = "Samsung S20";
        auction2.description = "Niesamowity telefon z trzema obiektywami";
        auction2.price = 3999;
        auction2.seller = juad;

        System.out.println("Aukcja 1: " + auction1.title + " " + auction1.description + " za jedyne " + auction1.price + "  zł.");
        System.out.println("Sprzedaje " + auction1.seller.firstName + " " + auction1.seller.lastName + ".");
        System.out.println("Aukcja 2: " + auction2.title + " " + auction2.description + " za jedyne " + auction2.price + " zł.");
        System.out.println("Sprzedaje " + auction2.seller.firstName + " " + auction2.seller.lastName + ".");

    }
}
