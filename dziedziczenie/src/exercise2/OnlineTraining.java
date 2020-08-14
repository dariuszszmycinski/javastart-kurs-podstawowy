package exercise2;

public class OnlineTraining extends Training{
    private int videoDuration;
    private int trainingDuration;

    public OnlineTraining(String id, double price, String name, String description, int videoDuration, int trainingDuration) {
        super(id, price, name, description);
        this.videoDuration = videoDuration;
        this.trainingDuration = trainingDuration;
    }

    public int getVideoDuration() {
        return videoDuration;
    }

    public int getTrainingDuration() {
        return trainingDuration;
    }

    public void print(){
        System.out.println(getId()+" "+getName()+" "+getDescription()+" kosztuje "+getPrice()+" zł, trwa "+trainingDuration+" minut w tym wideo "+videoDuration);
    }
}

