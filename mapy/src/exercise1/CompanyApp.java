package exercise1;

import java.util.InputMismatchException;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        try {
            company.chooseOption();
        } catch (InputMismatchException e) {
            System.err.println("Błędne dane!");
        }
    }
}
