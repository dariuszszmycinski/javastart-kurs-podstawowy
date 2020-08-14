package exercise1;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;
    private double p =(a+b+c)/2;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }
}
