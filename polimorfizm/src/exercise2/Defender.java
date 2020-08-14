package exercise2;

public class Defender extends Fighter {
    private double defenceMultiplier;

    public Defender(String name, int attack, int defence, int health, double defenceMultiplier) {
        super(name, attack, defence, health);
        setDefence((int) (defence*(1+defenceMultiplier)));
        this.defenceMultiplier = defenceMultiplier;
    }
}
