package exercise2;

public class Training {
    private String id;
    private double price;
    private String name;
    private String description;

    public Training(String id, double price, String name, String description) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public void print(){
        System.out.println(id+" "+name+" "+description+" kosztuje "+price+" zł");
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
