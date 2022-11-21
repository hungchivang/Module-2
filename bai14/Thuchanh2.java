package bai14;

import java.util.Scanner;

public class Thuchanh2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong phan tu");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("nhap cac phan tu tron list");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.println("LIST ban da nhap");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "\t");

        }
        System.out.println("\nBegin sort processing...");
        bubbleSort(list);

    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("list sau khi sap xep");
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
