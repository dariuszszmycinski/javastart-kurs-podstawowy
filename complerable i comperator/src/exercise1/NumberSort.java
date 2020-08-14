package exercise1;

import java.util.Arrays;
import java.util.Comparator;

public class NumberSort {
    public static void main(String[] args) {
        Integer[] numbers = {15, 1, 48, -7, 2, 99, 69, 420, -666, 12, 13, 14, 11, 7, 6, 5, 4, 3, 2, 1};
        print(numbers);

        Arrays.sort(numbers);
        print(numbers);

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });

        print(numbers);

    }

    static void print(Integer[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.print("\n");
    }


}
