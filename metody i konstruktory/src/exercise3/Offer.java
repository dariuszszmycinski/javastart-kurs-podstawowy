package exercise3;

public class Offer {
    Product product;
    double price;
    boolean special;

    Offer(Product prod, double p, boolean s) {
        product = prod;
        price = p;
        special = s;
        System.out.println(product.name + " " + product.producer + " " + price + "zł oferta specjalna? " + special);
    }
}
