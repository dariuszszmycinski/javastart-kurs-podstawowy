package exercise1;

public class GrocceryShop {
    public static void main(String[] args) {
        Fruit banan = new Fruit(300,"krzywy");
        Apple szalotka = new Apple(540,"szalotka");
        System.out.println(banan.getInfo());
        System.out.println(szalotka.getInfo());
    }
}
