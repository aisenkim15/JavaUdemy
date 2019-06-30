package compositionU;

public class Closet {
    private int doors;
    private int width;
    private int height;
    private boolean hasShelf;

    public Closet(int doors, int width, int height, boolean hasShelf) {
        this.doors = doors;
        this.width = width;
        this.height = height;
        this.hasShelf = hasShelf;
    }

    public int getDoors() {
        return doors;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isHasShelf() {
        return hasShelf;
    }
}
