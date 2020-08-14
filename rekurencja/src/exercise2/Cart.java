package exercise2;

public class Cart {
    private static final int MAX_ITEMS = 10;
    private static Product[] products = new Product[MAX_ITEMS];
    private static int quantity = 0;


    boolean addProduct(Product product) {
        if (quantity < MAX_ITEMS) {
            products[quantity] = product;
            quantity++;
            return true;
        } else {
            return false;
        }
    }


    double totalCost() {
        return sumPrices(0);
    }

    private double sumPrices(int n) {
        if (quantity == 0) {
            return 0;
        } else if (n < (quantity - 1)) {
            return products[n].getPrice() + sumPrices(++n);
        } else{
            return products[n].getPrice();
        }
    }
}
