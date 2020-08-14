package exercise2;

public class Cooking {
    static double cup = 250;
    static double bigSpoon = 15;
    static double smallSpoon = 5;

    static double cupToMl(double cups){
        return cups*cup;
    }

    static double bigSpoonToMl(double spoons){
        return spoons*bigSpoon;
    }

    static double smallSpoonToMl(double spoons){
        return spoons*smallSpoon;
    }

    public static void main(String[] args) {
        double cups = 3.5;
        double smallS = 15;
        double bigS=5;
        double sum = Cooking.cupToMl(cups)+Cooking.smallSpoonToMl(smallS)+Cooking.bigSpoonToMl(bigS);
        System.out.println(sum);
    }
}
