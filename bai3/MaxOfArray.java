package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        int number;
        do {
            System.out.println("nhap so phan tu trong mang :");
            number = inPut.nextInt();
            if (number > 20) {
                System.out.println("phan tu vuot qua mang");
            }
        } while (number > 20);

        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("nhap tung phan tu trong mang :");
            arr[i] = inPut.nextInt();
        }
        System.out.println("Mang ban nhap la :");
        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("phan tu lon nhat cua mang la :" + max);
    }
}
