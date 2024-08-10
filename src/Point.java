public class Point {
    private int x;
    private int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(){}

    public void display() {
        System.out.println(this.x + " " + this.y);
    }

    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    public float distanceFromOrigin() {
        return (float) Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public float distanceFrom(Point p) {
        return (float) Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }

    public Point invertX() {
        return new Point(this.x, -this.y);
    }

    public Point invertY() {
        return new Point(-this.x, this.y);
    }
}
