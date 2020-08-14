package exercise1;

import exercise1.pointcontroller.PointController;
import exercise1.point.Point;

public class PointApplication {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        PointController pc = new PointController();

        System.out.println("X= " + p1.getCoordinateX() + " Y=" + p1.getCoordinateY());
        pc.addX(p1);
        pc.addX(p1);
        pc.minusY(p1);
        System.out.println("X= " + p1.getCoordinateX() + " Y=" + p1.getCoordinateY());
    }
}

