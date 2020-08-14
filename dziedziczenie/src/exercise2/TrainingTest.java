package exercise2;

public class TrainingTest {
    public static void main(String[] args) {
        Training bhp = new Training("1",00.00,"Szkolenie BHP","Konieczne do pracy");
        OnlineTraining java = new OnlineTraining("2",220,"Szkolenie Java","Od podstaw samodzielnie",3000,6000);
        StationaryTraining html = new StationaryTraining("3",8000.00,"Szkolenie HTML","Z nauczycielem","Wrocław",32);
        Bookcamp python = new Bookcamp("4",15999.99,"Bootcamp Python","Gwarancja pracy",3000,60000,"Jan","Kowalski",30);
        bhp.print();
        java.print();
        html.print();
        python.print();
    }
}
