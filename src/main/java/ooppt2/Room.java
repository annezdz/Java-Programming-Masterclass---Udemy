package ooppt2;

public class Room {

    private Size size;
    private Door door;

    private boolean hasBathroom;

    public Room(Size size, Door door, boolean hasBathroom) {
        this.size = size;
        this.door = door;
        this.hasBathroom = hasBathroom;
    }

    public Size getSize() {
        return size;
    }

    public Door getDoor() {
        return door;
    }

    public boolean isHasBathroom() {
        System.out.println(hasBathroom);
        return hasBathroom;
    }
}
