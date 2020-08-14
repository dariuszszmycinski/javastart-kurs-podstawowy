package exercise2;

public class Roller {
    public static void main(String[] args) {
        Dice rzut1 = new Dice();
        rzut1.display();
        Dice rzut2 = new Dice(100);
        rzut2.display();
        rzut1.roll();
        rzut1.display();
    }
}
