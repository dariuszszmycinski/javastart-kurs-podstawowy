package example3;

public class ComparisonExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;

        if (a > b) {
            System.out.println("A > B");
        } else if (b > c) {
            System.out.println("B > C");
        } else if (c > a) {
            System.out.println("C > A");
        }

        if (a > b) {
            System.out.println("A > B*");
        }

        if (b > c) {
            System.out.println("B > C*");
        }

        if (c > a) {
            System.out.println("C > A*");
        }
    }
}
