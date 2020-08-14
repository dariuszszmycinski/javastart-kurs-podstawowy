package exercise1;

public class Part {
    private int number;
    private String producer;
    private String model;
    private String lot;

    public Part(int number, String producer, String model, String lot) {
        this.number = number;
        this.producer = producer;
        this.model = model;
        this.lot = lot;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public String getLot() {
        return lot;
    }
}
