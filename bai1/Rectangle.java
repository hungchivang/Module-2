package bai1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong :");
        float width = scanner.nextFloat();
        System.out.println("Nhap chieu dai :");
        float height = scanner.nextFloat();
        System.out.println("Dien tich hinh chu nhat la :"+ (width*height));
    }
}
