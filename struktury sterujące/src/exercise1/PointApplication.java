package exercise1;

import exercise1.pointcontroller.PointController;
import exercise1.point.Point;

public class PointApplication {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        PointController pc = new PointController();

        System.out.println("X= " + p1.getCoordinateX() + " Y=" + p1.getCoordinateY());

        final int addX=0;
        final int addY=1;
        final int minusX=2;
        final int minusY=3;

        int option = addX;

        switch (option){
            case addX:
                pc.addX(p1);
                break;
            case minusX:
                pc.minusX(p1);
                break;
            case addY:
                pc.addY(p1);
                break;
            case minusY:
                pc.minusY(p1);
                break;
            default:
                System.out.println("Błędna wartość");
        }

        System.out.println("X= " + p1.getCoordinateX() + " Y=" + p1.getCoordinateY());
    }
}

