package ooppt2;

public class RoomOpt1 {

    private Size size;
    private Door door;

    private boolean hasBathroom;


    public RoomOpt1(Size size, Door door, boolean hasBathroom) {
        this.size = size;
        this.door = door;
        this.hasBathroom = hasBathroom;
    }

    public void openingTheDoor() {
        door.open();
    }

    public void closingTheDoor() {
        door.close();
    }
}
