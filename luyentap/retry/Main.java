package luyentap.retry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        NhanVien[] nhanViens = new NhanVien[3];
//        nhanViens[0] = new NhanVien("hung", 20, "nam");
//        nhanViens[1] = new NhanVien("thanh", 23, "nam");
//        nhanViens[2] = new NhanVien("tuong", 25, "nu");

        ManegeNhanVien manegeNhanVien = new ManegeNhanVien();
        while (true) {
            System.out.println("quan li nhan vien");
            System.out.println("1. them nhan vien");
            System.out.println("2. sua nhan vien");
            System.out.println("3. xoa nhan vien");
            System.out.println("4. hien thi nhan vien");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
//                    nhanViens = manegeNhanVien.CreateNhanVien(nhanViens);
                    break;
                case 2:
//                    System.out.println("nhap ten can sua");
//                    String nameEdit = scanner.nextLine();
//                    nhanViens = manegeNhanVien.Edit(nameEdit, manegeNhanVien.CreateNhanVien(nhanViens));
                    break;
                case 3:
                    System.out.println("nhap ten can xoa");
                    String nameDelete = scanner.nextLine();
//                    nhanViens = manegeNhanVien.delete(nameDelete);
                    break;
                case 4:
//                    manegeNhanVien.show(nhanViens);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
