package example1;

import java.time.LocalDate;

public class TimeTest3 {
    public static void main(String[] args) throws InterruptedException {
        LocalDate now = LocalDate.now();
        LocalDate tomorrow = LocalDate.of(2020, 5, 28);

        boolean check = now.isAfter(tomorrow);
        System.out.println("Czy "+now+" jest po "+tomorrow+"?");
        System.out.println(check);

    }
}
