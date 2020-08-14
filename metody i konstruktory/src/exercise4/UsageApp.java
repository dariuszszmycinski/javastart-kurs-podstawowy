package exercise4;

public class UsageApp {
    public static void main(String[] args) {
        House house = new House(1000,100);
        System.out.println(house.toString());
        house.takeShower();
        System.out.println(house.toString());
        house.boilWater();
        System.out.println(house.toString());
        house.makeDinner();
        System.out.println(house.toString());
        house.watchTv(3);
        System.out.println(house.toString());
        house.takeBath();
        System.out.println(house.toString());
    }
}
