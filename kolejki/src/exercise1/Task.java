package exercise1;



public class Task implements Comparable<Task>{
    private String name;
    private String description = null;
    private Priority priority;

    public Task(String name, String description, Priority priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }



    @Override
    public int compareTo(Task t) {
        return  priority.compareTo(t.priority);
    }

    @Override
    public String toString() {
        return name + description;
    }

    public enum Priority{
        HIGH, MEDIUM, LOW;
    }
}
