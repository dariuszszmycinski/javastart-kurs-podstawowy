package exercise1;

public class ExhaustPart extends Part {
    private boolean euStandard;

    public ExhaustPart(int number, String producer, String model, String lot, boolean euStandard) {
        super(number, producer, model, lot);
        this.euStandard = euStandard;
    }

    public boolean isEuStandard() {
        return euStandard;
    }
}
