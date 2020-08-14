package exercise1;

public class Pair<T,V> {
    private T firstArg;
    private V secondArg;

    public Pair(T firstArg, V secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public T getFirstArg() {
        return firstArg;
    }

    public void setFirstArg(T firstArg) {
        this.firstArg = firstArg;
    }

    public V getSecondArg() {
        return secondArg;
    }

    public void setSecondArg(V secondArg) {
        this.secondArg = secondArg;
    }
}
