package exercise1;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Menu:");
        for (Pizza p:Pizza.values()){
            System.out.println(p.toString());
        }

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pizza pizza = Pizza.valueOf(input);
        System.out.println("Zamówiono pizzę: "+pizza.name());
        sc.close();

    }
}
