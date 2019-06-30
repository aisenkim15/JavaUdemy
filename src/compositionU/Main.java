package compositionU;

public class Main {
    public static void main(String[] args) {
        Bed theBed = new Bed(90, 90, true);
        Closet theCloset = new Closet(2, 40, 40, true);
        Light roomLight = new Light();
        Room theRoom = new Room(theBed, theCloset, roomLight);

        theRoom.getRoomLight().turnOn();
        theRoom.isRoomLightOn();
        theRoom.makingBed();
    }
}
