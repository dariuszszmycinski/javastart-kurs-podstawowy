package exercise2.logic;

import exercise2.model.Telephone;

public class Charger {
    public void charge(Telephone t){
        t.setChargeLevel(t.getChargeLevel()+1);
    }
}
