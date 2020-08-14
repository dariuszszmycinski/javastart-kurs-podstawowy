package exercise2;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0]=new FullTimeEmployee("Jan","Kowalski",2800);
        employees[1]=new PartTimeEmployee("Ewa","Nowak",20,80);
        employees[2]=new FullTimeEmployee("Jacek","Lewandowski",5400);
        employees[3]=new PartTimeEmployee("Darek","Szmit",80,50);
        employees[4]=new PartTimeEmployee("Jurek","Kowalik",10,1000);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }

        System.out.println("Koszt miesięczny: "+monthlyCost(employees));
        System.out.println("Koszt roczny: "+yearlyCost(employees));

    }

    public static double monthlyCost(Employee[] employees){
        double sum=0;
        for (int i = 0; i < employees.length; i++) {
            sum+=employees[i].salaryMonthly();
        }
        return sum;
    }

    public static double yearlyCost(Employee[] employees){
        double sum=0;
        for (int i = 0; i < employees.length; i++) {
            sum+=employees[i].salaryYearly();
        }
        return sum;
    }
}


