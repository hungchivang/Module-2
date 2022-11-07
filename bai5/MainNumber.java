package bai5;

import java.util.Scanner;

public class MainNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.hien thi");
        System.out.println("2.add");
        while (true) {
            System.out.println("nhap so can hien thi");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ManageNumber.show();
                    break;
                case 2:
                    System.out.println("nhap so can them");
                    int number = sc.nextInt();
                    ManageNumber.add(number);
                    ManageNumber.show();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
