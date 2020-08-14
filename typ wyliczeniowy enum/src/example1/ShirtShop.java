package example1;

import java.util.Scanner;

public class ShirtShop {
    public static void main(String[] args) {
        System.out.println("Dostępne rozmiary:");
        for (Size s : Size.values()) {
            System.out.println(s.getDescription());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rozmiar: ");
        String sizeDesc = sc.nextLine();
        Size size = Size.fromDescription(sizeDesc);

        Tshirt tshirt = new Tshirt();
        tshirt.setSize(size);
        System.out.println("Rozmiar koszulki: " + tshirt.getSize().getDescription());
    }
}
