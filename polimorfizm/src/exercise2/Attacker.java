package exercise2;

public class Attacker extends Fighter{
    private double attackMultiplier;

    public Attacker(String name, int attack, int defence, int health, double attackMultiplier) {
        super(name, attack, defence, health);
        setAttack((int) (attack*(1+attackMultiplier)));
        this.attackMultiplier = attackMultiplier;
    }
}
