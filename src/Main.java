//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        p1.move(1, 10);
        System.out.println("Toa do p1 sau khi di chuyen: ");
        p1.display();

        System.out.println("Khoang cach tu p1 den goc toa do: " + p1.distanceFromOrigin());

        Point p2 = new Point(1, 2);
        System.out.println("Khoang cach tu p2 den p1: " + p2.distanceFrom(p1));

        System.out.println("Diem doi xung cua p1 qua Ox:");
        p1.invertX().display();

        System.out.println("Diem doi xung cua p1 qua Oy: ");
        p1.invertY().display();

    }
}