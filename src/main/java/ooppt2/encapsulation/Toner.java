package ooppt2.encapsulation;

public class Toner {

    private int chargeLevel;
    private boolean isColored;

    public Toner(boolean isColored) {
        this.chargeLevel = 100;
        this.isColored = isColored;
    }
//    public void initialTonerLevel() {
//        this.chargeLevel = 100;
//    }

    public int getChargeLevel() {
        System.out.println(chargeLevel);
        return chargeLevel;
    }

    public boolean isColored() {
        System.out.println(isColored);
        return isColored;
    }
}
