package bai2;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle ");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("nhap so can ve :");
        while (true) {
            int number = inPut.nextInt();
            switch (number) {
                case 1:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("  *  ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("  *  ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j <7; j++) {
                            System.out.print("  *  ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("khong co hinh can ve");
                    break;
            }
        }
    }
}

