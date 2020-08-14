package exercise1;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(13, 55.5));
        System.out.println(calculator.add(5, 15, 10));
        System.out.println(calculator.subtract(99.99,17.25));
        System.out.println(calculator.subtract(99.99,17.25,150));
    }
}
