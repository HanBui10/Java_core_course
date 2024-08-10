public class Line {
    private Point d1;
    private Point d2;

    // Constructors
    public Line(Point d1, Point d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public Line(int ax, int ay, int bx, int by) {
        this.d1 = new Point(ax, ay);
        this.d2 = new Point(bx, by);
    }

    // Display the endpoints
    public void display() {
        System.out.print("Đầu mút 1: ");
        d1.display();
        System.out.print("Đầu mút 2: ");
        d2.display();
    }

    // Translate the line
    public void move(int dx, int dy) {
        d1.move(dx, dy);
        d2.move(dx, dy);
    }

    // Calculate the length of the line
    public float length() {
        return d1.distanceFrom(d2);
    }
}
