//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        p1.display();
        p1.move(1, 1);
        p1.display();
        System.out.println("K/c p1 den toa do 0 la: " + p1.distanceFromOrigin());

        Point p2 = new Point(-10, 78);
        System.out.println("K/c p2 den toa do 0 la: " + p2.distanceFrom(p1));

        Point pOX = p1.invertX();
        Point pOY = p1.invertY();

        System.out.print("Diem doi xung cua p1 qua truc ox: ");
        pOX.display();

        System.out.print("Diem doi xung cua p1 qua truc oy: ");
        pOY.display();
    }
}