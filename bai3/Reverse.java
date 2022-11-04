package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
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

        int [] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("nhap tung phan tu trong mang :");
            arr[i] = inPut.nextInt();
        }
        System.out.println("Mang ban nhap la :");
        System.out.println(Arrays.toString(arr));

        System.out.println("mang sau khi dao chieu la :");
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
