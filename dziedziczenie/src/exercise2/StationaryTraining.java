package exercise2;

public class StationaryTraining extends Training {
    private String place;
    private int lessons;

    public StationaryTraining(String id, double price, String name, String description, String place, int lessons) {
        super(id, price, name, description);
        this.place = place;
        this.lessons = lessons;
    }

    public void print(){
        System.out.println(getId()+" "+getName()+" "+getDescription()+" kosztuje "+getPrice()+" zł, zawiera "+lessons+" lekcji i odbywa się w "+place);
    }
}
