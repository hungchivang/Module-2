package bai12.Menu;

import java.util.*;

public class ManageAccount {
    Scanner scanner = new Scanner(System.in);
    Map<String, String> map = new HashMap<>();

    public void dangki() {
        System.out.println("Nhap tai khan ");
        String username = scanner.nextLine();
        System.out.println("Nhap mat khau ");
        String password = scanner.nextLine();
        map.put(username, password);
    }

    public void dangnhap() {
        System.out.println("Nhap tai khoan ");
        String username = scanner.nextLine();
        System.out.println("Nhap mat khau ");
        String password = scanner.nextLine();
        if (CheckUsername(username)) {
            if (map.get(username).equals(password)) {
                System.out.println("dang nhap thanh cong");
            } else {
                System.out.println("tai khoan sai");
                retryEnter();
            }
        }else {
            System.out.println("tai khoan sai");
            retryEnter();
        }
    }

    public boolean CheckUsername(String username) {
        if (map.containsKey(username)) return true;
        return false;
    }

    public void retryEnter(){
        System.out.println("1. nhap lai, 2. dang ki moi");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                dangnhap();
                break;
            case 2:
                dangki();
                break;
        }
    }

    public void SetPassword() {
        System.out.println("nhap tai khoan cu");
        System.out.println("Nhap tai khoan ");
        String username = scanner.nextLine();
        System.out.println("Nhap mat khau ");
        String password = scanner.nextLine();

        if (CheckUsername(username)) {
            if (map.get(username).equals(password)) {
                System.out.println("Nhap mat khau moi");
                String newPassword = scanner.nextLine();
                map.put(username, newPassword);
            } else {
                System.out.println("mat khau  sai");
            }
        } else {
            System.out.println("tai khoan khong ton tai");
        }
    }

}
