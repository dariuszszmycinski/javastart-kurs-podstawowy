package exercise1;

public class Calculator {
    double add(double number1, double number2) {
        return number1 + number2;
    }

    double add(double number1, double number2, double number3) {
        return add(number1,number2) + number3;
    }

    double subtract(double number1, double number2) {
        return number1 - number2;
    }

    double subtract(double number1, double number2, double number3) {
        return number1 - number2 - number3;
    }
}
