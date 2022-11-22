package bai15;

import java.util.Scanner;

public class IllegalTriangle extends Throwable {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap canh a");
        double a = validate();
        System.out.println("Nhap canh b");
        double b = validate();
        System.out.println("Nhap canh c");
        double c = validate();
        if (a + b > c && a + c > b && c + b > a){
            System.out.println("3 canh la tam giac");
        }else {
            System.out.println("khong phai tam giac");
        }
    }

    public static double validate() {
        try {
            double number = Double.parseDouble(scanner.nextLine());
            if (number > 0) return number;
            throw new Exception();
        } catch (Exception e) {
            System.out.println("nhap lai so > 0");
            return validate();
        }
    }
}
