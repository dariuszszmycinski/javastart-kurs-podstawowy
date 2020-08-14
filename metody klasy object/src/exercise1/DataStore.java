package exercise1;

public class DataStore {
    private Computer[] werehouse = new Computer[100];
    private int itemsQuantity = 0;

    public void add(Computer computer) {
        werehouse[itemsQuantity] = computer;
        itemsQuantity++;
    }

    public void printWerehouse() {
        for (int i = 0; i < itemsQuantity; i++) {
            System.out.println(werehouse[i].toString());
        }
    }

    public int checkAvailability(Computer computer) {
        int quantity = 0;
        for (int i = 0; i < itemsQuantity; i++) {
            if (werehouse[i].equals(computer)) {
                quantity++;
            }
        }
        return quantity;
    }
}
