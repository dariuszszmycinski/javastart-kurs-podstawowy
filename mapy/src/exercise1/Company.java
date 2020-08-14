package exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Company {
    Scanner sc = new Scanner(System.in);

    private Map<String, Employee> employees = new HashMap<>();

    public void chooseOption(){
        final int ADD = 0;
        final int SEARCH = 1;
        final int EXIT = 2;
        boolean exit = false;

        while (exit == false){
            System.out.println("Wybierz opcję:\nDodaj pracownika (0)\nWyszukaj pracownika(1)\nWyjście(2)");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case ADD:
                    addEmployee();
                    break;
                case SEARCH:
                    searchEmployee();
                    break;
                case EXIT:
                    System.out.println("Do widzenia");
                    exit=true;
                    break;
                default:
                    System.err.println("Nie ma takiej opcji.");
                    break;
            }
        }

        sc.close();
    }

    public void searchEmployee(){
        System.out.println("Podaj imię i nazwisko wyszukiwanego pracownika:");
        String key = sc.nextLine();
        System.out.println(employees.get(key));
    }

    public void addEmployee(){
            System.out.println("Podaj imię nowego pracownika:");
            String name = sc.nextLine();
            System.out.println("Podaj nazwisko nowego pracownika:");
            String surname  = sc.nextLine();
            System.out.println("Podaj pensję nowego pracownika:");
            double salary = sc.nextDouble();
            sc.nextLine();
            employees.put(name+" "+surname,new Employee(name,surname,salary));
    }
}
