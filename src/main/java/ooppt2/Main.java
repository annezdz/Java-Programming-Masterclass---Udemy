package ooppt2;

public class Main {

    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20,20,5);
//        Case aCase = new Case("220B","Dell","240",dimensions);
//
//        Monitor monitor = new Monitor("27inch beast","Acer",27,new Resolution(2540,1440));
//        MotherBoard motherBoard = new MotherBoard("BJ-200","Asus",4,6,"v2.44");
//
//        PC thePC = new PC(aCase,monitor,motherBoard);
//        thePC.powerUp();

        Size size = new Size(2,2);
        Size sizeDoor = new Size(2,3);
        Door door = new Door("brown",sizeDoor,12.5);
        door.getSize().getHeight();
        door.getSize().getWidth();
        RoomOpt1 roomOpt1 = new RoomOpt1(size,door,true);
        roomOpt1.closingTheDoor();
        roomOpt1.openingTheDoor();
        Room room = new Room(size,door,false);
        room.getDoor().open();
        room.getDoor().close();
        room.isHasBathroom();
    }
}
