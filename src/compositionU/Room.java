package compositionU;

public class Room {
    private Bed theBed;
    private Closet theCloset;
    private Light roomLight;

    public Room(Bed theBed, Closet theCloset, Light roomLight) {
        this.theBed = theBed;
        this.theCloset = theCloset;
        this.roomLight = roomLight;
    }



    public Light getRoomLight() {
        return roomLight;
    }

    public void isRoomLightOn(){
        if(roomLight.isTheSwitch() == true) {
            System.out.println("Room light is on");
        }else{
            System.out.println("Room Light is off");
        }
    }
    public void makingBed(){
        theBed.makeBed();
        System.out.println("Room->makingBed()->makeBed()");
    }
}
