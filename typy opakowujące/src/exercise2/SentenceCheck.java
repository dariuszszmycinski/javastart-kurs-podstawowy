package exercise2;

import java.util.Scanner;

public class SentenceCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dowolny tekst z literami i cyframi:");
        String text = sc.nextLine();
        sc.close();
        int numbers = 0;
        int chars = 0;
        int maxNumber=-1;
        for (int i = 0; i <text.length() ; i++) {
            if (Character.isDigit(text.charAt(i))){
                char a = text.charAt(i);
                numbers++;
                if (maxNumber<Character.getNumericValue(a)){
                    maxNumber=Character.getNumericValue(a);
                }
            } else if (Character.isLetter(text.charAt(i))){
                chars++;
            }
        }
        System.out.println("Liczba cyfr: "+numbers);
        System.out.println("Liczba liter: "+chars);
        if (maxNumber==-1){
            System.out.println("Cyfry nie podano.");
        }else {
            System.out.println("Największa cyfra: " + maxNumber);
        }
    }
}
