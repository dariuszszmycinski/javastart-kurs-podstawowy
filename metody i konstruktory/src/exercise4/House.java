package exercise4;

public class House {
    private double water;
    private double oil;

    public House(double water, double oil) {
        this.water = water;
        this.oil = oil;
    }

    public void takeShower() {
        water -= 48;
        System.out.println("Biorę prysznic");
    }

    public void takeBath() {
        water -= 86;
        System.out.println("Biorę kąpiel");
    }

    public void makeDinner() {
        water -= 4;
        oil -= 0.1;
        System.out.println("Przygotowuję obiad");
    }

    public void boilWater() {
        water -= 0.5;
        oil -= 0.05;
        System.out.println("Robię herbatę");
    }

    public void watchTv(int hours){
        oil=oil-(hours*0.06);
        System.out.println("Oglądam telewizję przez "+hours+" godziny");
    }

    @Override
    public String toString() {
        return "House{" +
                "water=" + water +
                ", oil=" + oil +
                '}';
    }
}
