package luyentap.bai1;


import java.util.Scanner;

public class FunctionProduct {
    Product[] products = new Product[0];

    public void add(Product product) {
        Product[] newArr = new Product[products.length + 1];
        System.arraycopy(products, 0, newArr, 0, products.length);
        newArr[newArr.length - 1] = product;
        products = newArr;
    }

    public void display() {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].show());
        }
    }

    public void delete(int index) {
        if (index>=0){
        Product[] newArr = new Product[products.length - 1];
        for (int i = 0; i < index; i++) {
                newArr[i] = products[i];}

        for (int j=index;j<newArr.length;j++){
            newArr[j] = products[j+1];
        }

        products= newArr;}

        else
            System.out.println("ko co");
    }

    public Product CreteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap name :");
        String name = scanner.nextLine();
        System.out.println("nhap gia :");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap img :");
        String img = scanner.nextLine();
        Product product = new Product(name, price, img);
        return product;
    }



    public void Edit(int index, Product product) {
        if(index >=0 && index< products.length){
            products[index] = product;
        }
    }
}
