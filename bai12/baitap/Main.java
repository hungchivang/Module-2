package bai12.baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chuc nang quan ly san pham");
            System.out.println("1. Them");
            System.out.println("2. Sua");
            System.out.println("3. Xoa");
            System.out.println("4. Hien thi");
            System.out.println("5. Tim kiem");
            System.out.println("6. Sap xep");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productManager.add();
                    break;
                case 2:
                    System.out.println("nhap id muon sua");
                    int idEdit = scanner.nextInt();
                    productManager.Edit(idEdit);
                    break;
                case 3:
                    System.out.println("nhap id muon xoa");
                    int idDelete = scanner.nextInt();
                    productManager.Delete(idDelete);
                    break;
                case 4:
                    productManager.show();
                    break;
                case 5:
                    System.out.println("Nhap ten san pham :");
                    String name = scanner.nextLine();
                    productManager.Search(name);
                    break;
                case 6:
                    productManager.CompareByPrice();
                    break;
                default:
                    System.exit(0);
            }
        }

    }
}
