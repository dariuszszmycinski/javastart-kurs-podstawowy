package exercise2;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital=new Hospital();
        int choice;
        do{
            System.out.println("Wybierz opcję\n1 - Dodanie pacjenta\n2 - Wyświetlenie kolejki\n0 - Wyjście");
            choice=sc.nextInt();
            sc.nextLine();

            if (choice==1){
                System.out.println("Imię: ");
                String name = sc.nextLine();
                System.out.println("Nazwisko: ");
                String surname = sc.nextLine();
                System.out.println("Pesel: ");
                String pesel = sc.nextLine();
                Patient patient = new Patient(name, surname, pesel);
                hospital.addLine(patient);
            }else if (choice==2){
                hospital.printLine();
            }

        }while (choice!=0);


    }
}
