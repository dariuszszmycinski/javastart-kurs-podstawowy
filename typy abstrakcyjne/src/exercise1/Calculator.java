package exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Wybierz figurę: 1-okrąg, 2-prostokąt, 3-trójkąt.");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        try {
            switch (option) {
                case "1":
                    System.out.println("Wybrano okrąg. Podaj promień:");
                    double radius = sc.nextDouble();
                    sc.nextLine();
                    Shape circle = new Circle(radius);
                    System.out.println("Pole wynosi " + circle.calculateArea());
                    System.out.println("Obwód wynosi " + circle.calculatePerimeter());
                    break;
                case "2":
                    System.out.println("Wybrano prostokąt. Podaj bok a:");
                    double a = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Podaj bok b:");
                    double b = sc.nextDouble();
                    sc.nextLine();
                    Shape rectangle = new Rectangle(a, b);
                    System.out.println("Pole wynosi " + rectangle.calculateArea());
                    System.out.println("Obwód wynosi " + rectangle.calculatePerimeter());
                    break;
                case "3":
                    System.out.println("Wybrano trójkąt. Podaj bok a:");
                    double d = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Podaj bok b:");
                    double e = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Podaj bok c:");
                    double f = sc.nextDouble();
                    sc.nextLine();
                    Shape triangle = new Triangle(d, e, f);
                    System.out.println("Pole wynosi " + triangle.calculateArea());
                    System.out.println("Obwód wynosi " + triangle.calculatePerimeter());
                    break;
                default:
                    System.out.println("Wybrano niepoprawną opcję.");
            }
            sc.close();
        }catch (InputMismatchException e){
            System.err.println("Podano nieprawidłowe dane!");
        }
    }
}
