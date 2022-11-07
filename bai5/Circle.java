package bai5;

public class Circle {
    private double radius = 1.0;
    final private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (this.radius * this.radius * Math.PI);
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
