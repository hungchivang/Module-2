package bai4;

import java.util.Scanner;

public class Rectangle {
    double height, weight;

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getArea() {
        return this.height*this.weight;
    }

    public double getPerimeter() {
        return (this.height*this.weight)*2;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai :");
        double weight= sc.nextDouble();
        System.out.println("nhap chieu rong :");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(height, weight);
        System.out.println("dien tich hinh chu nhat la :" + rectangle.getArea());
        System.out.println("chu vi hinh chu nhat la :" + rectangle.getPerimeter());

    }
}
