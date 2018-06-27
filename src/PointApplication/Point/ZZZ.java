package PointApplication.Point;

public class ZZZ {

    public static void main(String[] args) {

        Point[] arrayOfPoints = new Point[3];

        Point point = new Point(1, 2);
        arrayOfPoints[0] = point;

        Point point1 = new Point(4, 6);
        arrayOfPoints[1] = point1;

        Point point2 = new Point(10, 66);
        arrayOfPoints[2] = point2;

        int a = arrayOfPoints[0].getX();
        int b = arrayOfPoints[0].getY();

        int c = arrayOfPoints[1].getX();
        int d = arrayOfPoints[1].getY();

        int e = arrayOfPoints[2].getX();
        int f = arrayOfPoints[2].getY();

        System.out.println("First point - x value: "+ a + ", y value: " + b);

    }
}
