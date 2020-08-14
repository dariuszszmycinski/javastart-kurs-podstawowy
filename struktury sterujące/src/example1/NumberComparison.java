package example1;

public class NumberComparison {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int c = 50;

        if (a>b) {
            if (a>c)
                System.out.println("Największa liczba A: "+a);
            else
                System.out.println("Największa liczba C: "+c);
        } else {
            System.out.println("A mniejsze od B");
        }
    }
}
