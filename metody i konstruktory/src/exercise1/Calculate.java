package exercise1;

public class Calculate {
    public static void main(String[] args) {
        double number1 = 10.7;
        double number2 = 3;
        Calculator calc = new Calculator();
        System.out.println("A=" + number1 + " B=" + number2);
        System.out.println("A+B="+calc.add(number1, number2));
        System.out.println("A-B="+calc.subtract(number1, number2));
        System.out.println("A*B="+calc.multiply(number1, number2));
        System.out.println("A/B="+calc.divide(number1, number2));
    }
}
