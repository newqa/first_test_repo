package PointApplication;

import PointApplication.Point.Point;
import PointApplication.PointController.PointController;

import java.util.Scanner;


public class PointApplication {

    public static final int ADD_X = 1;
    public static final int MINUS_X = 2;
    public static final int ADD_Y = 3;
    public static final int MINUS_Y = 4;

    public static void main(String[] Args) {

        Point point = new Point(11, 21);
        PointController pointController = new PointController(point);

        point.printThisPoint();

        pointController.addX();
        System.out.println(point.getX());

        pointController.minusX();
        System.out.println(point.getX());

        pointController.addY();
        System.out.println(point.getY());

        pointController.minusY();
        System.out.println(point.getY());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number from 1 to 4");
        int input = scanner.nextInt();
        System.out.println(input);

        switch (input) {
            case ADD_X:
                pointController.addX();
                System.out.println("Add 1 to x was chosen. New x value is: " + point.getX());
                break;
            case MINUS_X:
                pointController.minusX();
                System.out.println("Subtract 1 from x was chosen. New x value is: " + point.getX());
                break;
            case ADD_Y:
                pointController.addY();
                System.out.println("Add 1 to y was chosen. New y value is: " + point.getY());
                break;
            case MINUS_Y:
                pointController.minusY();
                System.out.println("Subtract 1 from y was chosen. New y value is: " + point.getY());
                break;
            default:
                System.out.println("Incorrect value was chosen :(");
                break;
        }
    }
}
