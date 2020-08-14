package exercise2;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TwoDatesCompare {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LocalDate date1 = readDateFromUser();
        LocalDate date2 = readDateFromUser();
        showLaterDate(date1,date2);
        showDaysBetween(date1,date2);
        showTotalDays(date1,date2);
    }

    private static LocalDate readDateFromUser(){
        System.out.println("Podaj dzień miesiąca");
        int day = sc.nextInt();
        System.out.println("Podaj miesiąc");
        int month = sc.nextInt();
        System.out.println("Podaj rok");
        int year = sc.nextInt();
        return LocalDate.of(year,month,day);
    }

    private static void showDaysBetween(LocalDate date1, LocalDate date2){
        Period between = Period.between(date1, date2);
        System.out.println("Liczba dni pomiędzy datami: "+Math.abs(between.getDays()));
        System.out.println("Liczba miesięcy pomiędzy datami: "+Math.abs(between.getMonths()));
        System.out.println("Liczba lat pomiędzy datami: "+Math.abs(between.getYears()));
    }

    private static void showLaterDate(LocalDate date1,LocalDate date2){
        LocalDate laterDate = date1.isAfter(date2)? date1:date2;
        System.out.println("Póżniejsza data "+laterDate);
    }

    private static void showTotalDays(LocalDate date1, LocalDate date2){
        long days = ChronoUnit.DAYS.between(date1,date2);
        System.out.println("To dokładnie "+days+" dni");
    }
}
