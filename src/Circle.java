public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getDiameter() {
        return 2 * radius * 3.14;
    }

    public void display() {

        System.out.printf("Radius: %.2f%n", getRadius());
        System.out.printf("Color: %s%n", getColor());
        System.out.printf("Area: %.2f%n", getArea());
        System.out.printf("Diameter: %.2f%n", getDiameter());
    }

}
