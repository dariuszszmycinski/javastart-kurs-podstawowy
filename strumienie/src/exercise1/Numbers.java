package exercise1;

import java.util.stream.Stream;

public class Numbers {
    public static void main(String[] args) {
        Stream.iterate(0, x->x+1)
                .filter(x->x>100)
                .filter(x->x%5==0)
                .filter(x->x<1000)
                .limit(10)
                .map(x->x*3)
                .forEach(System.out::println);

    }
}
