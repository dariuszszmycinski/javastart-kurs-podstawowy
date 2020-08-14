package exercise1;

public class DiscountService {
    public double calculateDiscountPrice(Client client,double price){
        if(client.isPremium())
            return calculatePremiumDiscount(price);
        else
            return calculateStandardDiscount(price);
    }

    private double calculateStandardDiscount(double price){
        if(price>1000)
            return applyDiscount(price, 0.1);
        else
            return price;
    }

    private double calculatePremiumDiscount(double price){
        if(price>1000)
            return applyDiscount(price, 0.15);
        else
            return applyDiscount(price, 0.05);
    }

    private double applyDiscount(double price, double discount){
        return price*(1-discount);
    }

    public void printInfo ( String firstName, String lastName, double price, double discountPrice){
        if (firstName.equals(null)&&lastName.equals(null)) {
            System.out.println("Witaj nieznajomy");
        } else if (firstName.equals(null)){
            System.out.println("Witaj "+lastName);
        }else if (lastName.equals(null)){
            System.out.println("Witaj "+firstName);
        }else {
            System.out.println("Witaj "+firstName+" "+lastName);
        }
        System.out.println("Kwota przed rabatem: "+price);
        System.out.println("Kwota po rabacie: "+discountPrice);
    }
}
