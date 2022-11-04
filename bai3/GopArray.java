package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class GopArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr1 = new int[4];
//        System.out.println("nhap tung phan tu trong mang :");
//        for (int i = 0; i < 4; i++) {
//            arr1[i]= sc.nextInt();
//        }
//        System.out.println("mang sau khi khai bao :");
//        System.out.println(Arrays.toString(arr1));

//        int[] arr2 = new int[3];
//        System.out.println("nhap tung phan tu trong mang :");
//        for (int i = 0; i < 3; i++) {
//            arr2[i]= sc.nextInt();
//        }
//        System.out.println("mang sau khi khai bao :");
//        System.out.println(Arrays.toString(arr2));


        int[] arr1 = {2, 9, 4, -8};
        int[] arr2 = {-7, 5, 1};
        int[] newArr = new int[arr1.length + arr2.length];
      System.arraycopy(arr1,0,newArr,0,arr1.length);
        System.arraycopy(arr2,0,newArr,arr1.length,arr2.length);
        System.out.println("mang sau khi gop :");
        System.out.println(Arrays.toString(newArr));

    }
}
