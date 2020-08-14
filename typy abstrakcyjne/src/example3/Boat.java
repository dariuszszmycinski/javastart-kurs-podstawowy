package example3;

public interface Boat {
    default public void printName(){
        System.out.print("Boat");
    }
}
