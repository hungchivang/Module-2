package bai3;

import java.util.Scanner;

public class Max2chie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[2];

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
        int max = arr[0][0];
        int index1 = 0 ;
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("phan tu lon nhat trong mang la: "+ max);
        System.out.println("nam o vi tri i :" + index1 + " va j: "+ index2);
    }
}
