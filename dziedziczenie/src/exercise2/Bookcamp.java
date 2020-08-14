package exercise2;

public class Bookcamp extends OnlineTraining {
    private String teacherName;
    private String teacherSurname;
    private double consultationTime;

    public Bookcamp(String id, double price, String name, String description, int videoDuration, int trainingDuration, String teacherName, String teacherSurname, double consultationTime) {
        super(id, price, name, description, videoDuration, trainingDuration);
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;
        this.consultationTime = consultationTime;
    }

    public void print(){
        System.out.println(getId()+" "+getName()+" "+getDescription()+" kosztuje "+getPrice()+" zł, trwa "+getTrainingDuration()+" minut w tym wideo "+getVideoDuration()+" plus "+consultationTime+" godzin konsultacji z "+teacherName+" "+teacherSurname);
    }
}
