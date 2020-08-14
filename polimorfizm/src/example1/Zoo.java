package example1;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Mruczek");
        animals[2] = new Animal("Kotopies");

        changeAnimalName(animals[0], "Pieseł");

        for (Animal animal : animals) {
            animal.giveSound();
        }

        Dog specificDog=(Dog)animals[0];
        specificDog.bark();

        ((Cat)animals[1]).meow();
    }

    private static void changeAnimalName(Animal animal, String newName){
        animal.setName(newName);
    }
}
