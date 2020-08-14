package example1;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student("Jan Kowalski",22);
        Student student2 = new Student("Jan Kowalski",22);
        Student student3 = new Student("Ewa Nowak",18);
        System.out.println("student1==student2:");
        System.out.println(student1==student2);
        System.out.println("student1.equals(student2):");
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student1.toString());
    }
}
