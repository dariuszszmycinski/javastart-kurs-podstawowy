package exercise2;

import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Wybierz orzeł (1) lub reszka (0)");
        int bet = input.nextInt();
        int roll = random.nextInt(2);
        input.close();
        if (roll == 1) {
            System.out.println("Wypadł orzeł");
        } else if (roll == 0) {
            System.out.println("Wypadła reszka");
        }
        if (roll == bet) {
            System.out.println("Wygrałeś!");
        } else {
            System.out.println("Przegrałeś :(");
        }
    }
}
