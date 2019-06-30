package compositionU;

public class Bed {
    private int width;
    private int height;
    private boolean frame;

    public Bed(int width, int height, boolean frame) {
        this.width = width;
        this.height = height;
        this.frame = frame;
    }

    public void sleep(){
        System.out.println("Currently Sleeping at a bed with width: " + width + " height: " + height);
    }
    public void makeBed(){
        System.out.println("Bed -> makeBed()");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isFrame() {
        return frame;
    }
}
