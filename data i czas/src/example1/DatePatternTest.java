package example1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DatePatternTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tworzę nowe wydarzenie.");
        System.out.println("Podaj datę w formacie dd-MM-yyyy");

        DateTimeFormatter datePatters = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateInput = sc.nextLine();
        LocalDate createdDate = LocalDate.parse(dateInput, datePatters);
        System.out.println("Wydarzenie utworzone na dzień "+createdDate);
    }
}
