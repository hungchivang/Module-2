package bai6.thuchanh1;

import java.util.Scanner;

public class Triangle extends Shape {
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    public Triangle() {
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        Scanner scanner =new Scanner(System.in);
        while (side1+side2<=side3 || side1 + side3<= side2 || side2+side3<= side1){
            System.out.println("khong phai la tam giac");
            side1 = scanner.nextDouble();
            side2 = scanner.nextDouble();
            side3 = scanner.nextDouble();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double nuaChuVi = (this.side1 + side2 + side3) / 2;
        return Math.sqrt(nuaChuVi * (nuaChuVi - side1)
                * (nuaChuVi - side2) *
                (nuaChuVi - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Tam giac co kich thuoc la: (" + side1 + "," + side2 + "," + side3 + ")";
    }
}
