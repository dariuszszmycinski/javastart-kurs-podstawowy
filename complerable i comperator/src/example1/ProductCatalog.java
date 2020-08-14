package example1;

import java.util.Arrays;
import java.util.Comparator;

public class ProductCatalog {
    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0]=new Product("Amino","Zupa pomidorowa",3.90);
        products[1]=new Product("Amino","Zupa pomidorowa",3.90);
        products[2]=new Product("WINIARY","Zupa pomidorowa",4.20);
        products[3]=new Product("WINIARY","Zupa pieczarkowa",4.10);
        products[4]=new Product("WINIARY","Rosół",3.60);
        products[5]=new Product("Knorr","Placki ziemiaczane",6.40);
        products[6]=new Product("Knorr","Racuchy",7.20);

        System.out.println("Nieposortowana: ");
        for (Product p:products){
            System.out.println(p);
        }

        Arrays.sort(products);
        System.out.println("Posortowana v1: ");
        for (Product p:products){
            System.out.println(p);
        }

        Arrays.sort(products, new Product.ProductNameComparator());
        System.out.println("Posortowana v2: ");
        for (Product p:products){
            System.out.println(p);
        }

        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getProducer().compareTo(o2.getProducer());
            }
        });
        System.out.println("Posortowana v3: ");
        for (Product p:products){
            System.out.println(p);
        }

    }
}
