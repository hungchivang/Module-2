package bai3;

import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("nhap cong thuc can chuyen :");
        int number = inPut.nextInt();
            switch (number) {
                case 1 -> {
                    System.out.println("nhap do Fe :");
                    double fe = inPut.nextDouble();
                    System.out.println(fe + " do F = " + (5.0 / 9) * (fe - 32) + " do C");
                }
                case 2 -> {
                    System.out.println("nhap do C :");
                    double doC = inPut.nextDouble();
                    System.out.println(doC + " do C = " + ((9.0 / 5) * doC + 32) + " do F");
                }
                case 0 -> System.exit(0);
            }
    }
}
