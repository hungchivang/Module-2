package bai7.baithuchanh2;

import bai6.thuchanh1.Circle;

public class ComparableCircle extends Circle implements InterfaceComparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle comparableCircle) {
        if (getRadius() > comparableCircle.getRadius()) return 1;
        else if (getRadius() < comparableCircle.getRadius()) return -1;
        else return 1;
    }
}
