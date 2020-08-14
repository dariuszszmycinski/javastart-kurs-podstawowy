package exercise2;

public class Property implements Comparable<Property> {
    private String city;
    private double price;
    private double area;
    private double meterPrice;

    public Property(String city, double price, double area) {
        this.city = city;
        this.price = price;
        this.area = area;
        this.meterPrice=price/area;
    }

    @Override
    public String toString() {
        return "Property{" +
                "city='" + city + '\'' +
                ", price=" + price +
                ", area=" + area +
                ", meterPrice=" + meterPrice +
                '}'+"\n";
    }

    public int compareTo(Property p) {
        return Double.compare(meterPrice, p.meterPrice);
    }
}
