package bai6.thuchanh2;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);
        circle1 = new Circle(2.0, "yellow");
        System.out.println(circle1.getArea());


        Circle circle= new Cylinder(5.0);
        System.out.println(circle);
    }
}
