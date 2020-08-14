package example;

public class ComputerStore {
    public static void main(String[] args) {

        Computer comp1 = new Computer("Intel i5");
        Computer comp2 = new Computer("AMD Ryzen 1700");

        ComputerUpgrade upgrade = new ComputerUpgrade();
        upgrade.addMemory(comp1, 4096);

        comp1.printInfo();
        comp2.printInfo();
    }
}
