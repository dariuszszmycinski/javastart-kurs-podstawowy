package exercise2;

public class FullTimeEmployee extends Employee {

    private String name;
    private String surname;
    private double salary;

    public FullTimeEmployee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public double salaryMonthly() {
        return salary;
    }

    @Override
    public double salaryYearly() {
        return salary*12.05;
    }

    @Override
    public String toString() {
        return name+" "+surname+" zarabia miesięcznie "+salaryMonthly()+" a rocznie "+salaryYearly()+".";
    }
}
