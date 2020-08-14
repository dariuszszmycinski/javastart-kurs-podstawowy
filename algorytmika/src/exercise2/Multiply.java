package exercise2;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        int multi = 1;
        int next = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mnożenie 5 liczb.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj liczbę:");
            next = scanner.nextInt();
            multi *= next;
        }
        scanner.close();
        System.out.println(multi);
        if (multi < 0) {
            System.out.println("Ujemna");
        } else System.out.println("Nieujemna");
    }


}
