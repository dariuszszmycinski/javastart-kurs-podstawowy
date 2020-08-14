package example3;

public class NumberAdder {
    public static void main(String[] args) {
        int number = sum(500);
        System.out.println(number);
    }

    static int sum(int n) {
        return n > 1 ? n + sum(n - 1) : n;
    }
}
