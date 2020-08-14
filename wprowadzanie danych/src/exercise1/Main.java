package exercise1;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calc calc = new Calc();
        input.useLocale(Locale.US);

        System.out.println("Podaj pierwszą liczbę: ");
        calc.setNumber1(input.nextDouble());
        System.out.println("Podaj drugą liczbę: ");
        calc.setNumber2(input.nextDouble());
        input.nextLine();
        System.out.println("Podaj znak działania +, -, * lub /: ");
        calc.setOperation(input.nextLine());

        input.close();

        System.out.println("Wynik: "+calc.calculate(calc.getNumber1(),calc.getNumber2(),calc.getOperation()));
    }
}
