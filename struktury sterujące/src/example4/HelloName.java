package example4;

public class HelloName {
    public static void main(String[] args) {
        final String name1 = "Krzysiek";
        final String name2 = "Maciek";
        final String name3 = "Marek";

        String name = name2;

        switch (name) {
            case name1:
                System.out.println("Siemano Krzychu! Witaj w programie.");
                break;
            case name2:
            case name3:
                System.out.println("Witam Panie Prezesie. Jak mija dzień?");
                break;
            default:
                System.out.println("Witaj nieznany użytkowniku!");
        }
    }
}
