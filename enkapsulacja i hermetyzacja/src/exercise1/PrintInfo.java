package exercise1;

public class PrintInfo {
    public void print(Client client, double price, double discountPrice) {
        printWelcome(client);
        printPrices(price, discountPrice);
    }

    private void printPrices(double price, double discountPrice) {
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Kwota po rabacie: " + discountPrice);
    }

    private void printWelcome(Client client) {
        String firstName = client.getFirstName();
        String lastName = client.getLastName();

        if (firstName == null && lastName == null){
            System.out.println("Witaj nieznajomy");
        } else if (firstName == null) {
            System.out.println("Witaj " + lastName);
        } else if (lastName == null) {
            System.out.println("Witaj " + firstName);
        } else {
            System.out.println("Witaj " + firstName + " " + lastName);
        }
    }
}
