package luyentap.nhanvien;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args){
        ManageEmployee manageEmployee = new ManageEmployee();

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chuc nang quan ly nhan vien");
            System.out.println("1. Them");
            System.out.println("2. Sua");
            System.out.println("3. Xoa");
            System.out.println("4. Hien thi");
            System.out.println("5. Tim kiem");
            System.out.println("6. Sap xep");
            System.out.println("7. Tim 3 nhan vien luong cao nhat");
            System.out.println("8. Tim nhan vien co sinh nhat trong thang");
            System.out.println("chon chuc nang :");
            int choice;
            do{
                try{
                    choice = parseInt(scanner.nextLine());
                    break;
                }catch (InputMismatchException | NumberFormatException e){
                    System.out.println("phai nhap so");
                }
            }while (true);

            switch (choice){
                case 1:
                    manageEmployee.add();
                    break;
                case 2:
                    System.out.println("Nhap id can sua");
                    int idEdit = manageEmployee.validateInt();
                    manageEmployee.Edit(idEdit);
                    break;
                case 3:
                    System.out.println("Nhap id can sua");
                    int idDelete = manageEmployee.validateInt();
                    manageEmployee.Delete(idDelete);
                    break;
                case 4:
                    manageEmployee.show();
                    break;
                case 5:
                    System.out.println("Nhap ten nhan vien can tim :");
                    String name = scanner.nextLine();
                    manageEmployee.SearchName(name);
                    break;
                case 6:
                    manageEmployee.CompareByName();
                    break;
                case 7:
                    manageEmployee.SearchBySalary();
                    break;
                case 8:
                    manageEmployee.SearchBirthDay();
                    break;
                default:
                    System.out.println("yeu cau chon lai");
            }
        }
    }
}
