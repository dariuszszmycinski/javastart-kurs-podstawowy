package exercise2.application;

import exercise2.logic.Charger;
import exercise2.model.Telephone;

public class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung","Galaxy S10",3400,75);
        System.out.println(telephone.information());
        Charger charger = new Charger();
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        System.out.println(telephone.information());
    }
}
