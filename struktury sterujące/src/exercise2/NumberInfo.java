package exercise2;

import java.util.Random;

public class NumberInfo {
    public static void main(String[] args) {

        int number = (int) ((Math.random() * 10000) + 1);

        System.out.println("Wylosowana liczba: " + number);

        if (number > 5000) {
            System.out.println("Liczba większa od 5000.");
        } else if (number < 5000) {
            System.out.println("Liczba mniejsza od 5000.");
        } else {
            System.out.println("Liczba równa 5000.");
        }

        if (number%2==0){
            System.out.println("Liczba jest parzysta.");
        } else {
            System.out.println("Liczba jest nieparzysta.");
        }

        System.out.println("Uzupełniona liczba: "+newNumber(number));
    }

    static int newNumber(int num){
        if(num>999){
            return num;
        } else if(num==0){
            return 0;
        } else if(num<10){
            return num*1000;
        } else if(num<100){
            return num*100;
        } else {
            return num*10;
        }
    }
}
