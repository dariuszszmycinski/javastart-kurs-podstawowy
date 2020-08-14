package exercise2;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Product("mleko",2.99));
        cart.addProduct(new Product("czekolada",1.99));
        cart.addProduct(new Product("prezerwatywy",8.49));

        double cartCost = cart.totalCost();
        System.out.println("Koszt koszyka: "+cartCost);
    }
}
