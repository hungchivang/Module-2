package bai6.thuchanh3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(3.0f,2.5f);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(3.0f,2.5f,1.0f);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
