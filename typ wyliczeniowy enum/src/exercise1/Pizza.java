package exercise1;

public enum Pizza {
    MARGHERITA(true,true, false, false),
    CAPRICIOSA(true,true,true, false),
    PROSCIUTTO(true,true,false,true),
    ;

    private boolean tomatoSauce;
    private boolean cheese;
    private boolean mushrooms;
    private boolean ham;

    Pizza(boolean tomatoSauce, boolean cheese, boolean mushrooms, boolean ham) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
    }

    @Override
    public String toString() {
        return "Pizza "+name()+" {" +
                "tomatoSauce=" + tomatoSauce +
                ", cheese=" + cheese +
                ", mushrooms=" + mushrooms +
                ", ham=" + ham +
                '}';
    }
}
