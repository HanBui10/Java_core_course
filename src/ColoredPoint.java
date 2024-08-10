public class ColoredPoint  extends Point {
    private String color;

    // Constructor
    public ColoredPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    // Set color
    public void setColor(String color) {
        this.color = color;
    }

    // Get color
    public String getColor() {
        return this.color;
    }

    // Override display method
    @Override
    public void display() {
        super.display();
        System.out.println("Color: " + this.color);
    }
}
