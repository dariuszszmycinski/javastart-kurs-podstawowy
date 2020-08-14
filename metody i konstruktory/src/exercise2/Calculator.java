package exercise2;

public class Calculator {
    public static void main(String[] args) {
        Length length=new Length();
        Time time=new Time();
        System.out.println("1 metr to "+length.mToMm(1)+"mm.");
        System.out.println("1000000mm to "+length.mmToM(1000000)+"m.");
        System.out.println("14 godzin to "+time.sToMs(time.mToS(time.hToM(14)))+"ms.");
    }
}
