package example3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class GeneratorStream {
    public static void main(String[] args) {
        int[] squares = IntStream.iterate(0,x->x+1)
                .limit(100)
                .map(x->x*x)
                .filter(x->x%2==0)
                .toArray();
        System.out.println(Arrays.toString(squares));
    }
}
