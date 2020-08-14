package exercise2;

public class Price {
    public static void main(String[] args) {
        double netto=100.00;
        double vat = 0.23;
        System.out.println("Cena netto wynosi "+netto+" zł");
        System.out.println("Vat wynosi "+vat+" %");
        System.out.println("Cena brutto wynosi "+(netto+netto*vat)+" zł");
    }
}
