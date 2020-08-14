package example1;

public class DiscountApp {
    public static void main(String[] args) {
        String firstName = "Jan";
        String lastName = "Kowalski";
        boolean clientPremium = true;
        double price = 1100;
        double discountPrice = price;
        if (clientPremium && price > 1000) {
            discountPrice *= 0.85;
        } else if (price > 1000) {
            discountPrice *= 0.9;
        } else if (clientPremium) {
            discountPrice *= 0.9;
        }

        System.out.println("Witaj " + firstName + " " + lastName);
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Do zapłaty po rabacie: " + discountPrice);
    }
}
