package bai2;

import java.util.Scanner;

public class Rate {
    public static void main(String[] args) {

        //Ứng dụng tính tiền lãi cho vay
//        Scanner inPut = new Scanner(System.in);
//        System.out.println("Nhap so luong tien cho vay :");
//        float money = inPut.nextFloat();
//        System.out.println("Nhap ti le lai suat :");
//        float rates = inPut.nextFloat();
//        System.out.println("Nhap so thang cho vay :");
//        int month = inPut.nextInt();
//        float total = 0;
//        for (int i = 0; i < month; i++) {
//            total += money * ((rates / 100) / 12) * month;
//        }
//        System.out.println("so tien lai la :" + total);

        //nhap n tu ban phim,in ra cac so chia het cho 3 trong khong tu 1 den n
//        Scanner inPut = new Scanner(System.in);
//        System.out.println("Nhap so n :");
//        int n = inPut.nextInt();
//        for (int i = 1; i <= n; i++) {
//            if (i % 3 ==0) {
//                System.out.println(i);
//            }
//        }

        //Nhap vao cac so nguyen bat ki,nhap cho den khi nhap vao so 0 thi dung lai.
        // o moi lan nhap,kiem tra so vua nhap co phai so nguyen to khong.
        Scanner inPut = new Scanner(System.in);
        System.out.println("Nhap so n bat ki :");
        while (true) {
            int number = inPut.nextInt();
            if (number == 0) {
                System.exit(0);
            }
            else if (number < 2) {
                System.out.println(number + " khong la so nguyen to");
            } else {
                boolean check = true;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println(number + " la so nguyen to");
                } else {
                    System.out.println(number + " khong la so nguyen to");
                }
            }
        }
    }
}
