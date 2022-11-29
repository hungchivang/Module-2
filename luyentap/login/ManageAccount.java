package luyentap.login;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageAccount {
    Scanner scanner = new Scanner(System.in);
    List<Account> accounts = new ArrayList<>();

    public void Register() {
        String username;
        while (true) {
            System.out.println("nhap tai khoan");
            username = scanner.nextLine();
            int index = CheckUsername(username);
            if (index < 0) {
                break;
            } else {
                System.out.println("tai khoan da ton tai");
            }
        }
        System.out.println("nhap mat khau");
        String password = scanner.nextLine();
        accounts.add(new Account(username, password));
    }


    public List<Account> ReadFile() {
        try {
            FileReader fileReader = new FileReader("data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] txt = line.split(";");
                String username = txt[0];
                String password = txt[1];
                accounts.add(new Account(username, password));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
        }
        return accounts;
    }


    public void writeFile(List<Account> accounts) {
        try {
            FileWriter fileWriter = new FileWriter("data.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Account account : accounts) {
                bufferedWriter.write(account.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public int CheckUsername(String username) {
        for (int i = 0; i < accounts.size(); i++) {
            if (username.equals(accounts.get(i).getUsername())) return i;
        }
        return -1;
    }

    public void Login() {
        System.out.println("Nhap tai khoan ");
        String username = scanner.nextLine();
        System.out.println("Nhap mat khau ");
        String password = scanner.nextLine();
        int index = CheckUsername(username);
        if (index >= 0) {
            for (int i = 0; i < accounts.size(); i++) {
                if (password.equals(accounts.get(index).getPassword())) {
                    System.out.println("dang nhap thanh cong");
                    break;
                } else {
                    System.out.println("sai mat khau");
                    retryEnter();
                }
            }
        } else {
            System.out.println("khong co tai khoan nay");
            retryEnter();
        }
    }

    public void retryEnter() {
        System.out.println("1. nhap lai, 2. dang ki moi, 0. Exit");
        int choice = -1;
        while (choice != 0) {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Login();
                    break;
                case 2:
                    Register();
                    break;
                case 0:
                    break;
            }
        }
    }

    public void SetPassword() {
        System.out.println("nhap tai khoan cu");
        System.out.println("Nhap tai khoan ");
        String username = scanner.nextLine();
        System.out.println("Nhap mat khau ");
        String password = scanner.nextLine();
        int index = CheckUsername(username);
        if (index >= 0) {
            for (int i = 0; i < accounts.size(); i++) {
                if (accounts.get(index).getPassword().equals(password)) {
                    System.out.println("Nhap mat khau moi");
                    String newPassword = scanner.nextLine();
                    accounts.add(new Account(username, newPassword));
                    break;
                } else {
                    System.out.println("mat khau  sai");
                }
            }
        } else {
            System.out.println("tai khoan khong ton tai");
        }
    }
}
