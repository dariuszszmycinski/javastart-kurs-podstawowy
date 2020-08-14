package example1;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    public void giveSound(){
        System.out.println("Jestem kotem i wabię się "+getName());
    }

    public void meow(){
        System.out.println("Miaaaau");
    }
}
