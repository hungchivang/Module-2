//package luyentap.bai1;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        FunctionProduct functionProduct = new FunctionProduct();
//        while (true) {
//            System.out.println("Quan ly Product:");
//            System.out.println("1. Add");
//            System.out.println("2. Edit");
//            System.out.println("3. Delete");
//            System.out.println("4. Display");
//            System.out.println("5. Exit");
//            System.out.println("nhap chuc nang  :");
//            int choice = Integer.parseInt(scanner.nextLine());
//            switch (choice) {
//                case 1:
//                    Product product = functionProduct.CreteProduct();
//                    functionProduct.add(product);
//                    break;
//                case 2:
//                    System.out.println("nhap vi tri muon sua :");
//                    int index = Integer.parseInt(scanner.nextLine());
//                    Product productEdit = functionProduct.CreteProduct();
//                    functionProduct.Edit(index, productEdit);
//                    break;
//                case 3:
//                    System.out.println("nhap vi tri muon xoa :");
//                    int indexDelete = Integer.parseInt(scanner.nextLine());
//                    functionProduct.delete(indexDelete);
//                    break;
//                case 4:
//                    functionProduct.display();
//                    break;
//                case 5:
//                    System.exit(0);
//                    break;
//            }
//
//        }
//    }
//}
