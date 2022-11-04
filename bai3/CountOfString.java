package bai3;

import java.util.Scanner;

public class CountOfString {
    public static void main(String[] args) {
        String name = "hom nay la thu 2";
        int count = 0;
        char kitu = 'a';

        for (int i = 0; i < name.length(); i++) {
            if (kitu == name.charAt(i)) {
                count++;
            }
        }
        System.out.println("ki tu " + kitu + " xuat hien :" + count + " lan");
    }
}
