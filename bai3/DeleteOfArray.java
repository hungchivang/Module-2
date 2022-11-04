package bai3;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 5, 3, 4, 6, 8};
        int[] newArr = new int[arr.length - 1];
        System.out.println("nhap phan tu can xoa :");
        int number = input.nextInt();
        int index = indexOf(arr, number);
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }


    public static int indexOf(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                System.out.println("so can xoa dang o vi tri :" + i);
                return i;
            }
        }
        System.out.println("khong co phan tu nay trong mang");
        return 0;
    }

}
