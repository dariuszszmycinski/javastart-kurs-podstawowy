package example1;

public class Car {
    private Engine engine;
    private int fuel;

    public Car(){
        engine = new Engine("Ferrari");
        System.out.println("Utworzono samochód z silnikiem "+engine.engineType);
    }

    public void go() throws InterruptedException{
        while (fuel>0){
            engine.consumeFuel();
            System.out.println("Pozostało "+fuel+" litrów paliwa");
            Thread.sleep(1000);
        }
        System.out.println("Brak paliwa");
    }

    public void refuel(int liters){
        fuel+=liters;
    }

    public class Engine{
        private String engineType;
        private static final int FUEL_CONSUMPTION = 20;

        public Engine(String engineType) {
            this.engineType = engineType;
        }

        public void consumeFuel(){
            fuel = fuel - FUEL_CONSUMPTION;
        }
    }
}
