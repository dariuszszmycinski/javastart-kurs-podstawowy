package exercise1;

import java.util.Scanner;

public class LastChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę wyrazów");
        int wordsQuantity = sc.nextInt();
        sc.nextLine();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < wordsQuantity; i++) {
            System.out.println("Podaj kolejny wyraz");
            String word = sc.nextLine();
            int wordLength = word.length()-1;
            char lastChar = word.charAt(wordLength);
            builder.append(lastChar);
        }
        sc.close();
        System.out.println(builder.toString());
    }
}
