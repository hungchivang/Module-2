package bai1;

import java.util.Scanner;

public class Baitap {
    public static String Goiso(int i) {
        String ones = new String();

        switch (i) {
            case 0:
                ones = "khong";
            case 1:
                ones = "mot";
                break;
            case 2:
                ones = "hai";
                break;
            case 3:
                ones = "ba";
                break;
            case 4:
                ones = "bon";
                break;
            case 5:
                ones = "nam";
                break;
            case 6:
                ones = "sau";
                break;
            case 7:
                ones = "bay";
                break;
            case 8:
                ones = "tam";
                break;
            case 9:
                ones = "chin";
                break;
        }
        return ones;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("so nhap vao");
        int number = scanner.nextInt();
        System.out.println(Goiso(number/1000)+"nghin");
        int i = number - ((number/1000)*1000);
        System.out.println(Goiso(i/100)+"tram");
        int j = i - ((i/100)*100);
        System.out.println(Goiso(j/10)+"chuc");
        int k = j-((j/10)*10);
        System.out.println(Goiso(k)+"donvi");


        // Hiển thị lời chào
//        System.out.println("Enter your name :");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hello "+ scanner.nextLine());


        //Ứng dụng chuyển đổi tiền tệ
//        System.out.println("Enter your money (USD) :");
//       Scanner scanner = new Scanner(System.in);
//       int rate = scanner.nextInt();
//        System.out.println(rate + " USD = "+ (rate*23000)+ " VND" );


        //Ứng dụng đọc số thành chữ





   }
}
