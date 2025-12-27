package lab4task3;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        Point2d p2d = new Point2d (3,4);
        Point2d A = new Point2d(0, 0);
        Point2d B = new Point2d(2, 0);

        Point2d reverse2d = p2d.reverse(A, B);
        System.out.println("2D: Исходная точка:    " + p2d);
        System.out.println("2D: Отражение над y=0: " + reverse2d);

        Point3d p3d = new Point3d(1,  2, 5);
        Point3d A3 = new Point3d(0 , 0, 0);
        Point3d B3 = new Point3d(1, 0, 0);
        Point3d C3 = new Point3d(0, 1, 0);

        Point3d reverse3d = p3d.reversePlane(A3, B3, C3);
        System.out.println(" 3D: Исходная точка:    " + p3d);
        System.out.println("3D: Отражение над z=0: " + reverse3d);





    }
}
