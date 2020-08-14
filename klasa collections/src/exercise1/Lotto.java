package exercise1;

import java.util.*;

public class Lotto {
    static List<Integer> pull = new ArrayList<>();
    public static void main(String[] args) {
        generate();
        randomize();
        checkResult(getNumbers());


    }

    static void generate(){
        for (int i = 0; i < 49; i++) {
            pull.add(i+1);
        }
    }

    static void randomize(){
        Collections.shuffle(pull);
    }

    static void checkResult(List<Integer> numbers){
        int hits = 0;
        List <Integer> result = pull.subList(0,6);
        System.out.println("Wylosowano liczby: "+result);
        for (Integer i:result){
            if (numbers.contains(i)){
                hits++;
            }
        }
        System.out.println("Trafiono: "+hits);
    }

    static List<Integer> getNumbers(){
        Scanner sc = new Scanner(System.in);
        List<Integer> quess = new ArrayList<>();
        for (int i = 0; i <6 ; i++) {
            System.out.println("Podaj liczbę numer "+(i+1)+": ");
            try{
                int a = sc.nextInt();
                sc.nextLine();
                quess.add(a);
            }
            catch (InputMismatchException e){
                System.err.println("Miała byc liczba!");
                break;
            }
        }
        sc.close();
        System.out.println("Wybrano liczby: "+quess);
        return quess;
    }
}
