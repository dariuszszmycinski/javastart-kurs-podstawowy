package exercise1;

import javax.swing.*;

public class Apple extends Fruit {
    private String specie;
    private static final String TYPE = "jabłkowaty";

    public Apple(int weight, String specie) {
        super(weight, TYPE);
        this.specie = specie;
    }


    public String getInfo(){
        return super.getInfo() + " Odmiana "+specie+".";
    }

}
