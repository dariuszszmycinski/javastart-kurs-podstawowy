package example1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberExample {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(1,2,3,4,5);
        int[] evenNumbers = stream.filter(x->x%2==0)
                .toArray();
        System.out.println(Arrays.toString(evenNumbers));
    }
}
