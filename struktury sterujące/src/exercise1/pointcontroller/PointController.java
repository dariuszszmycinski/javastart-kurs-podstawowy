package exercise1.pointcontroller;

import exercise1.point.Point;

public class PointController {

    public void addX(Point p) {
        p.setCoordinateX(p.getCoordinateX() + 1);
    }

    public void minusX(Point p) {
        p.setCoordinateX(p.getCoordinateX() - 1);
    }

    public void addY(Point p) {
        p.setCoordinateY(p.getCoordinateY() + 1);
    }

    public void minusY(Point p) {
        p.setCoordinateY(p.getCoordinateY() - 1);
    }

}
