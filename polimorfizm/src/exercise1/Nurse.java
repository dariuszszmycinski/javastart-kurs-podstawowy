package exercise1;

public class Nurse extends Person {
    private double overtime;

    public Nurse(String name, String surname, double sallary, double overtime) {
        super(name, surname, sallary);
        this.overtime = overtime;
    }
    public String info(){
        return "Pielegniarka "+getName()+" "+getSurname()+" otrzymuje wynagrodzenie "+getSallary()+" miesiecznie oraz "+overtime+" z nadgodzin.";
    }

}
