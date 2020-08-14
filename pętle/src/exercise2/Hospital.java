package exercise2;

public class Hospital {
    private Patient[] line = new Patient[10];
    private int lineNumber = 0;

    public void addLine(Patient patient) {
        if (lineNumber<10){
            line[lineNumber]=patient;
            lineNumber++;
        }else {
            System.out.println("Zapraszamy jutro.");
        }

    }

    public void printLine() {
        for (int i = 0; i < lineNumber; i++) {
            System.out.println(line[i].getFirstName() + " "
                    + line[i].getLastName() + " "
                    + line[i].getPesel());
        }
    }

}
