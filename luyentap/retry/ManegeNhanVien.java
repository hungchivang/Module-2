package luyentap.retry;

import java.util.Scanner;

public class ManegeNhanVien {

    NhanVien[] nhanViens = new NhanVien[0];
    Scanner scanner = new Scanner(System.in);

    public void show(NhanVien[] nhanViens) {
        for (int i = 0; i < nhanViens.length; i++) {
            System.out.println(nhanViens[i].toString());
        }
    }

    public NhanVien[] CreateNhanVien(NhanVien[] nhanViens) {
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap tuoi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap gioi tinh");
        String gender = scanner.nextLine();
        NhanVien nhanVien = new NhanVien(name, age, gender);
        NhanVien[] newNhanVien = new NhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            newNhanVien[i] = nhanViens[i];
        }
        newNhanVien[newNhanVien.length - 1] = nhanVien;
        return newNhanVien;
    }



    public int findnNhanVien(String name) {
        for (int i = 0; i < nhanViens.length; i++) {
            if (name.equals(nhanViens[i].getName())) ;
            return i;
        }
        return -1;
    }

    public NhanVien[] delete(NhanVien[] nhanViens) {
        System.out.println("nhap vi tri can xoa");
        int index = scanner.nextInt();
        NhanVien[] newNhanVien = new NhanVien[nhanViens.length - 1];
        if (index != -1) {
            for (int i = 0; i < newNhanVien.length; i++) {
                if (i < index) {
                    newNhanVien[i] = nhanViens[i];
                } else {
                    newNhanVien[i] = nhanViens[i + 1];
                }
            }

        }
        return nhanViens;
    }

    public NhanVien[] Edit(String name, NhanVien nhanVien) {
        int index = findnNhanVien(name);
        for (int i = 0; i < nhanViens.length; i++) {
            nhanViens[index] = nhanVien;
        }
        return nhanViens;
    }
}
