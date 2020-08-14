package exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class NextFive {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        createNumbers();
        System.out.println("Liczba poprawnych liczb: "+numbers.size());
        System.out.println("Ich suma wynosi: "+sum(numbers));
        System.out.println("Natomiast średnia to: "+avarage());


    }

    static void createNumbers(){
        boolean correctNumber = true;
        while (correctNumber){
            System.out.println("Podaj liczbę dodatnią podzielną przez 5:");
            int a = sc.nextInt();
            sc.nextLine();
            if (a>0 && a%5==0){
                numbers.add(a);
            }else {
                correctNumber=false;
                System.err.println("Nie podano prawidłowej liczby!");
            }
        }
        sc.close();
    }

    static int sum (ArrayList<Integer> numbers){
        int sum = 0;
        for (int i = 0; i <numbers.size() ; i++) {
            sum+=numbers.get(i);
        }
        return sum;
    }

    static double avarage (){
        return (double)sum(numbers)/(numbers.size());
    }

}
