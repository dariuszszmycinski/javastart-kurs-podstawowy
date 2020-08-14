package exercise1;

public class Werehause {
    public static void main(String[] args) {
        Part extinguisher = new Part(1,"Fire department","A","123");
        Tire bigTires = new Tire(2,"Goodyear","winter","12B",16,216);
        ExhaustPart silencer = new ExhaustPart(3,"Honda","expensive","2020",true);

        System.out.println(extinguisher.getProducer());
        System.out.println(bigTires.getModel());
        System.out.println(silencer.isEuStandard());
    }
}
