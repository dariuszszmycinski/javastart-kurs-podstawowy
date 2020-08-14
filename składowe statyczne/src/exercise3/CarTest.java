package exercise3;

public class CarTest {
    public static void main(String[] args) {
        Car audi = new Car(1,true,true,true);
        audi.print(audi.start());
        audi.setFuel(0);
        audi.print(audi.status());
        audi.setFuel(12);
        audi.print(audi.status());
    }
}
