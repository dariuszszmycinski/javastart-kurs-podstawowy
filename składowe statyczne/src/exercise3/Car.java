package exercise3;

public class Car {
    private double fuel;
    private boolean engineOk;
    private boolean fillerClosed;
    private boolean doorsClosed;
    private boolean engineOn;

    static final int CAR_RUNNING = 100;
    static final int ENGINE_FAILURE = 200;
    static final int NO_FUEL = 300;
    static final int FILLER_OPEN = 400;
    static final int DOOR_OPEN = 500;

    public int start() {
        if (fuel > 0 && engineOk && fillerClosed && doorsClosed) {
            engineOn = true;
            return CAR_RUNNING;
        }else if (!engineOk){
            engineOn = false;
            return ENGINE_FAILURE;
        }else if (fuel<=0){
            engineOn = false;
            return NO_FUEL;
        } else if (fuel > 0 && engineOk && !fillerClosed){
            engineOn = true;
            return FILLER_OPEN;
        } else if (fuel > 0 && engineOk && !doorsClosed){
            engineOn = true;
            return DOOR_OPEN;
        } else{
            engineOn = false;
            return 0;
        }
    }

    public int status(){
        if (fuel > 0 && engineOk && fillerClosed && doorsClosed&&engineOn){
            return CAR_RUNNING;
        } else {
            return start();
        }
    }

    public void print(int code){
        if (code == 0){
            System.out.println("ERROR");
        } else if (code == 100 ){
            System.out.println("Samochód sprawny, jedziemy.");
        } else if (code == 200) {
            System.out.println("Awaria silnika!");
        } else if (code == 300){
            System.out.println("Brak paliwa.");
        } else if (code == 400){
            System.out.println("Uwaga, otwarty wlew paliwa!");
        } else if (code == 500){
            System.out.println("Uwaga, drzwi lub bagażnik otwarte!");
        }
    }

    public Car(double fuel, boolean engineOk, boolean fillerClosed, boolean doorsClosed) {
        this.fuel = fuel;
        this.engineOk = engineOk;
        this.fillerClosed = fillerClosed;
        this.doorsClosed = doorsClosed;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setEngineOk(boolean engineOk) {
        this.engineOk = engineOk;
    }

    public void setFillerClosed(boolean fillerClosed) {
        this.fillerClosed = fillerClosed;
    }

    public void setDoorsClosed(boolean doorsClosed) {
        this.doorsClosed = doorsClosed;
    }
}
