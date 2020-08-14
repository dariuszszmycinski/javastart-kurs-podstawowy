package exercise1;

public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", true);
        double price1 = 1100;

        Client client2 = new Client("Zdzichu", null, false);
        double price2 = 1500;

        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1,price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2,price2);

        PrintInfo printInfo=new PrintInfo();
        printInfo.print(client1,price1,priceDiscount1);
        printInfo.print(client2,price2,priceDiscount2);
    }
}
