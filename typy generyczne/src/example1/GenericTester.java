package example1;

public class GenericTester {
    public static void main(String[] args) {
        Container<Integer> integers = new Container<Integer>();
        integers.setArray(new Integer[5]);
        integers.getArray()[0]=5;

        Container<String> strings = new Container<String>();
        strings.setArray(new String[10]);
        strings.getArray()[0]="Ania";
        strings.getArray()[1]="Basia";

        Integer num = integers.get(0);
        String str=strings.get(0);

        System.out.println(num);
        System.out.println(str);
        strings.printObjects();
    }
}
