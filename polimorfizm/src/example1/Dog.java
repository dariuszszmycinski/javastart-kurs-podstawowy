package example1;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    public void giveSound(){
        System.out.println("Jestem psem i wabię się "+getName());
    }

    public void bark(){
        System.out.println("Hau hau");
    }
}
