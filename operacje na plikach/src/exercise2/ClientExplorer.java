package exercise2;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientExplorer {
    public static void main(String[] args) {
        final String fileName = "clients.csv";
        try {
            Client[] clients = ClientDataReader.readFile(fileName);
            printMostValuableClient(clients);
            String country = readCountryFromUser();
            printClientsFromCountry(clients, country);
            printAvgValueForCountry(clients, country);
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku o nazwie " + fileName);
        }
    }

    private static void printMostValuableClient(Client[] clients) {
        Client best = clients[0];
        for (int i = 0; i < clients.length; i++) {
            if (clients[i].getValue() > best.getValue()) {
                best = clients[i];
            }
        }
        System.out.println("Klient o największej wartości: ");
        System.out.println(best.toString());
    }

    private static String readCountryFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj kraj do wyświetlenia: ");
        String country = null;
        try {
            country = sc.nextLine();
        } catch (InputMismatchException e) {
            System.err.println("Należy podać państwo.");
        }
        sc.close();
        return country;
    }

    private static void printClientsFromCountry(Client[] clients, String country) {
        boolean countryExists = false;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i].getCountry().equals(country)) {
                System.out.println(clients[i].toString());
                countryExists = true;
            }
        }
        if (countryExists = false) {
            System.out.println("Nie istnieją klienci z kraju " + country);
        }
    }

    private static void printAvgValueForCountry(Client[] clients,String country){
        double sumValue=0;
        double counter=0;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i].getCountry().equals(country)) {
                System.out.println(clients[i].toString());
                counter++;
                sumValue+=clients[i].getValue();
            }
        }
        double avg = sumValue/counter;
        System.out.printf("Średnia wartość klienta z %s to %.2f", country, avg);
    }

}
