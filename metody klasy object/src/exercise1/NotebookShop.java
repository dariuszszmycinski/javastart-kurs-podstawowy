package exercise1;

public class NotebookShop {
    public static void main(String[] args) {
        Computer com1 = new Computer("Dell",123);
        Computer com2 = new Computer("Asus", 234);
        Computer com3 = new Computer("PC", 345);
        Computer com4 = new Computer("Intel", 456);
        Computer com5 = new Computer("Asus", 234);
        DataStore ds = new DataStore();
        ds.add(com1);
        ds.add(com2);
        ds.add(com3);
        ds.add(com4);
        ds.add(com5);
        System.out.println(ds.checkAvailability(com2));
        ds.printWerehouse();
    }
}
