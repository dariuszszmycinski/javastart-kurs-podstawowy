package exercise2;

public class Balltefield {
    public static void main(String[] args) {
        Attacker swordman = new Attacker("Miecznik", 50, 10, 30, 0.2);
        Attacker archer = new Attacker("Łucznik", 50, 10, 30, 0.2);
        Defender shieldman = new Defender("Tarczownik", 80, 20, 40, 0.5);
        Attacker axeman = new Attacker("Topornik", 50, 30, 50, 0.2);
        Attacker spearman = new Attacker("Włócznik", 50, 30, 50, 0.2);
        Defender armorer = new Defender("Pancernik", 30, 20, 50, 1);
        Team red = new Team("Czerwoni");
        Team blue = new Team("Niebiescy");
        red.addMember(swordman);
        red.addMember(archer);
        red.addMember(shieldman);
        blue.addMember(axeman);
        blue.addMember(spearman);
        blue.addMember(armorer);
        battle(red,blue);


    }

    private static void battle(Team team1, Team team2) {
        if (team1.attackSum() > team2.defenceSum()) {
            team2.setActualHealth(team2.getActualHealth() + team2.defenceSum() - team1.attackSum());
        }
        if (team2.attackSum() > team1.defenceSum()) {
            team1.setActualHealth(team1.getActualHealth() + team1.defenceSum() - team2.attackSum());
        }
        System.out.println("Drużyna " + team1.getTeamName() + " po walce ma " + team1.getActualHealth() + " zdrowia.");
        System.out.println("Drużyna " + team2.getTeamName() + " po walce ma " + team2.getActualHealth() + " zdrowia.");
        if (team1.getActualHealth() > team2.getActualHealth()) {
            System.out.println("Wygrała drużyna " + team1.getTeamName() + " !!!");
        } else if (team2.getActualHealth() > team1.getActualHealth()) {
            System.out.println("Wygrała drużyna " + team2.getTeamName() + " !!!");
        } else {
            System.out.println("Remis.");
        }
    }
}
