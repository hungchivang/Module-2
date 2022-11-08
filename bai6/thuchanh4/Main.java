package bai6.thuchanh4;

import bai6.thuchanh3.Point2D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3.0f,2.5f);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));
    }
}
