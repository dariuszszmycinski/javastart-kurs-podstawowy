package exercise2;

public class Dice {
    int number;

    Dice() {
        number = (int) ((Math.random() * 5) + 1);
    }

    Dice(int sidesNumber) {
        number = ((int) ((Math.random() * (sidesNumber-1))+1));
    }

    void roll() {
        number = (int) ((Math.random() * 5) + 1);
    }

    void display() {
        System.out.println("Wypadło: " + number);
    }
}
