package luyentap.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageEmployee manageEmployee = new ManageEmployee();
        while (true) {
            System.out.println("quan ly nhan vien");
            System.out.println("1. them nhan vien");
            System.out.println("2. xoa ten");
            System.out.println("3. sua");
            System.out.println("4. hien thi luong");
            System.out.println("5. hien thi nhan vien");
            System.out.println("chon chuc nang");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("1. Fulltime");
                    System.out.println("2. parttime");
                    System.out.println("chon 1 or 2");
                    int number = Integer.parseInt(scanner.nextLine());
                    if (number == 1) {
                        manageEmployee.addEmployee(manageEmployee.CreteEmployee(true));
                    }
                    if (number == 2) {
                        manageEmployee.addEmployee(manageEmployee.CreteEmployee(false));
                    }
                }
                case 2 -> {
                    System.out.println("nhap ten can xoa");
                    String nameDelete = scanner.nextLine();
                    manageEmployee.delete(nameDelete);
                }
                case 3 -> {
                    System.out.println("nhap ten can sua");
                    String nameEdit = scanner.nextLine();
                    manageEmployee.Edit(nameEdit);
                }
                case 4 -> manageEmployee.tinhluong();
                case 5 -> manageEmployee.show();
                default -> System.exit(0);
            }
        }
    }
}
