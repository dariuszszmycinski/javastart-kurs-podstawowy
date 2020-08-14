package exercise2;

public class PartTimeEmployee extends Employee {
    private String name;
    private String surname;
    private double hoursMonthly;
    private double salaryPerHour;

    public PartTimeEmployee(String name, String surname, double hoursMonthly, double salaryPerHour) {
        this.name = name;
        this.surname = surname;
        this.hoursMonthly = hoursMonthly;
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public double salaryMonthly() {
        return salaryPerHour*hoursMonthly;
    }

    @Override
    public double salaryYearly() {
        return salaryMonthly()*12;
    }

    @Override
    public String toString() {
        return name+" "+surname+" zarabia miesięcznie "+salaryMonthly()+" a rocznie "+salaryYearly()+".";
    }
}
