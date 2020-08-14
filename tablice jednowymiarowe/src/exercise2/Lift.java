package exercise2;

public class Lift {
    private Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final int maxWeight = 400;

    public void add(Person person) {
        if (peopleNumber < 4) {
            people[peopleNumber] = person;
            peopleNumber++;
        } else {
            System.out.println("Winda pełna");
        }
    }

    void start() {
        if (getTotalWeight() <= maxWeight) {
            System.out.println("Winda wystartowała");
        } else {
            System.out.println("Waga przekroczona o " + (getTotalWeight() - maxWeight) + "kg");
        }
    }

    private int getTotalWeight() {
        int totalWeight=0;
        if (people[0]!=null)
            totalWeight+=people[0].getWeight();
        if (people[1]!=null)
            totalWeight+=people[1].getWeight();
        if (people[2]!=null)
            totalWeight+=people[2].getWeight();
        if (people[3]!=null)
            totalWeight+=people[3].getWeight();
        return totalWeight;
    }

    void clear() {
        people[0]=null;
        people[1]=null;
        people[2]=null;
        people[3]=null;
        peopleNumber=0;
        System.out.println("Winda jest pusta");
    }

}
