package exercise1;

public class Name implements Comparable<Name> {

    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Name o) {
        return 0;
    }
}
