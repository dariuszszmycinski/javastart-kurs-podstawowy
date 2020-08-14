package exercise1;

public class PairTest {
    public static void main(String[] args) {
        Pair<String,Integer> girl = new Pair<>("Ania",12);
        Pair<String,Double> dog = new Pair<>("Burek",3.5);
        Pair<String,String> house = new Pair<>("zielony","domek");
        print(girl);
        print(dog);
        print(house);
    }

    static <T, V> void print(Pair<T, V> pair) {
        System.out.println("<" + pair.getFirstArg() + " ; " + pair.getSecondArg() + ">");
    }
}
