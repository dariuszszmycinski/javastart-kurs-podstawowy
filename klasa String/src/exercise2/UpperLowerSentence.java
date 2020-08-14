package exercise2;

import java.util.Scanner;

public class UpperLowerSentence {
    public static void main(String[] args) {
        System.out.println("Wprowadź dowolny tekst:");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        char firstLetter = sentence.charAt(0);
        StringBuilder builder = new StringBuilder();
        if (Character.isUpperCase(firstLetter)){
                builder.append(sentence.toUpperCase());
        } else if (Character.isLowerCase(firstLetter)){
                builder.append(sentence.toLowerCase());
        } else builder.append(sentence);
        System.out.println("Nowe zdanie:");
        System.out.println(builder.toString());
    }
}
