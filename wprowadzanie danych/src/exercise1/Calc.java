package exercise1;

public class Calc {
    private double number1;
    private double number2;
    private String operation;

    public double calculate(double number1, double number2, String operation) {
        if (operation.equals("+")) {
            return number1 + number2;
        } else if (operation.equals("-")) {
            return number1 - number2;
        } else if (operation.equals("*")) {
            return number1 * number2;
        } else if (operation.equals("/")) {
            return number1 / number2;
        } else {
            System.out.println("Nieprawidłowy znak operacji.");
            return 0;
        }
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
