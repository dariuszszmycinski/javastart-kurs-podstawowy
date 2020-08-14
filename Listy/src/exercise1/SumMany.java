package exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class SumMany {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Podaj cyfrę lub exit.");
        getInput(sc.nextLine());
        System.out.println(getSum(numbers));
    }

    static void getInput(String line) {

        if (line.equals("exit")) {
            return;
        } else {
            try {
                numbers.add(Integer.valueOf(line));
                System.out.println("Podaj cyfrę lub exit.");
                getInput(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Błędne dane. Podaj liczbę lub exit");
                getInput(sc.nextLine());
            }
        }
    }

    static String getSum(ArrayList<Integer> numbers) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        try {
            sb.append(numbers.get(0));
            sum += numbers.get(0);
            for (int i = 1; i < numbers.size(); i++) {
                sb.append(" + ");
                sb.append(numbers.get(i));
                sum += numbers.get(i);
            }
            sb.append(" = ");
            sb.append(sum);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Nie podano żadnej liczby!");
        }
        return sb.toString();
    }


}
