package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class ThemOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 8, 7};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gia tri can chen :");
        int x = sc.nextInt();
        System.out.println("nhap vi tri can chen :");
        int index = sc.nextInt();
        int[] newArr = new int[arr.length+1];
        if (index < 0 || index > arr.length-1) {
            newArr = arr;
        }
        for (int i = 0; i < newArr.length; i++) {
            if (i<index) {
                newArr[i]=arr[i];
            } else if (i == index) {
                newArr[i] = x;
            }else {
                newArr[i] = arr[i-1];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
