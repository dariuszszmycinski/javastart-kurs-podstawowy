package example3;

public interface Car {
    default public void printName(){
        System.out.print("Car");
    }
}
