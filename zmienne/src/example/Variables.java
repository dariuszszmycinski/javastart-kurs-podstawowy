package example;

public class Variables {
    public static void main(String[] args) {
        String firstName = "Dariusz";
        String lastName = "Szmyciński";
        final String pesel = "891111*****";
        int age = 30;
        double heigh = 172.0;

        System.out.println("Cześć " + firstName + " " + lastName);
        System.out.println("Poniżej kilka informacji o Tobie:");
        System.out.println("Twój pesel to: " + pesel);
        System.out.println("Masz " + age + " lat.");
        System.out.println("Twój wzrost to: " + heigh + "cm.");
    }
}
