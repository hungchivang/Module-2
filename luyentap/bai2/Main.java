package luyentap.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageEmployee manageEmployee =new ManageEmployee();
        System.out.println("quan ly nhan vien");
        System.out.println("1. them nhan vien");
        System.out.println("2. xoa ten");
        System.out.println("3. hien thi luong");
        System.out.println("4. hien thi nhan vien");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("Chon loai nhan vien" +
                        "1. Part time" +
                        "2. Full time");
                int num = Integer.parseInt(scanner.nextLine());
                switch (num){
                    case 1:
                        PartTIme nhanVienParttime = manageEmployee.CreteEmployeePartTime();
                        manageEmployee.addPartTime(nhanVienParttime );
                        break;
                    case 2:
                        FullTime nhanVienFullTime = manageEmployee.CreteEmployeeFullTime();
                        manageEmployee.addFullTime(nhanVienFullTime);
                        break;
                }
                break;
            case 2:

            case 3:

            case 4:



        }
    }
}
