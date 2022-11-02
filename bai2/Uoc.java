package bai2;

import java.util.Scanner;

public class Uoc {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        System.out.println("nhap so nguyen a :");
        int a = inPut.nextInt();
        System.out.println("nhap so nguyen b :");
        int b = inPut.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("khong co uoc so chung");
        } else if (a != 0 && b == 0) {
            System.out.println("uoc so chung la :" + Math.abs(a));
        } else if (a == 0) {
            System.out.println("uoc so chung la :" + Math.abs(b));
        } else {
            int uoc = 1;
            for (int i = 1; i < a && i < b; i++) {
                if ((a % i == 0) && (b % i == 0)) {
                    uoc = i;
                }
            }
            System.out.println("UOC chung lon nhat la :" + uoc);
        }
    }
}




