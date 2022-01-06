package ooppt1;

public class Cuboid extends Rectangle2 {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = Math.max(height,0.0);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
