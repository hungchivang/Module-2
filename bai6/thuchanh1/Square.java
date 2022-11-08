package bai6.thuchanh1;

public class Square extends Rectangle {
    private double side;
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //    public double getSide() {
//        return getWight();
//    }
//
//    public void setSide(double side) {
//        setWight(side);
//        setLength(side);
//    }
//
//    @Override
//    public void setLength(double length) {
//        setSide(length);
//    }
//
//    @Override
//    public void setWight(double wight) {
//        setSide(wight);
//    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
