package bai4;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return ((b * b) - (4 * a * c));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
    }

    public double getRoot() {
        return -b / (2 * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a (a#0) :");
        double a = sc.nextDouble();
        System.out.println("nhap b :");
        double b = sc.nextDouble();
        System.out.println("nhap c :");
        double c = sc.nextDouble();

        QuadraticEquation Quadratic = new QuadraticEquation(a, b, c);

        double getDiscriminant = Quadratic.getDiscriminant();
        if (getDiscriminant < 0) {
            System.out.println("The equation has no roots");
        } else if (getDiscriminant == 0) {
            System.out.println("Ngiem cua phuong trinh la :" + Quadratic.getRoot());
        } else {
            System.out.println("2 nghiem cua phuong trinh la :" + Quadratic.getRoot1() + " va "+Quadratic.getRoot2());
        }
    }
}
