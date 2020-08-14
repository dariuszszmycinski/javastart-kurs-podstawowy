package exercise1;

public class Fruit {
    private int weight;
    private String type;

    public Fruit(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public String getInfo(){
        return "Owoc jest typu "+type+" oraz waży "+weight+" g.";
    }
}
