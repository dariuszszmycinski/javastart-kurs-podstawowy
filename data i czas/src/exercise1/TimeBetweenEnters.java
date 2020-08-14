package exercise1;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class TimeBetweenEnters {
    public static void main(String[] args) {
        System.out.println("Wciśnij ENTER by rozpocząć pomiar czasu");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        Instant i1 = Instant.now();
        System.out.println("Wciśnij ENTER by zakończyć pomiar czasu");
        sc.nextLine();
        Instant i2 = Instant.now();
        Duration duration = Duration.between(i1, i2);
        System.out.println("Upłyneło " + duration.getSeconds() + " sekund.");
        sc.close();
    }
}
