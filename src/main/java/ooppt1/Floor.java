package ooppt1;

public class Floor {

    private final double width;
    private final double length;

    public Floor(double width, double length) {
        this.width = Math.max(width, 0.0);
        this.length = Math.max(length, 0.0);
    }

    public double getArea() {
        return (this.width * this.length);
    }
}
