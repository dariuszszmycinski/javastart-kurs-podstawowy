package exercise1;

public class Doctor extends Person {
    private double bonus;

    public Doctor(String name, String surname, double sallary, double bonus) {
        super(name, surname, sallary);
        this.bonus = bonus;
    }

    public String info(){
        return "Doktor "+getName()+" "+getSurname()+" otrzymuje wynagrodzenie "+getSallary()+" miesiecznie oraz "+bonus+" premii.";
    }
}
