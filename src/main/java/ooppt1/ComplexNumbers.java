package ooppt1;

public class ComplexNumbers {

    private double real;
    private double imaginary;

    public ComplexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real+= real;
        this.imaginary+= imaginary;
    }

    public void add(ComplexNumbers complexNumbers) {
        this.real += complexNumbers.getReal();
        this.real += complexNumbers.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumbers complexNumbers) {
        this.real -= complexNumbers.getReal();
        this.imaginary -= complexNumbers.getImaginary();
    }
}
