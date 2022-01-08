package ooppt2;

public class Door {

    private String color;
    private Size size;
    private double weight;

    public Door(String color, Size size, double weight) {
        this.color = color;
        this.size = size;
        this.weight = weight;
    }

    public void open() {
        System.out.println("Open the door");
    }

    public void close() {
        System.out.println("Closing the door");
    }

    public String getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

}
