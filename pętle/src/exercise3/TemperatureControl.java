package exercise3;

import java.util.Scanner;

public class TemperatureControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj aktualną temperaturę.");
        double ct = sc.nextInt();
        System.out.println("Podaj docelową temperaturę.");
        double wt = sc.nextInt();
        sc.close();
        while (ct != wt) {
            if (ct < wt) {
                ct = ct + 0.5;
                System.out.println("Temperatura rośnie do " + ct + " stopni.");
            } else {
                ct = ct - 0.5;
                System.out.println("Temperatura maleje do " + ct + " stopni.");
            }
        }
        System.out.println("Osiągnięto zadaną temperaturę.");
    }
}
