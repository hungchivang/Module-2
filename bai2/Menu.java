package bai2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        System.out.println("1. draw the triangle");
        System.out.println("2. draw the square");
        System.out.println("3. draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Nhap su lua chon o tren");
        while(true) {
            int number = inPut.nextInt();
            switch (number) {
                case 1 -> {
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                }
                case 2 -> {
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                }
                case 3 -> {
                    System.out.println("******");
                    System.out.println("******");
                }
                case 0 -> System.exit(0);
                default -> System.out.println("KHONG CO HINH NAY");
            }
        }
    }
}
