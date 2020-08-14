package exercise1;

public class Tire extends Part {
    private int size;
    private int width;

    public Tire(int number, String producer, String model, String lot, int size, int width) {
        super(number, producer, model, lot);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public int getWidth() {
        return width;
    }
}
