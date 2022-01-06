package ooppt1;

public class Car2 extends Vehicle1{

    private String brand;
    private String fuel;
    private String placa;
    private int year;
    private String color;
    private int gears;

    double speed = getVelocity();


    public Car2(String name, double velocity,String brand, String fuel, String placa, int year,
                String color, int gears) {
        super(name, velocity);
        this.brand = brand;
        this.fuel = fuel;
        this.placa = placa;
        this.year = year;
        this.color = color;
        this.gears = gears;
    }

    public String getBrand() {
        return brand;
    }

    public String getFuel() {
        return fuel;
    }

    public String getPlaca() {
        return placa;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int changingGears() {
        if(speed > 0 && speed < 10) {
            setGears(1);
        } else if(speed < 20) {
            setGears(2);
        } else if(speed < 60) {
            setGears(3);
        } else if(speed < 80) {
            setGears(4);
        } else {
            setGears(5);
        }
        return this.gears;
    }



}
