package ooppt1;

public class Vehicle1 {

    private String name;
    private double velocity;

    public Vehicle1(String name, double velocity) {
        this.name = name;
        this.velocity = 0;
    }

    public String getName() {
        return name;
    }

    public double getVelocity() {
        return velocity;
    }

    public void increaseVelocity(double value) {
         velocity += value;
    }

    public void decreaseVelocity(double value) {
        velocity = Math.max(velocity - value, 0);
    }
}
