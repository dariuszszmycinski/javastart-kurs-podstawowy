package exercise2;

public class Team {
    private String teamName;
    private int membersQuantity = 0;
    private int actualHealth=0;

    public String getTeamName() {
        return teamName;
    }

    public int getActualHealth() {
        return actualHealth;
    }

    public void setActualHealth(int actualHealth) {
        this.actualHealth = actualHealth;
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    private Fighter[] members=new Fighter[3];

    public void addMember(Fighter fighter){
        members[membersQuantity]=fighter;
        actualHealth=actualHealth+fighter.getHealth();
        membersQuantity++;
    }

    public int attackSum(){
        return members[0].getAttack()+members[1].getAttack()+members[2].getAttack();
    }

    public int defenceSum(){
        return members[0].getDefence()+members[1].getDefence()+members[2].getDefence();

    }

}
