package PointApplication.PointController;

import PointApplication.Point.Point;


public class PointController {

    Point point;

    public PointController(Point point) {
        this.point = point;
    }

    public void addX() {
        int x = point.getX();
        x++;
        point.setX(x);
    }

    public void minusX() {
        int x = point.getX();
        x--;
        point.setX(x);
    }

    public void addY() {
        int y = point.getY();
        y++;
        point.setY(y);
    }

    public void minusY() {
        int y = point.getY();
        y--;
        point.setY(y);
    }

}
