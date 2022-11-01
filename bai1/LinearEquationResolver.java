package bai1;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a :");
        float a = scanner.nextFloat();
        System.out.println("Enter b :");
        float b = scanner.nextFloat();
        System.out.println("Enter c :");
        float c = scanner.nextFloat();
        if (a != 0) {
            System.out.println("nghiem la :" + ((c - b) / a));
        } else {
            if (b == c) {
                System.out.println("phuong trinh vo so nghiem");
            } else {
                System.out.println("phuong tring vo nghiem");
            }
        }
    }
}
