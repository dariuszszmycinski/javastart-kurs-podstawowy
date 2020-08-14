package exercise1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomNubers {
    public static void main(String[] args) {
        final int NUMBER_RANGE = 1000;
        final int MAX_NUMBERS = 10;

        //losowanie liczb
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        generate(numbers, MAX_NUMBERS, () -> random.nextInt(NUMBER_RANGE));

        //wydruk
        consume(numbers, x -> System.out.print(x + " "));
        System.out.println();

        //usuń parzyste
        filterList(numbers,x->x%2==0);

        //wydruk
        consume(numbers, x -> System.out.print(x + " "));

    }

    private static <T> void generate(List<T> list, int toGenerate, Supplier<T> sup) {
        for (int i = 0; i < toGenerate; i++) {
            list.add(sup.get());
        }
    }

    private static <T> void consume(List<T> list, Consumer<T> consumer) {
        for (T t : list)
            consumer.accept(t);
    }

    private static <T> void filterList(List<T> list, Predicate<T> pred) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            T tmp = it.next();
            if (pred.test(tmp)) {
                it.remove();
            }
        }
    }
}
