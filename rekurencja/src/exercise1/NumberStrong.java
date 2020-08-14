package exercise1;

public class NumberStrong {
    public static void main(String[] args) {
        int number = factorial(5);
        System.out.println("Wynik: "+ number);
    }

    static int factorial(int n){
        if (n>1){
            System.out.println(n);
            return n*factorial(n-1);
        }else {
            return n;
        }
    }
}
