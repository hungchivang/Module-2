package bai12.baitap;

import java.util.*;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    List<Product> list = new ArrayList<>();

    public void show() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void add() {
        list.add(CreateProduct());
    }

    public Product CreateProduct() {
        System.out.println("Nhap ID :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten san pham :");
        String name = scanner.nextLine();
        System.out.println("Nhap gia");
        double price = Double.parseDouble(scanner.nextLine());
        return new Product(id, name, price);
    }

    public int CheckID(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void Edit(int id) {
        int index = CheckID(id);
        if (index >= 0) {
            list.set(index, CreateProduct());
            System.out.println("da sua san pham nay");
        } else {
            System.out.println("khong co ID cua san pham nay");
        }
    }

    public void Delete(int id) {
        int index = CheckID(id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("da xoa san pham nay");
        } else {
            System.out.println("khong co ID cua san pham nay");

        }
    }

    public int CheckName(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    public void Search(String name) {
        int index = CheckName(name);
        if (index >= 0) {
            System.out.println(list.get(index).toString());
        } else {
            System.out.println("khong co ten san pham nay ");
        }
    }


    public void CompareByPrice (){
        list.sort(new Compare());
        System.out.println(list);
    }


}


