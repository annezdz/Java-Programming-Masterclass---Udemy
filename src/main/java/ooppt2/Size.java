package ooppt2;

public class Size {

    private int height;
    private int width;

    public Size(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        System.out.println(width);
        return width;
    }

    public int getHeight() {
        System.out.println(height);
        return height;
    }
}
