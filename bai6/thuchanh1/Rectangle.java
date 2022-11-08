package bai6.thuchanh1;

public class Rectangle extends Shape {
    private double wight = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double weight, double height) {
        this.wight = weight;
        this.length = height;
    }

    public Rectangle(String color, boolean filled, double weight, double height) {
        super(color, filled);
        this.wight = weight;
        this.length = height;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * wight;
    }

    public double getPerimeter() {
        return (length + wight) * 2;
    }
    @Override
    public String toString() {
        return "A Rectangle with width=" + getWight()+ "and length=" + getLength()+ ", which is a subclass of "+super.toString();
    }


}
