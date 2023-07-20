public class Pixel {
    private int x;
    private int y;
    private int color;

    public Pixel(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void display() {
        System.out.println(this.x + " " + this.y + " " + this.color);
    }
}
