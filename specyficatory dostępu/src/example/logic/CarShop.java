package example.logic;

import example.data.Car;

public class CarShop {
    public static void main(String[] args) {
        Car audiA5 = new Car(2014, "Audi", "A5", "Czarne");
        Car audiA4 = new Car(2015, "Audi", "A4");
        audiA4.setColor("Czerwony");
        audiA4.print();
        audiA5.print();
        audiA5.setYear(2015);
        System.out.println("Rocznik "+audiA5.getYear());
        audiA5.setYear(-500);
        System.out.println("Rocznik "+audiA5.getYear());
    }
}
