package example;

public class Computer {
    String processor;
    int memory;

    Computer(String proc) {
        processor = proc;
        memory = 8192;
        System.out.println("Tworzę nowy komputer");
    }

    void printInfo() {
        System.out.println(processor + " " + memory);
    }
}
