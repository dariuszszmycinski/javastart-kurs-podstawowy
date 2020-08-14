package exercise1;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb chcesz dodać?");
        int quantity = scanner.nextInt();
        int sum = 0;
        while(quantity-->0) {
            System.out.println("Podaj liczbę");
            sum = sum + scanner.nextInt();
        }
        System.out.println("Suma liczb wynosi " + sum);
    }
}
