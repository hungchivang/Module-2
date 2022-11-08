package bai6.thuchanh1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle tamGiac1 = new Triangle();
        System.out.println("Xong ham tao khong doi");
        Triangle tamGiac2;
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        tamGiac2 = new Triangle(side1, side2, side3);
        System.out.println(tamGiac2.toString());
        System.out.println("Dien tich: " + tamGiac2.getArea());
        System.out.println("Chu vi: " + tamGiac2.getPerimeter());
    }
}
