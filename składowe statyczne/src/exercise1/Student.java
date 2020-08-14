package exercise1;

public class Student {
    private String name;
    private String surname;
    private int index;
    public static int studentQuantity=0;

    public Student(String name, String surname, int index) {
        this.name = name;
        this.surname = surname;
        this.index = index;
        studentQuantity++;
    }


}
