package example2;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random generate = new Random();
        final int number= generate.nextInt(500);
        int userInput;
        System.out.println("Zgadnij liczbę");

        while ((userInput=reader.nextInt())!=number){
            if(userInput>number){
                System.out.println("Za dużo.");
            }else{
                System.out.println("Za mało.");
            }
        }
        System.out.println("Zgadłeś, brawo!");
        reader.close();
    }
}
