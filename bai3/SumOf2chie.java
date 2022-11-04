package bai3;

import java.util.Scanner;

public class SumOf2chie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];


        System.out.println("nhap cac phan tu trong mang :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("nhap phan tu thu [" + i + "," + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("mang vua nhap la ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("  " + arr[i][j] + "  ");
            }
            System.out.println("\n");
        }

        int sum=0;
        System.out.println("nhap cot can tinh tong");
        int cot= sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][cot];
        }
        System.out.println("tong cua cot can tinh la :" + sum);
    }
}
