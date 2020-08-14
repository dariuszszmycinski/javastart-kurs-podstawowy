package exercise1;

import java.util.Scanner;

public class SumTo100 {
    static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (sum<=MAX_VALUE){
            System.out.println("Podaj liczbę:" );
            sum=sum+scanner.nextInt();
        }
        if (sum%2==0){
            System.out.println("Parzysta");
        } else System.out.println("Nieparzysta");
        System.out.println (sum);
        scanner.close();
    }
}
