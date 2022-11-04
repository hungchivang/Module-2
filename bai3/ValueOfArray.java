package bai3;

import java.util.Scanner;

public class ValueOfArray {
    public static void main(String[] args) {
        String[] array = {"hung","phuong","nam","huy"};
        Scanner inPut = new Scanner(System.in);
        System.out.println("nhap ten bat ki :");
        String name = inPut.nextLine();
        boolean isName = true;
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i])) {
                System.out.println("ten trong mang o vi tri :"+ i);
                isName=false;
                break;
            }
        }
        if (isName) {
            System.out.println("khong co ten nay trong mang");
        }
    }
}
