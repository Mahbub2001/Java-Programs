class Box {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

public class Getters_Setters {
    public static void main(String[] args) {
        Box box = new Box();
        box.setLength(10);
        box.setWidth(70);
        System.out.println("Width : " + box.getWidth() + "Length : " + box.getLength());
    }
}
