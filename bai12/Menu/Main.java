package bai12.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageAccount manageAccount = new ManageAccount();
        while (true) {
            System.out.println("chuc nang");
            System.out.println("1. dang nhap");
            System.out.println("2. dang ki");
            System.out.println("3.doi mat khau");
            System.out.println("4.thoat");
            System.out.println("chon chuc nang");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    manageAccount.dangnhap();
                    break;
                case 2:
                    manageAccount.dangki();
                    break;
                case 3:
                    manageAccount.SetPassword();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
