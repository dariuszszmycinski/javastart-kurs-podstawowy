package example1;

public class CarApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.speedUp();
        System.out.println("Samochód jedzie z prędkością: "+vehicle.getSpeed());
    }
}
