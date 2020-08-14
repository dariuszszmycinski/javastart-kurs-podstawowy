package example2;

public class Company {
    public static void main(String[] args) {
        Emoloyee[] employees = new Emoloyee[20];
        employees[0]=new Emoloyee("Jan", "Nowak",3500);
        employees[1]=new Emoloyee("Marta", "Zięba", 3700);
        employees[2]=new Emoloyee("Karol", "Wojak",4500);

        int employeeIndex = 2;
        System.out.println(employees[employeeIndex-1].getFirstName()+" "+
                employees[employeeIndex-1].getLastName()+": "+
                employees[employeeIndex-1].getSalary()+"zł.");

        int employeesSize=employees.length;
        System.out.println("Wielkość tablicy: "+employeesSize);
        System.out.println("Ostatni element tablicy to: "+employees[employeesSize-1]);
    }
}
