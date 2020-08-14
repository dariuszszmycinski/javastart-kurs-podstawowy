package exercise2;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductSet {
    static Scanner sc = new Scanner(System.in);
    static HashSet<Product> products = new HashSet<>();

    public static void main(String[] args) {
        boolean exit = false;

        while (exit == false) {
            System.out.println("Dodaj produkt (0) lub koniec programu (1):");
            try{
                int option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 0:
                        addProduct();
                        break;
                    case 1:
                        exit = true;
                        break;
                    default:
                        System.err.println("Brak takiej opcji!");
                        break;
                }
            }catch (InputMismatchException e){
                System.err.println("Podano błędne dane!");
                break;
            }


        }
        sc.close();
        for (Product p : products) {
            System.out.println(p);
        }
    }

    static void addProduct() {

        System.out.println("Podaj nazwę produktu:");
        String name = sc.nextLine();
        System.out.println("Podaj cenę:");
            double price = sc.nextDouble();
            sc.nextLine();

            if (products.contains(new Product(name, price))) {
                System.out.println("Produkt o tej nazwie istnieje. Nadpisać (0) czy zignorować (1)?");
                int option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 0:
                        products.add(new Product(name, price));
                        break;
                    case 1:
                        break;
                    default:
                        System.err.println("Brak takiej opcji!");
                        break;
                }
            } else {
                products.add(new Product(name, price));
            }
    }
}
