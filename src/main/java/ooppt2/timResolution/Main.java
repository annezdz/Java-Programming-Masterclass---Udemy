package ooppt2.timResolution;

public class Main {

    public static void main(String[] args) {
        Wall1 wall1 = new Wall1("West");
        Wall1 wall2 = new Wall1("East");
        Wall1 wall3 = new Wall1("South");
        Wall1 wall4 = new Wall1("North");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern",4,3,2,1);
        Lamp lamp = new Lamp("Classic",false,75);

        Bedroom bedroom = new Bedroom("Anne's room",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }

}
