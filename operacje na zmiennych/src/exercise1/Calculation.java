package exercise1;

public class Calculation {
    public static void main(String[] args) {
        int x = (int)(Math.random()*10);
        int y = (int)(Math.random()*10);
        System.out.println("x=" + x + " y=" + y);
        boolean result;
        result = x > y;
        System.out.println(result);
        result = (2 * x) > y;
        System.out.println(result);
        result = (y < (x + 3)) && (y > (x - 2));
        System.out.println(result);
        result = ((x * y) % 2) == 0;
        System.out.println(result);
    }
}
