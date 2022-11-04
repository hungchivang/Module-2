package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class CountPointOfStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("nhap so phan tu cua mang");
            number = sc.nextInt();
            if (number > 30) {
                System.out.println("vuot qua so sinh vien");
            }
        } while (number > 30);

        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap so diem cua moi hs");
            do {
                arr[i] = sc.nextInt();
                if (arr[i] <0 || arr[i] >10) {
                    System.out.println("yeu cau nhap lai");
                }
            }while (arr[i] <0 || arr[i] >10);
        }
        System.out.println("mang diem sau khi nhap");
        System.out.println(Arrays.toString(arr));

        int count = 0;
        for (int j : arr) {
            if (j > 5 && j <= 10) {
                count++;
            }
        }
        System.out.println("so luong hs do la :" + count);
    }
}
