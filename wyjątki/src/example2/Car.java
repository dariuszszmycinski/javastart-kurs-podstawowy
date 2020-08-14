package example2;

public class Car {
    private static final double FUEL_CONSUMPTION = 8;
    private static final double MAX_FUEL = 50;
    private double fuel;

    void refuel(double additionalFuel) {
        if (fuel + additionalFuel > MAX_FUEL)
            throw new IllegalArgumentException("Zmieści się maksymalnie " + (MAX_FUEL - fuel));
        else
            fuel += additionalFuel;
    }

    public void drive() {
        if (fuel - FUEL_CONSUMPTION < 0)
            throw new IllegalStateException("Masz za mało paliwa, zatankuj.");
        else
            fuel -= FUEL_CONSUMPTION;
    }

    public String toString() {
        return "Stan paliwa: " + fuel;
    }
}
