package bai1;

import java.util.Scanner;

public class DayofMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thang can xem ngay :");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("tháng 2 có thể có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng "+ month + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng "+ month + " có 30 ngày");
                break;
            default:
                System.out.println("Khong co thang nay");
        }
    }
}
