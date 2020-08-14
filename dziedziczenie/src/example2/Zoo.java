package example2;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setColor("Czarny");
        Bird bird = new Bird();
        bird.setColor("Niebieski");
        System.out.println("Zwierzęta dają głos: ");
        System.out.println(cat.getColor()+" kot:");
        cat.makeSound();
        System.out.println(bird.getColor()+" ptak:");
        bird.makeSound();
    }
}
