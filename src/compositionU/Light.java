package compositionU;

public class Light {
    private boolean theSwitch = false;

    public boolean isTheSwitch() {
        return theSwitch;
    }

    public void turnOn(){
        theSwitch = true;
    }
    public void turnOff() {
        theSwitch = false;
    }
}
