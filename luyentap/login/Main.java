package luyentap.login;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageAccount manageAccount = new ManageAccount();
        List<Account> accounts = manageAccount.ReadFile();


        int choice = -1;
        while (choice != 0) {
            System.out.println("chuc nang");
            System.out.println("1. dang nhap");
            System.out.println("2. dang ki");
            System.out.println("3. doi mat khau");
            System.out.println("0. thoat");
            System.out.println("chon chuc nang");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    manageAccount.Login();
                    break;
                case 2:
                    manageAccount.Register();
                    break;
                case 3:
                    manageAccount.SetPassword();
                    break;
                case 0:
                    manageAccount.writeFile(accounts);
                    break;

            }
        }
    }
}
